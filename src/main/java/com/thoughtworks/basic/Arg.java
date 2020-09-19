package com.thoughtworks.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arg {
    public void arg(List<Schema> schemas) {
        repeatKeyCheck(schemas);
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


    public void repeatKeyCheck(List<Schema> schemas) {
        Map<String,Integer> keyMap = new HashMap<>();
        for (Schema schema : schemas) {
            if (schema.getKey().equals(KeyContant.SCHEMA_L)) {
                keyMap.put(KeyContant.SCHEMA_L, !keyMap.containsKey(KeyContant.SCHEMA_L) ? 1 : keyMap.get(KeyContant.SCHEMA_L) + 1);
            }
            if (schema.getKey().equals(KeyContant.SCHEMA_P)) {
                keyMap.put(KeyContant.SCHEMA_P, !keyMap.containsKey(KeyContant.SCHEMA_P) ? 1 : keyMap.get(KeyContant.SCHEMA_P) + 1);
            }
            if (schema.getKey().equals(KeyContant.SCHEMA_D)) {
                keyMap.put(KeyContant.SCHEMA_D, !keyMap.containsKey(KeyContant.SCHEMA_D) ? 1 : keyMap.get(KeyContant.SCHEMA_D) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : keyMap.entrySet()) {
            if (entry.getValue() > 1) {
                throw new SchemaException(entry.getKey()+ "schema重复");
            }
        }
    }
}
