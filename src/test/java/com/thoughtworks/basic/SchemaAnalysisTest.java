package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class SchemaAnalysisTest {
    @Test
    public void should_return_null_array_when_given_a_schema(){
        //when
         String inputSchema = "";
         SchemaAnalysis schemaAnalysis = new SchemaAnalysis();
        //given
        String[] formatSchema = schemaAnalysis.formatShemaInput(inputSchema);
        //then
        Assert.assertEquals(0,formatSchema.length);
    }

    @Test
    public void should_return_3_array_when_given_a_schema(){
        //when
        String inputSchema = "-l true -p 8080";
        SchemaAnalysis schemaAnalysis = new SchemaAnalysis();
        //given
        String[] formatSchema = schemaAnalysis.formatShemaInput(inputSchema);
        //then
        Assert.assertEquals(3,formatSchema.length);
    }
}
