package com.thoughtworks.basic;

public class SchemaRule {
    private String flag;
    private Object value;

    public SchemaRule(String flag, Object valueOf) {
        this.flag = flag;
        this.value = valueOf;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
