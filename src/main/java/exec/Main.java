package exec;

import io.saisuryak.lab.objectmappings.model.domainobject.AddressDO;
import objectmappings.mapper.AddressMapperKt;

public class Main {
    public static void main(String[] args) {
        AddressDO addressDO = new AddressDO();
        addressDO.setHouseNumber("1A");
        addressDO.setAddressLine1("Street Quechua");
        addressDO.setAddressLine2("Area Signo");
        addressDO.setState("Corvus");
        addressDO.setCountry("Peaceful");
        addressDO.setZipCode("1234567");
        String address = AddressMapperKt.mapAddressDOToAddressDTO(addressDO);
        System.out.println(address);
    }
}
