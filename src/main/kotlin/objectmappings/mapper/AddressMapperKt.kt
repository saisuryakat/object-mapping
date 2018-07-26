package io.saisuryak.lab.objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.domainobject.AddressDO

object AddressMapperKt {

    fun mapAddressDOToAddressDTO(addressDO: AddressDO): String {
        return """
            ${addressDO.houseNumber}
            ${addressDO.addressLine1}
            ${addressDO.addressLine2}
            ${addressDO.state}
            ${addressDO.country}
            ${addressDO.zipCode}
            """
    }
}
