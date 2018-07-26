package io.saisuryak.lab.objectmappings.mapper;

import io.saisuryak.lab.objectmappings.model.datatransferobject.RelationDTO;
import io.saisuryak.lab.objectmappings.model.domainobject.RelationDO;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class RelationMapper {

    public static List<RelationDTO> mapRelationsDOToRelationsDTO(List<RelationDO>
                                                                         relationsDO) {
        return relationsDO.stream().map(RelationMapper::relationDOToRelationDTO).collect
                (toList());
    }

    private static RelationDTO relationDOToRelationDTO(RelationDO relationDO) {
        return new RelationDTO(relationDO.getName(), relationDO
                .getType().toString());
    }
}
