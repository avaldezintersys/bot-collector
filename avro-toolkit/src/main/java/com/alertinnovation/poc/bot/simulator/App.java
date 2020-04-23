package com.alertinnovation.poc.bot.simulator;

import com.alertinnovation.poc.bot.simulator.utils.AvroUtils;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.apache.log4j.BasicConfigurator;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args){
        try {
            BasicConfigurator.configure();
            String schema = AvroUtils.SchemaCreation();
            AvroUtils.saveSchema(schema);
        } catch (JsonMappingException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
