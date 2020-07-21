/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.rawrepo.dto;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RecordCollectionDTO {

    private List<RecordDTO> records;

    public List<RecordDTO> getRecords() {
        return records;
    }

    public void setRecords(List<RecordDTO> records) {
        this.records = records;
    }

    public HashMap<String, RecordDTO> toMap() {
        return records.stream()
                .collect(
                        Collectors.toMap(
                                record -> record.getRecordId().getBibliographicRecordId(),
                                record -> record,
                                (first, second) -> second,
                                HashMap::new));
    }
}
