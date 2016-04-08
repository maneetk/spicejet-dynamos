package com.spicejet.spicer.parser;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;

/**
 * Created by kmalhotra on 08/04/16.
 */
public class Parse {

    public void parse(String filePath) throws Exception {
        Reader in = new FileReader(filePath);
        Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(in);
        for (CSVRecord record : records) {
            String airline = record.get("Airline");
            System.out.println(airline);
        }
    }
}
