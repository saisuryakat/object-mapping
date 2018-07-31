package objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.datatransferobject.ContactInfoDTO
import io.saisuryak.lab.objectmappings.model.domainobject.ContactInfoDO

object ContactMapperKt {

    fun contactDOToContactDTO(contactInfoDO: ContactInfoDO): ContactInfoDTO {
        return ContactInfoDTO().apply {
            type = contactInfoDO.type.toString()
            value = contactInfoDO.value
            isActive = contactInfoDO.isActive
        }
    }

    fun mapContactsDOToContactsDTO(contactsDO: List<ContactInfoDO>): List<ContactInfoDTO> {
        return contactsDO.map(ContactMapperKt::contactDOToContactDTO)
    }
}
