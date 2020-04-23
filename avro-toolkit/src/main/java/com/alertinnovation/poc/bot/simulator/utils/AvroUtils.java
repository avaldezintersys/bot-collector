package com.alertinnovation.poc.bot.simulator.utils;

import com.alertinnovation.poc.bot.simulator.source.BotState;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.avro.AvroMapper;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class AvroUtils {

    public static String SchemaCreation() throws JsonMappingException {
        AvroMapper avroMapper = new AvroMapper();
        AvroSchema schema = avroMapper.schemaFor(BotState.class);
        return schema.getAvroSchema().toString();
    }

    public static void saveSchema(final String schema) throws FileNotFoundException {
        String dir = ".";
        OutputStream os = new FileOutputStream(dir + "/botstate.avsc");
        final PrintStream printStream = new PrintStream(os);
        printStream.println(schema);
        printStream.close();
    }
}
