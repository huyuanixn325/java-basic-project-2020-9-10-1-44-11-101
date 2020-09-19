package com.thoughtworks.basic;

public class SchemaL implements Schema {
    private String key;
    private String value;

    public SchemaL() {
        this.key = KeyContant.SCHEMA_L;

    }

    @Override
    public void initValue() {
        this.value="false";
    }

    @Override
    public boolean checkValueType() {
        return Boolean.valueOf(this.value);
    }



    @Override
    public String getDefaultValue() {
        return "false";
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
