package com.pdsa.gamingProject.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Sachith Harshamal
 */
public class DateUtil {

    private static final Logger LOGGER = LogManager.getLogger(DateUtil.class.getName());

    public static Date convertStringToDate(String dateString) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(dateString);
    }

    public static String convertDateToString(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
    }
}
