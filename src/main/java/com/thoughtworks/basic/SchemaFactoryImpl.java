package com.thoughtworks.basic;

import java.security.Key;

public class SchemaFactoryImpl implements SchemaFactory {
    @Override
    public Schema getSchema(String valueType) {
        switch(valueType){
            case KeyContant.SCHEMA_L:
                return new SchemaL();
            case KeyContant.SCHEMA_P:
                return new SchemaP();
            case KeyContant.SCHEMA_D:
                return new SchemaD();
            default:
                throw new UnKnowSchemaException("不明确的Schema");
        }
    }
}
