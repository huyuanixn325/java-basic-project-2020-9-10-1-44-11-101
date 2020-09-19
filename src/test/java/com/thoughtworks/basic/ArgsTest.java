package com.thoughtworks.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ArgsTest {

    @Test
    public void should_return_check_first_input_param_error_test() {
        //given
        Args args = new Args();
        List<String> argsList = new ArrayList<>();
        argsList.add("iiisis");
        //when
        try {
            args.args(argsList);
            //then
            fail("第一个参数必须为schema值的key");
        } catch (Exception e) {
            //then
            assertTrue(e instanceof SchemaException);
        }
    }
}
