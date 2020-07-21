/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.rawrepo.dto;

import java.util.Objects;

public class RecordIdDTO implements Comparable<RecordIdDTO>{

    private String bibliographicRecordId;
    private int agencyId;

    // Need default constructor as there is another constructor
    public RecordIdDTO() {
    }

    public RecordIdDTO(String bibliographicRecordId, int agencyId) {
        this.bibliographicRecordId = bibliographicRecordId;
        this.agencyId = agencyId;
    }

    public String getBibliographicRecordId() {
        return bibliographicRecordId;
    }

    public void setBibliographicRecordId(String bibliographicRecordId) {
        this.bibliographicRecordId = bibliographicRecordId;
    }

    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    @Override
    public String toString() {
        return "RecordIdDTO{" +
                "bibliographicRecordId='" + bibliographicRecordId + '\'' +
                ", agencyId=" + agencyId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordIdDTO that = (RecordIdDTO) o;
        return agencyId == that.agencyId &&
                Objects.equals(bibliographicRecordId, that.bibliographicRecordId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bibliographicRecordId, agencyId);
    }

    @Override
    public int compareTo(RecordIdDTO other) {
        int ret = Integer.compare(agencyId, other.agencyId);
        if (ret == 0)
            ret = bibliographicRecordId.compareTo(other.bibliographicRecordId);
        return ret;
    }
}
