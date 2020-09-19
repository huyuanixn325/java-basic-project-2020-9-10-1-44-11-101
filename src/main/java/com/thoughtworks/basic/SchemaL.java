package com.thoughtworks.basic;

public class SchemaL implements Schema {
    private String key;
    private String value;

    @Override
    public void initValue() {
        this.key = KeyContant.SCHEMA_L;
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
}
