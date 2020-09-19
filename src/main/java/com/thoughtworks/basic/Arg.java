package com.thoughtworks.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arg {
    public void arg(List<Schema> schemas) {

        valueTypeCheck(schemas);
    }

    public void valueTypeCheck(List<Schema> schemas) {
        for (Schema schema : schemas) {
            if (schema.getKey().equals(KeyContant.SCHEMA_L) && !schema.checkValueType()) {
                throw new SchemaException(KeyContant.SCHEMA_L + "schema值类型错误");
            }
            if (schema.getKey().equals(KeyContant.SCHEMA_P)&& !schema.checkValueType()) {
                throw new SchemaException(KeyContant.SCHEMA_P + "schema值类型错误");
            }
            if (schema.getKey().equals(KeyContant.SCHEMA_D)&& !schema.checkValueType()) {
                throw new SchemaException(KeyContant.SCHEMA_D + "schema值类型错误");
            }
        }

    }


}
