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

    private List<ContactInfoDO> contactsDO;

    private Instant dob;

    private List<QualificationDO> qualificationsDO;

    private List<String> hobbies;

    private NationalityDO nationalityDO;

    private String fatherName;

    private String motherName;

    private List<RelationDO> relationsDO;

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

    public List<ContactInfoDO> getContactsDO() {
        return contactsDO;
    }

    public void setContactsDO(List<ContactInfoDO> contactsDO) {
        this.contactsDO = contactsDO;
    }

    public Instant getDob() {
        return dob;
    }

    public void setDob(Instant dob) {
        this.dob = dob;
    }

    public List<QualificationDO> getQualificationsDO() {
        return qualificationsDO;
    }

    public void setQualificationsDO(List<QualificationDO> qualificationsDO) {
        this.qualificationsDO = qualificationsDO;
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

    public List<RelationDO> getRelationsDO() {
        return relationsDO;
    }

    public void setRelationsDO(List<RelationDO> relationsDO) {
        this.relationsDO = relationsDO;
    }

    @Override
    public String toString() {
        return "PersonDO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age='" + age + '\'' +
                ", identifierNumber='" + identifierNumber + '\'' +
                ", genderDO=" + genderDO +
                ", addressDO=" + addressDO +
                ", contacts=" + contactsDO +
                ", dob=" + dob +
                ", qualificationDOS=" + qualificationsDO +
                ", hobbies=" + hobbies +
                ", nationalityDO=" + nationalityDO +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", relationDOS=" + relationsDO +
                '}';
    }
}
