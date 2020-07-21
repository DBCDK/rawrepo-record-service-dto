#!groovy

def workerNode = "devel10"

pipeline {
    agent {label workerNode}

    options {
        timestamps()
    }

    triggers {
        pollSCM('H/20 * * * *')
    }

    stages {
        stage('Clear workspace') {
            steps {
                deleteDir()
                checkout scm
            }
        }

        stage('Build DTO artifact') {
            steps {
                script {
                    sh """ 
                            mvn clean
                            mvn install
                        """
                }
            }
        }

        stage('Warnings') {
            steps {
                warnings consoleParsers: [
                        [parserName: "Java Compiler (javac)"],
                        [parserName: "JavaDoc Tool"]
                ],
                        unstableTotalAll: "0",
                        failedTotalAll: "0"
            }
        }

        stage('PMD') {
            steps {
                step([
                        $class          : 'hudson.plugins.pmd.PmdPublisher',
                        pattern         : '**/target/pmd.xml',
                        unstableTotalAll: "0",
                        failedTotalAll  : "0"
                ])
            }
        }

        stage('Upload to mavenrepo') {
            steps {
                script {
                    sh """ 
                            mvn jar:jar deploy:deploy
                        """
                }
            }
        }

    }
}