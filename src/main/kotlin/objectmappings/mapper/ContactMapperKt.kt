package io.saisuryak.lab.objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.datatransferobject.ContactInfoDTO
import io.saisuryak.lab.objectmappings.model.domainobject.ContactInfoDO

import java.util.stream.Collectors.toList

object ContactMapperKt {

    fun contactDOToContactDTO(contactInfoDO: ContactInfoDO): ContactInfoDTO {
        val contactInfoDTO = ContactInfoDTO()
        contactInfoDTO.type = contactInfoDO.type.toString()
        contactInfoDTO.value = contactInfoDO.value
        contactInfoDTO.isActive = contactInfoDO.isActive
        return contactInfoDTO
    }

    fun mapContactsDOToContactsDTO(contactsDO: List<ContactInfoDO>): List<ContactInfoDTO> {
        return contactsDO.stream().map(ContactMapperKt::contactDOToContactDTO).collect(toList())
    }
}
