package com.thoughtworks.basic;

public class SchemaD implements Schema {
    private String key;
    private String value;
    @Override
    public boolean checkValueType() {
        return true;
    }

    public SchemaD() {
        this.key=KeyContant.SCHEMA_D;
    }

    @Override
    public void initValue() {
        this.value="";
    }

    @Override
    public String getDefaultValue() {
        return "";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
