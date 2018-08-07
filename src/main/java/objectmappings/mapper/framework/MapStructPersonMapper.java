package objectmappings.mapper.framework;

import io.saisuryak.lab.objectmappings.model.datatransferobject.PersonDTO;
import io.saisuryak.lab.objectmappings.model.domainobject.PersonDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructPersonMapper {

    MapStructPersonMapper INSTANCE = Mappers.getMapper(MapStructPersonMapper.class);

    @Mappings({
            @Mapping(source = "genderDO", target = "gender"),
            @Mapping(source = "contactsDO", target = "contactsDTO"),
            @Mapping(source = "qualificationsDO", target = "qualificationsDTO"),
            @Mapping(source = "nationalityDO", target = "nationality"),
            @Mapping(source = "relationsDO", target = "relationsDTO"),
            @Mapping(target = "name", expression = "java(personDO.getFirstName()+\" \"+personDO.getMiddleName()+\" \"+personDO.getLastName())"),
            @Mapping(target = "address", expression = "java(personDO.getAddressDO().getHouseNumber()+\" \"+personDO.getAddressDO().getZipCode())")
    })
    PersonDTO mapPersonDOToPersonDTO(PersonDO personDO);
}
