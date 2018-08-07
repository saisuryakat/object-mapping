package io.saisuryak.lab.objectmappings.model.domainobject;

public class RelationDO {

    private RelationTypeDO type;

    private String name;

    public RelationTypeDO getType() {
        return type;
    }

    public void setType(RelationTypeDO type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RelationDO{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
