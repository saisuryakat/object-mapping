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

    private List<ContactInfoDTO> contacts;

    private Instant dob;

    private List<QualificationDTO> qualificationDTOS;

    private List<String> hobbies;

    private String nationality;

    private String fatherName;

    private String motherName;

    private List<RelationDTO> relationDTOS;

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

    public List<ContactInfoDTO> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactInfoDTO> contacts) {
        this.contacts = contacts;
    }

    public Instant getDob() {
        return dob;
    }

    public void setDob(Instant dob) {
        this.dob = dob;
    }

    public List<QualificationDTO> getQualificationDTOS() {
        return qualificationDTOS;
    }

    public void setQualificationDTOS(List<QualificationDTO> qualificationDTOS) {
        this.qualificationDTOS = qualificationDTOS;
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

    public List<RelationDTO> getRelationDTOS() {
        return relationDTOS;
    }

    public void setRelationDTOS(List<RelationDTO> relationDTOS) {
        this.relationDTOS = relationDTOS;
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
                ", contacts=" + contacts +
                ", dob=" + dob +
                ", qualificationDTOS=" + qualificationDTOS +
                ", hobbies=" + hobbies +
                ", nationality='" + nationality + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", relationDTOS=" + relationDTOS +
                '}';
    }
}
