package objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.datatransferobject.PersonDTO
import io.saisuryak.lab.objectmappings.model.domainobject.PersonDO
import objectmappings.mapper.AddressMapperKt.mapAddressDOToAddressDTO
import objectmappings.mapper.ContactMapperKt.mapContactsDOToContactsDTO
import objectmappings.mapper.QualificationMapperKt.mapQualificationsDOToQualificationsDTO
import objectmappings.mapper.RelationMapperKt.mapRelationsDOToRelationsDTO

object PersonMapperKt {

    fun mapPersonDOToPersonDTO(personDO: PersonDO): PersonDTO {
        val personDTO = PersonDTO()
        personDTO.id = personDO.id
        personDTO.name = "${personDO.firstName}${personDO.middleName}${personDO.lastName}"
        personDTO.age = personDO.age
        personDTO.identifierNumber = personDO.identifierNumber
        personDTO.gender = personDO.genderDO.toString()
        personDTO.address = mapAddressDOToAddressDTO(personDO.addressDO)
        personDTO.contacts = mapContactsDOToContactsDTO(personDO.contacts)
        personDTO.dob = personDO.dob
        personDTO.qualificationDTOS = mapQualificationsDOToQualificationsDTO(personDO
                .qualificationDOS)
        personDTO.hobbies = personDO.hobbies
        personDTO.nationality = personDO.nationalityDO.toString()
        personDTO.fatherName = personDO.fatherName
        personDTO.motherName = personDO.motherName
        personDTO.relationDTOS = mapRelationsDOToRelationsDTO(personDO.relationDOS)
        return personDTO

    }


}
