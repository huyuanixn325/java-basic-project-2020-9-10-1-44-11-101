package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

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

    @Test
    public void should_return_a_map_when_given_a_schema(){
        //when
        String inputSchema = "-l true -p 8080";
        SchemaAnalysis schemaAnalysis = new SchemaAnalysis();
        //given
        schemaAnalysis.initSchema();
        String[] formatSchema = schemaAnalysis.formatShemaInput(inputSchema);
        Map<String,Object> objectMap = schemaAnalysis.analysisSchema(formatSchema);
        //then
        Assert.assertEquals(2,objectMap.size());
    }
}
