package objectmappings.mapper

import io.saisuryak.lab.objectmappings.model.domainobject.AddressDO

object AddressMapperKt {
    @JvmStatic
    fun mapAddressDOToAddressDTO(addressDO: AddressDO): String {
        return with(addressDO) { "$houseNumber ${addressLine1 ?: ""} ${addressLine2 ?: ""} $state $country $zipCode" }
    }
}
