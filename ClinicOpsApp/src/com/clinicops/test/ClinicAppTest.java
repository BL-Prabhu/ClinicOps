package com.clinicops.test;

import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClinicAppTest {

    private static final Logger logger =
            LogManager.getLogger(Test.class);

    public static void main(String[] args) {

        logger.debug("Debug Message");

        logger.info("Information");

        logger.warn("Warning");

        logger.error("Error");
    }
}