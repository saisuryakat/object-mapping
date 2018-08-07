package io.saisuryak.lab.objectmappings.model.datatransferobject;

import java.time.Instant;
import java.util.List;

public class PersonDTO {

    private long id;

    private String name;

    private String age;

    private String identifierNumber;

    private String gender;

    private String address;

    private List<ContactInfoDTO> contactsDTO;

    private Instant dob;

    private List<QualificationDTO> qualificationsDTO;

    private List<String> hobbies;

    private String nationality;

    private String fatherName;

    private String motherName;

    private List<RelationDTO> relationsDTO;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ContactInfoDTO> getContactsDTO() {
        return contactsDTO;
    }

    public void setContactsDTO(List<ContactInfoDTO> contactsDTO) {
        this.contactsDTO = contactsDTO;
    }

    public Instant getDob() {
        return dob;
    }

    public void setDob(Instant dob) {
        this.dob = dob;
    }

    public List<QualificationDTO> getQualificationsDTO() {
        return qualificationsDTO;
    }

    public void setQualificationsDTO(List<QualificationDTO> qualificationsDTO) {
        this.qualificationsDTO = qualificationsDTO;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    public List<RelationDTO> getRelationsDTO() {
        return relationsDTO;
    }

    public void setRelationsDTO(List<RelationDTO> relationsDTO) {
        this.relationsDTO = relationsDTO;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", identifierNumber='" + identifierNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", contacts=" + contactsDTO +
                ", dob=" + dob +
                ", qualificationDTOS=" + qualificationsDTO +
                ", hobbies=" + hobbies +
                ", nationality='" + nationality + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", relationDTOS=" + relationsDTO +
                '}';
    }
}
