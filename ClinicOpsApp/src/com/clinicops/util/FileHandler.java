package com.clinicops.util;

import com.clinicops.model.*;
import com.opencsv.CSVReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private static final Logger logger =
            LogManager.getLogger(FileHandler.class);

    public static List<Doctor> loadDoctors(String path, int id, List<Doctor> existing) {
        List<Doctor> list = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] row;

            while ((row = reader.readNext()) != null) {
                Doctor d = new Doctor("D" + id++, row[0],
                        Specialization.valueOf(row[1]),
                        Integer.parseInt(row[2]),
                        Shift.valueOf(row[3]));

                list.add(d);
            }

        } catch (Exception e) {
            logger.error("CSV Read Failed", e);
        }

        return list;
    }
}