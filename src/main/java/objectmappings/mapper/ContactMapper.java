package objectmappings.mapper;

import io.saisuryak.lab.objectmappings.model.datatransferobject.ContactInfoDTO;
import io.saisuryak.lab.objectmappings.model.domainobject.ContactInfoDO;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ContactMapper {

    public static ContactInfoDTO contactDOToContactDTO(ContactInfoDO contactInfoDO) {
        ContactInfoDTO contactInfoDTO = new ContactInfoDTO();
        contactInfoDTO.setType(contactInfoDO.getType().toString());
        contactInfoDTO.setValue(contactInfoDO.getValue());
        contactInfoDTO.setActive(contactInfoDO.isActive());
        return contactInfoDTO;
    }

    public static List<ContactInfoDTO> mapContactsDOToContactsDTO(List<ContactInfoDO>
                                                                          contactsDO) {
        return contactsDO.stream().map(ContactMapper::contactDOToContactDTO).collect
                (toList());
    }
}
