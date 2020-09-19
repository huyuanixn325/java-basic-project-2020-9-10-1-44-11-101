package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class SchemaType {
    private List<String> schemaTypes = new ArrayList<String>();

    public List<String> getSchemaTypes() {
        return schemaTypes;
    }

    public SchemaType() {
        this.schemaTypes.add(KeyContant.SCHEMA_L);
        this.schemaTypes.add(KeyContant.SCHEMA_P);
        this.schemaTypes.add(KeyContant.SCHEMA_D);
    }
}
