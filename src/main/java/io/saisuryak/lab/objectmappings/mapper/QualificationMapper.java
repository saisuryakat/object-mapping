package io.saisuryak.lab.objectmappings.mapper;

import io.saisuryak.lab.objectmappings.model.datatransferobject.QualificationDTO;
import io.saisuryak.lab.objectmappings.model.domainobject.QualificationDO;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class QualificationMapper {

    public static QualificationDTO qualificationDOToQualificationDTO(QualificationDO
                                                                             qualificationDO) {
        QualificationDTO qualificationDTO = new QualificationDTO();
        qualificationDTO.setName(qualificationDO.getName());
        qualificationDTO.setType(qualificationDO.getType().toString());
        qualificationDTO.setFromYear(qualificationDO.getFromYear());
        qualificationDTO.setToYear(qualificationDO.getToYear());
        return qualificationDTO;
    }

    public static List<QualificationDTO> mapQualificationsDOToQualificationsDTO
            (List<QualificationDO> qualificationDO) {
        return qualificationDO.stream().map
                (QualificationMapper::qualificationDOToQualificationDTO)
                .collect(toList());
    }
}
