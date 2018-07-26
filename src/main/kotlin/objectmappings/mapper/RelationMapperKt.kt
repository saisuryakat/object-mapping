package objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.datatransferobject.RelationDTO
import io.saisuryak.lab.objectmappings.model.domainobject.RelationDO

import java.util.stream.Collectors.toList

object RelationMapperKt {

    fun mapRelationsDOToRelationsDTO(relationsDO: List<RelationDO>): List<RelationDTO> {
        return relationsDO.stream().map(RelationMapperKt::relationDOToRelationDTO).collect(toList())
    }

    fun relationDOToRelationDTO(relationDO: RelationDO): RelationDTO {
        return RelationDTO(relationDO.name, relationDO
                .type.toString())
    }
}
