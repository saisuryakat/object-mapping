package objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.datatransferobject.QualificationDTO
import io.saisuryak.lab.objectmappings.model.domainobject.QualificationDO

object QualificationMapperKt {
    @JvmStatic
    fun qualificationDOToQualificationDTO(qualificationDO: QualificationDO): QualificationDTO {
        return QualificationDTO().apply {
            name = qualificationDO.name
            type = qualificationDO.type.toString()
            fromYear = qualificationDO.fromYear
            toYear = qualificationDO.toYear
        }
    }

    fun mapQualificationsDOToQualificationsDTO(qualificationDO: List<QualificationDO>): List<QualificationDTO> {
        return qualificationDO.map(QualificationMapperKt::qualificationDOToQualificationDTO)
    }
}
