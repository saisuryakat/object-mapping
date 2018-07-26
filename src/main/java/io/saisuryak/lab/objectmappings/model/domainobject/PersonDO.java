package io.saisuryak.lab.objectmappings.model.domainobject;

import java.time.Instant;
import java.util.List;

public class PersonDO {

    private long id;

    private String firstName;

    private String lastName;

    private String middleName;

    private String age;

    private String identifierNumber;

    private GenderDO genderDO;

    private AddressDO addressDO;

    private List<ContactInfoDO> contacts;

    private Instant dob;

    private List<QualificationDO> qualificationDOS;

    private List<String> hobbies;

    private NationalityDO nationalityDO;

    private String fatherName;

    private String motherName;

    private List<RelationDO> relationDOS;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdentifierNumber() {
        return identifierNumber;
    }

    public void setIdentifierNumber(String identifierNumber) {
        this.identifierNumber = identifierNumber;
    }

    public GenderDO getGenderDO() {
        return genderDO;
    }

    public void setGenderDO(GenderDO genderDO) {
        this.genderDO = genderDO;
    }

    public AddressDO getAddressDO() {
        return addressDO;
    }

    public void setAddressDO(AddressDO addressDO) {
        this.addressDO = addressDO;
    }

    public List<ContactInfoDO> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactInfoDO> contacts) {
        this.contacts = contacts;
    }

    public Instant getDob() {
        return dob;
    }

    public void setDob(Instant dob) {
        this.dob = dob;
    }

    public List<QualificationDO> getQualificationDOS() {
        return qualificationDOS;
    }

    public void setQualificationDOS(List<QualificationDO> qualificationDOS) {
        this.qualificationDOS = qualificationDOS;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public NationalityDO getNationalityDO() {
        return nationalityDO;
    }

    public void setNationalityDO(NationalityDO nationalityDO) {
        this.nationalityDO = nationalityDO;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public List<RelationDO> getRelationDOS() {
        return relationDOS;
    }

    public void setRelationDOS(List<RelationDO> relationDOS) {
        this.relationDOS = relationDOS;
    }
}
