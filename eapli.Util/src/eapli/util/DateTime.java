/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class DateTime {

	/**
	 * returns the current date of the system
	 *
	 * @return
	 */
	public static Calendar today() {
		return new GregorianCalendar();
	}

	/**
	 * returns the number of the week in the year given a certain date
	 *
	 * @param date
	 * @return
	 */
	public static int weekNumber(final Calendar date) {
		return date.get(Calendar.WEEK_OF_YEAR);
	}

	public static int weekNumber(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(date.getTime());
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}

	public static int currentWeekNumber() {
		return weekNumber(today());
	}

	/**
	 * Creates a new Calendar object set to a specific date
	 *
	 * @param year the year
	 * @param month the month (1 - 12)
	 * @param day the day of the month
	 * @return a newly create Calendar object
	 */
	public static Calendar newCalendar(final int year, final int month,
									   final int day) {
		return new GregorianCalendar(year, month - 1, day);
	}

	public static Date newDate(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day);
		return c.getTime();
	}
}
