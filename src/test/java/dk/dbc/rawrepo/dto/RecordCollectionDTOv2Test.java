/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.rawrepo.dto;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RecordCollectionDTOv2Test {

    @Test
    void emptyCollectionTest() {
        final RecordCollectionDTOv2 recordCollectionDTO = new RecordCollectionDTOv2();

        assertThat(recordCollectionDTO.isFound(new RecordIdDTO("Hejsa", 870970)), is(false));
    }

    @Test
    void collectionWithRecordsTest() {
        final RecordDTO record1 = new RecordDTO();
        record1.setRecordId(new RecordIdDTO("record1", 870970));
        final RecordDTO record2 = new RecordDTO();
        record2.setRecordId(new RecordIdDTO("record2", 870970));

        final RecordCollectionDTOv2 recordCollectionDTO = new RecordCollectionDTOv2();
        recordCollectionDTO.getFound().add(record1);
        recordCollectionDTO.getFound().add(record2);

        assertThat(recordCollectionDTO.isFound(new RecordIdDTO("record1", 870970)), is(true));
        assertThat(recordCollectionDTO.isFound(new RecordIdDTO("record2", 870970)), is(true));
        assertThat(recordCollectionDTO.isFound(new RecordIdDTO("record3", 870970)), is(false));
    }
}
