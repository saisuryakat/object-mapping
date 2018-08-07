package objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.datatransferobject.PersonDTO
import io.saisuryak.lab.objectmappings.model.domainobject.*
import objectmappings.mapper.AddressMapperKt.mapAddressDOToAddressDTO
import objectmappings.mapper.ContactMapperKt.mapContactsDOToContactsDTO
import objectmappings.mapper.QualificationMapperKt.mapQualificationsDOToQualificationsDTO
import objectmappings.mapper.RelationMapperKt.mapRelationsDOToRelationsDTO

object PersonMapperKt {
    @JvmStatic
    fun mapPersonDOToPersonDTO(personDO: PersonDO): PersonDTO {
        return PersonDTO().apply {
            id = personDO.id
            name = with(personDO) { "$firstName $middleName $lastName" }
            age = personDO.age
            identifierNumber = personDO.identifierNumber
            gender = personDO.genderDO.toString()
            address = personDO.addressDO.toAdressDto()
            contactsDTO = personDO.contactsDO.toContactsDto()
            dob = personDO.dob
            qualificationsDTO = personDO.qualificationsDO.toQualificationsDto()
            hobbies = personDO.hobbies
            nationality = personDO.nationalityDO.toString()
            fatherName = personDO.fatherName
            motherName = personDO.motherName
            relationsDTO = personDO.relationsDO.toRelationsDto()
        }
    }

    private fun AddressDO.toAdressDto() = mapAddressDOToAddressDTO(this)
    private fun List<ContactInfoDO>.toContactsDto() = mapContactsDOToContactsDTO(this)
    private fun List<QualificationDO>.toQualificationsDto() = mapQualificationsDOToQualificationsDTO(this)
    private fun List<RelationDO>.toRelationsDto() = mapRelationsDOToRelationsDTO(this)

}
