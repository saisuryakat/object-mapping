package exec;

import io.saisuryak.lab.objectmappings.model.datatransferobject.PersonDTO;
import io.saisuryak.lab.objectmappings.model.domainobject.*;
import objectmappings.mapper.PersonMapperKt;
import objectmappings.mapper.orika.PersonOrikaMapper;

import java.time.Instant;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        //================================================
        AddressDO addressDO = new AddressDO();
        addressDO.setHouseNumber("1A");
        addressDO.setAddressLine1("Street Quechua");
        addressDO.setAddressLine2("Area Signo");
        addressDO.setState("Corvus");
        addressDO.setCountry("Peaceful");
        addressDO.setZipCode("1234567");
        //=================================================
        ContactInfoDO contactDO1 = new ContactInfoDO();
        contactDO1.setType(ContactTypeDO.EMAIL);
        contactDO1.setValue("abc@xyz.com");
        contactDO1.setActive(true);
        ContactInfoDO contactDO2 = new ContactInfoDO();
        contactDO2.setType(ContactTypeDO.FIXEDLINB);
        contactDO2.setValue("+1 0923423434");
        contactDO2.setActive(false);
        List<ContactInfoDO> contactsDO = asList(contactDO1, contactDO2);
        //=================================================
        RelationDO relationDO1 = new RelationDO();
        relationDO1.setName("XYZ");
        relationDO1.setType(RelationTypeDO.BROTHER);
        RelationDO relationDO2 = new RelationDO();
        relationDO2.setName("WUV");
        relationDO2.setType(RelationTypeDO.SISTER);
        List<RelationDO> relationsDO = asList(relationDO1, relationDO2);
        //=================================================
        QualificationDO qualificationDO1 = new QualificationDO();
        qualificationDO1.setName("ABC");
        qualificationDO1.setType(QualificationTypeDO.SCHOOLING);
        qualificationDO1.setFromYear("2000");
        qualificationDO1.setToYear("2010");
        //=================================================
        PersonDO personDO = new PersonDO();
        personDO.setId(1L);
        personDO.setFirstName("Corvus");
        personDO.setMiddleName("aura");
        personDO.setLastName("Signo");
        personDO.setAge("24");
        personDO.setGenderDO(GenderDO.MALE);
        personDO.setDob(Instant.EPOCH);
        personDO.setFatherName("ESport");
        personDO.setMotherName("Logi");
        personDO.setContactsDO(contactsDO);
        personDO.setAddressDO(addressDO);
        personDO.setHobbies(asList("Reading", "Writing"));
        personDO.setIdentifierNumber("1234567890");
        personDO.setNationalityDO(NationalityDO.ENGLISH);
        personDO.setQualificationsDO(asList(qualificationDO1));
        personDO.setRelationsDO(relationsDO);
        PersonDTO personDTO = PersonMapperKt.mapPersonDOToPersonDTO(personDO);
        System.out.println(personDTO);
        PersonDTO personDTOOrika = PersonOrikaMapper.mapPersonDoToPersonDTO(personDO);
        System.out.println(personDTOOrika);

    }
}
