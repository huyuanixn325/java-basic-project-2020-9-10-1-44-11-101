package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SchemaAnalysisTest {


    @Test
    public void should_return_2_array_when_given_a_schema(){
        //when
        String inputSchema = "-l true -p 8080";
        SchemaAnalysis schemaAnalysis = new SchemaAnalysis();
        //given
        List<Schema> schemas = schemaAnalysis.schemaCheck(inputSchema);
        //then
        Assert.assertEquals(2,schemas.size());
    }

    @Test
    public void should_return_2_true_array_when_given_a_schema(){
        //when
        String inputSchema = "-l true -p 8080";
        SchemaAnalysis schemaAnalysis = new SchemaAnalysis();
        //given
        List<Schema> schemas = schemaAnalysis.schemaCheck(inputSchema);
        SchemaP schemaP = (SchemaP) schemas.get(1);
        //then
        Assert.assertEquals(2,schemas.size());
        Assert.assertEquals("-l",schemas.get(0).getKey());
        Assert.assertEquals("8080",schemaP.getValue());
    }
}
