package objectmappings.mapper.orika;

import io.saisuryak.lab.objectmappings.model.datatransferobject.PersonDTO;
import io.saisuryak.lab.objectmappings.model.domainobject.PersonDO;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class PersonOrikaMapper {

    private static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private static MapperFacade getPersonMapper() {
        mapperFactory.classMap(PersonDO.class, PersonDTO.class)
                .field("genderDO", "gender")
                .field("addressDO", "address")
                .field("contactsDO", "contactsDTO")
                .field("qualificationsDO", "qualificationsDTO")
                .field("nationalityDO", "nationality")
                .field("relationsDO", "relationsDTO")
                .exclude("dob")
                .byDefault()
                .register();
        return mapperFactory.getMapperFacade();
    }

    public static PersonDTO mapPersonDoToPersonDTO(PersonDO personDO) {
        MapperFacade personMapper = getPersonMapper();
        return personMapper.map(personDO, PersonDTO.class);

    }


}
