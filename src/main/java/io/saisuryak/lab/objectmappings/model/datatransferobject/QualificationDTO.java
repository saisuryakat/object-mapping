package io.saisuryak.lab.objectmappings.model.datatransferobject;

public class QualificationDTO {

    private String name;

    private String type;

    private String fromYear;

    private String toYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFromYear() {
        return fromYear;
    }

    public void setFromYear(String fromYear) {
        this.fromYear = fromYear;
    }

    public String getToYear() {
        return toYear;
    }

    public void setToYear(String toYear) {
        this.toYear = toYear;
    }

    @Override
    public String toString() {
        return "QualificationDTO{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", fromYear='" + fromYear + '\'' +
                ", toYear='" + toYear + '\'' +
                '}';
    }
}
