package io.saisuryak.lab.objectmappings.model.domainobject;

public class QualificationDO {
    private String name;

    private QualificationTypeDO type;

    private String fromYear;

    private String toYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QualificationTypeDO getType() {
        return type;
    }

    public void setType(QualificationTypeDO type) {
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
}
