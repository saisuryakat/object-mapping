package io.saisuryak.lab.objectmappings.model.domainobject;

public class ContactInfoDO {

    private ContactTypeDO type;

    private String value;

    private boolean isActive;

    public ContactTypeDO getType() {
        return type;
    }

    public void setType(ContactTypeDO type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "ContactInfoDO{" +
                "type=" + type +
                ", value='" + value + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
