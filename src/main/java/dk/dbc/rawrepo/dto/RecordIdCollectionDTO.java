/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.rawrepo.dto;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RecordIdCollectionDTO {
    private List<RecordIdDTO> recordIds;

    public List<RecordIdDTO> getRecordIds() {
        return recordIds;
    }

    public void setRecordIds(List<RecordIdDTO> recordIds) {
        this.recordIds = recordIds;
    }

    /**
     * Convert to sorted (by agency / bibliographicRecordId) array
     *
     * @return sorted array
     */
    public RecordIdDTO[] toArray() {
        return recordIds.stream()
                .sorted()
                .toArray(RecordIdDTO[]::new);
    }
}
