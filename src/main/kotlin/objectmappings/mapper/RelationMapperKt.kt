package objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.datatransferobject.RelationDTO
import io.saisuryak.lab.objectmappings.model.domainobject.RelationDO

object RelationMapperKt {
    @JvmStatic
    fun mapRelationsDOToRelationsDTO(relationsDO: List<RelationDO>): List<RelationDTO> {
        return relationsDO.map(RelationMapperKt::relationDOToRelationDTO)
    }

    fun relationDOToRelationDTO(relationDO: RelationDO): RelationDTO {
        return with(relationDO) {
            RelationDTO(name, type.toString())
        }
    }
}
