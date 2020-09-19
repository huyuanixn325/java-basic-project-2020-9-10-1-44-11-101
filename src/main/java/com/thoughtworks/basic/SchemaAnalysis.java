package com.thoughtworks.basic;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class SchemaAnalysis {
    List<String> schema = new ArrayList<>();
    Pattern pattern =Pattern.compile("[0-9]*");
    public void initSchema() {
        schema.add("l");
        schema.add("p");
        schema.add("d");
    }

    public String[] formatShemaInput(String inputSchema) {
        String[] formatSchema = {};
        if (null == inputSchema || "" == inputSchema) return formatSchema;
        else formatSchema = inputSchema.trim().split("-");
        return formatSchema;
    }

    public List<SchemaRule> analysisSchema(String[] formatSchema) {
        List<SchemaRule> schemaRules = new ArrayList<>();
        for (int i=1;i< formatSchema.length;i++) {
            String schema = formatSchema[i];
            String[] strings = schema.trim().split(" ");
            if (strings.length > 0 && isInvalidFlag(strings[0]) && strings.length <= 2) {
                String flag = strings[0];
                if (strings.length == 2) {
                    SchemaRule schemaRule = getSchemaRule(flag, strings[1]);
                    schemaRules.add(schemaRule);
                }
            } else {
                try {
                    throw new Exception("Illegal Input");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return schemaRules;
    }

    private boolean isInvalidFlag(String str) {
        if (str.length() == 1 && str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
            if (schema.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private SchemaRule getSchemaRule(String flag, String value) {
        if (String.valueOf(true).equals(value) || String.valueOf(false).equals(value)) {
            return new SchemaRule(flag, Boolean.valueOf(value));
        }
        if (pattern.matcher(value).matches()) {
            return new SchemaRule(flag, Integer.valueOf(value));
        }
        return new SchemaRule(flag, value);
    }
}