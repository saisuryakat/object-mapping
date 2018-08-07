package io.saisuryak.lab.objectmappings.model.datatransferobject;

public class ContactInfoDTO {

    private String type;

    private String value;

    private boolean isActive;

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
        return "ContactInfoDTO{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
