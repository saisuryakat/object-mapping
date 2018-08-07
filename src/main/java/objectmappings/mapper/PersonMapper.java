package objectmappings.mapper;

import io.saisuryak.lab.objectmappings.model.datatransferobject.PersonDTO;
import io.saisuryak.lab.objectmappings.model.domainobject.PersonDO;

import static objectmappings.mapper.AddressMapper.mapAddressDOToAddressDTO;
import static objectmappings.mapper.ContactMapper.mapContactsDOToContactsDTO;
import static objectmappings.mapper.QualificationMapper.mapQualificationsDOToQualificationsDTO;
import static objectmappings.mapper.RelationMapper.mapRelationsDOToRelationsDTO;

public class PersonMapper {

    public static PersonDTO mapPersonDOToPersonDTO(PersonDO personDO) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(personDO.getId());
        personDTO.setName(personDO.getFirstName() + personDO.getMiddleName() + personDO.getLastName());
        personDTO.setAge(personDO.getAge());
        personDTO.setIdentifierNumber(personDO.getIdentifierNumber());
        personDTO.setGender(personDO.getGenderDO().toString());
        personDTO.setAddress(mapAddressDOToAddressDTO(personDO.getAddressDO()));
        personDTO.setContacts(mapContactsDOToContactsDTO(personDO.getContacts()));
        personDTO.setDob(personDO.getDob());
        personDTO.setQualificationDTOS(mapQualificationsDOToQualificationsDTO(personDO
                .getQualificationsDO()));
        personDTO.setHobbies(personDO.getHobbies());
        personDTO.setNationality(personDO.getNationalityDO().toString());
        personDTO.setFatherName(personDO.getFatherName());
        personDTO.setMotherName(personDO.getMotherName());
        personDTO.setRelationDTOS(mapRelationsDOToRelationsDTO(personDO.getRelationsDO()));
        return personDTO;

    }


}
