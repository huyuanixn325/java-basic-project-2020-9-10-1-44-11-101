package com.thoughtworks.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.fail;

public class ArgTest {
    @Test
    public void l_schema_value_error_test() {
        //given
        Arg arg = new Arg();
        List<Schema> schemas = new ArrayList<>();
        SchemaL schemaL = new SchemaL();
        schemaL.initValue();
        schemaL.setValue("trueA");
        schemas.add(schemaL);

        //when
        try {
            arg.arg(schemas);
            //then
            fail(KeyContant.SCHEMA_L + "schema值类型错误");
        } catch (Exception e) {
            //then
            assertTrue(e instanceof SchemaException);
        }
    }

    @Test
    public void l_schema_repeat_error_test() {
        //given
        Arg arg = new Arg();
        List<Schema> schemas = new ArrayList<Schema>();
        SchemaL schemaL1 = new SchemaL();
        schemaL1.initValue();
        schemaL1.setValue("true");
        SchemaL schemaL2 = new SchemaL();
        schemaL2.initValue();
        schemaL2.setValue("false");
        schemas.add(schemaL1);
        schemas.add(schemaL2);
        //when
        try {
            arg.arg(schemas);
            //then
            fail(KeyContant.SCHEMA_L + "schema重复");
        } catch (Exception e) {
            //then
            assertTrue(e instanceof SchemaException);
        }
    }
    }


