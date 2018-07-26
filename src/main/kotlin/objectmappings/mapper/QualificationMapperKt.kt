package io.saisuryak.lab.objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.datatransferobject.QualificationDTO
import io.saisuryak.lab.objectmappings.model.domainobject.QualificationDO

import java.util.stream.Collectors.toList

object QualificationMapperKt {

    fun qualificationDOToQualificationDTO(qualificationDO: QualificationDO): QualificationDTO {
        val qualificationDTO = QualificationDTO()
        qualificationDTO.name = qualificationDO.name
        qualificationDTO.type = qualificationDO.type.toString()
        qualificationDTO.fromYear = qualificationDO.fromYear
        qualificationDTO.toYear = qualificationDO.toYear
        return qualificationDTO
    }

    fun mapQualificationsDOToQualificationsDTO(qualificationDO: List<QualificationDO>): List<QualificationDTO> {
        return qualificationDO.stream().map(QualificationMapperKt::qualificationDOToQualificationDTO)
                .collect(toList())
    }
}
