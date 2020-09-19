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
    }


