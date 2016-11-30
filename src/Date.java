import java.io.*;

/**This is one of the base classes, the Date class
 *
 * @author Chris Daly 
 * @version 15/12/2015
 *
 */

public class Date implements Serializable
{
	private int day;
	private int month;
	private int year;

	/**This method produces integers for the day, month and year
	 *
	 * @param d Turns day into an integer
	 * @param m Turns month into an integer
	 * @param y Turns year into an integer
	 * @return Returns a date format as d, m, y
	 */

	public Date(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}

	/** This method invokes the date as a series of three integers
	 * @param Date() invokes the date as three integers at 0
	 * @return Return date values starting at 0
	 */

	public Date()
	{
		this (0, 0, 0);
	}

	/**This method turns a string relating to the month of the year
	 * @param monthAsString A method to change the integer to a string
	 * @return Return as the String form of the months of the year
	 */

	public String monthAsString()
	{
		switch(month){
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		default: return "Invalid month";
		}

	}

	/**These methods invoke the date variables
	 *
	 * @param day This invokes the day variable
	 * @param month This invokes the month variable
	 * @param year This invokes the year variable
	 * @return Return the day, month and year integers
	 */

	public void setDay(int day)
	{
		this.day = day;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	/**This method produces a String of the date components including the month as a word.
	 * @param toString Produces the date as a string
	 * @return Will return the date as a String
	 */

	public String toString()
	{
		return day + " " + monthAsString() + " " + year;
	}

}
