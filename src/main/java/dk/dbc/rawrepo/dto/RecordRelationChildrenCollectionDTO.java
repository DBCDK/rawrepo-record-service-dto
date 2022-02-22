package dk.dbc.rawrepo.dto;

import java.util.List;
import java.util.Objects;

public class RecordRelationChildrenCollectionDTO {
    private List<RecordRelationChildrenDTO> recordRelationChildrenList;

    public List<RecordRelationChildrenDTO> getRecordRelationChildrenList() {
        return recordRelationChildrenList;
    }

    public void setRecordRelationChildrenList(List<RecordRelationChildrenDTO> recordRelationChildrenList) {
        this.recordRelationChildrenList = recordRelationChildrenList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordRelationChildrenCollectionDTO that = (RecordRelationChildrenCollectionDTO) o;
        return Objects.equals(recordRelationChildrenList, that.recordRelationChildrenList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordRelationChildrenList);
    }

    @Override
    public String toString() {
        return "RecordRelationChildrenCollectionDTO{" +
                "recordRelationChildrenList=" + recordRelationChildrenList +
                '}';
    }
}
