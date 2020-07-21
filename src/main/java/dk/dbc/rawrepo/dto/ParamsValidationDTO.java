/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.rawrepo.dto;

import java.util.List;

public class ParamsValidationDTO {

    private List<ParamsValidationItemDTO> errors;

    public List<ParamsValidationItemDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<ParamsValidationItemDTO> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "ParamsValidation{" +
                "errors=" + errors +
                '}';
    }
}
