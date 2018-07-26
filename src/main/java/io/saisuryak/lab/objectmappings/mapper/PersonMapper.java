package io.saisuryak.lab.objectmappings.mapper;

import io.saisuryak.lab.objectmappings.model.datatransferobject.PersonDTO;
import io.saisuryak.lab.objectmappings.model.domainobject.PersonDO;

import static io.saisuryak.lab.objectmappings.mapper.AddressMapper.mapAddressDOToAddressDTO;
import static io.saisuryak.lab.objectmappings.mapper.ContactMapper.mapContactsDOToContactsDTO;
import static io.saisuryak.lab.objectmappings.mapper.QualificationMapper.mapQualificationsDOToQualificationsDTO;
import static io.saisuryak.lab.objectmappings.mapper.RelationMapper.mapRelationsDOToRelationsDTO;

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
                .getQualificationDOS()));
        personDTO.setHobbies(personDO.getHobbies());
        personDTO.setNationality(personDO.getNationalityDO().toString());
        personDTO.setFatherName(personDO.getFatherName());
        personDTO.setMotherName(personDO.getMotherName());
        personDTO.setRelationDTOS(mapRelationsDOToRelationsDTO(personDO.getRelationDOS()));
        return personDTO;

    }


}
