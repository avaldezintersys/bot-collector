package com.alertinnovation.poc.bot.simulator.utils;

import com.alertinnovation.poc.bot.simulator.source.BotState;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.avro.AvroMapper;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class AvroUtils {

    private static Logger logger = LoggerFactory.getLogger( AvroUtils.class );

    public static String SchemaCreation() throws JsonMappingException {
        AvroMapper avroMapper = new AvroMapper();
        AvroSchema schema = avroMapper.schemaFor(BotState.class);
        logger.info("Creating schema ...");
        return schema.getAvroSchema().toString();
    }

    public static void saveSchema(final String schema) throws FileNotFoundException {
        String file = "./botstate.avsc";
        logger.info("Saving schema : "+ file);
        OutputStream os = new FileOutputStream(file);
        final PrintStream printStream = new PrintStream(os);
        printStream.println(schema);
        printStream.close();
    }
}
