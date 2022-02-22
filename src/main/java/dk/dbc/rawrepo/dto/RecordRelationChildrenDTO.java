package dk.dbc.rawrepo.dto;

import java.util.List;
import java.util.Objects;

public class RecordRelationChildrenDTO {
    private RecordIdDTO recordIdDTO;
    private List<RecordIdDTO> children;

    public RecordIdDTO getRecordIdDTO() {
        return recordIdDTO;
    }

    public void setRecordIdDTO(RecordIdDTO recordIdDTO) {
        this.recordIdDTO = recordIdDTO;
    }

    public List<RecordIdDTO> getChildren() {
        return children;
    }

    public void setChildren(List<RecordIdDTO> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordRelationChildrenDTO that = (RecordRelationChildrenDTO) o;
        return Objects.equals(recordIdDTO, that.recordIdDTO) && Objects.equals(children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordIdDTO, children);
    }

    @Override
    public String toString() {
        return "RecordRelationChildrenDTO{" +
                "recordIdDTO=" + recordIdDTO +
                ", children=" + children +
                '}';
    }
}
