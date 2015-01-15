package com.hibernate.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class DateTimeUtil {
	public static final String DATE_FORMAT = "dd/MM/yyyy";

	/**
	 * Convert DateTime to String
	 * 
	 * @param dateValue
	 * @param format
	 * @return
	 */
	public static String convertDateToString(Date dateValue, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String dateString = null;
		try {
			Date date = formatter.parse(dateValue.toString());
			formatter = new SimpleDateFormat(format);
			dateString = formatter.format(date);
		} catch (ParseException e) {
		}
		return dateString;
	}

	/**
	 * Convert time to string
	 * 
	 * @param time
	 * @param format
	 * @return
	 */
	public static String timeToString(Long time, String format) {
		if (time == null) {
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = new Date(time);
		return formatter.format(date);
	}

	/**
	 * Convert time to string
	 * 
	 * @param time
	 * @param format
	 * @return
	 */
	public static String timeToString(String time, String format) {
		if (!StringUtils.isNumeric(time)) {
			return null;
		}
		return timeToString(Long.valueOf(time), format);
	}

	/**
	 * Parse string to date
	 * 
	 * @param dateString
	 * @param format
	 * @return
	 */
	public static Date stringToDate(String dateString, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		try {
			return formatter.parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * Parse string to the time
	 * 
	 * @param dateString
	 * @param format
	 * @return
	 */
	public static Long stringToTime(String dateString, String format) {
		Date date = stringToDate(dateString, format);
		if (date != null) {
			return date.getTime();
		}
		return null;
	}

}
