/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.rawrepo.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RecordCollectionDTOv2 {
    private List<RecordDTO> found;
    private List<RecordIdDTO> missing;

    public RecordCollectionDTOv2() {
        this.found = new ArrayList<>();
        this.missing = new ArrayList<>();
    }

    public List<RecordDTO> getFound() {
        return found;
    }

    public void setFound(List<RecordDTO> found) {
        this.found = found;
    }

    public List<RecordIdDTO> getMissing() {
        return missing;
    }

    public void setMissing(List<RecordIdDTO> missing) {
        this.missing = missing;
    }

    public boolean isFound(RecordIdDTO recordIdDTO) {
        return found.stream().anyMatch(
                record -> recordIdDTO.equals(record.getRecordId()));
    }

    public HashMap<String, RecordDTO> toMap() {
        return found.stream()
                .collect(
                        Collectors.toMap(
                                record -> record.getRecordId().getBibliographicRecordId(),
                                record -> record,
                                (first, second) -> second,
                                HashMap::new));
    }
}
