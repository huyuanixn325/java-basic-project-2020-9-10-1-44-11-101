package com.thoughtworks.basic;

import java.util.List;

public class Args {

    public List<Schema> args(List<String> inputParams) {
        checkFirstInputParam(inputParams.get(0));
        return null;
    }

    private void checkFirstInputParam(String inputParam) {
        SchemaType schemaType = new SchemaType();
        List<String> schemaTypes = schemaType.getSchemaTypes();
        if (!schemaTypes.contains(inputParam)) {
            throw new SchemaException("第一个参数必须为schema值的key");
        }
    }

}
