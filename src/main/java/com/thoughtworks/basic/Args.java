package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Args {

    public List<Schema> args(List<String> inputParams) {
        checkFirstInputParam(inputParams.get(0));
        return schemaAnalysis(inputParams);
    }

    private void checkFirstInputParam(String inputParam) {
        SchemaType schemaType = new SchemaType();
        List<String> schemaTypes = schemaType.getSchemaTypes();
        if (!schemaTypes.contains(inputParam)) {
            throw new SchemaException("第一个参数必须为schema值的key");
        }
    }

    private List<Schema> schemaAnalysis(List<String> inputParams) {
        List<Schema> schemas = new ArrayList<>();
        for (int i = 0; i < inputParams.size(); i++) {
            if (inputParams.get(i).startsWith("-")) {
                Schema schema = setKey(inputParams.get(i));
                schemas.add(schema);
                continue;
            }
            if (i < inputParams.size() - 1 && !inputParams.get(i + 1).startsWith("-")) {
                throw new SchemaException("value值之间不能包含空格");
            }
            Schema schema =schemas.get(schemas.size() - 1);
            setValue(schema,inputParams.get(i));
        }
        return schemas;
    }

    private void setValue(Schema schema, String value) {
        if (schema.getKey().equals(KeyContant.SCHEMA_L)) {
            SchemaL schemaL = (SchemaL) schema;
            schemaL.setValue(value);
        }
        if (schema.getKey().equals(KeyContant.SCHEMA_P)) {
            SchemaP schemaP = (SchemaP) schema;
            schemaP.setValue(value);
        }
        if (schema.getKey().equals(KeyContant.SCHEMA_D)) {
            SchemaD schemaD = (SchemaD) schema;
            schemaD.setValue(value);
        }
    }

    private Schema setKey(String inputParam) {
        SchemaFactoryImpl schemaFactoryImpl = new SchemaFactoryImpl();
        return schemaFactoryImpl.getSchema(inputParam);
    }
}
