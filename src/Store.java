import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**This class is the Store class which will be used to store the information for the system
 *
 * @author Chris Daly
 * @version 15/12/2015
 *
 */

public class Store implements Serializable
{

	private static ArrayList <Employee> eList; //array list for storing employee objects
	private static int count; //keeps count of number of persons stored in array


	/** This method produces a new ArrayList and a count at 0
	 *  @param Store Creates a new Array list and count
	 *  @return Returns an ArrayList called eList and a count of 0.
	 */

	public Store()
	{
		eList = new ArrayList<>();
		count = 0;
	}

	/** This method returns the number of elements currently in the store
	 * @param getCount() This return the count within the store
	 * @return This will return a number equalling the size of store
	 */

    public static int getCount()
	{

		return count;
	}

    /** This method determines whether the Array List is empty
     * @param Returns a boolean if the Array List is empty
     * @return Will return either a true or false
     */

    public static boolean isEmpty()
    {
    	if (eList.size() == 0)
    	{
    		return true;
    	}
    	else
    	{
    	return false;
    	}
    }

    /**This method produces a boolean and counts whether the Array List is full
     * @param Counts the ArrayList and produce a boolean
     * @return
     */

    public static boolean isFull()
	{
		return count == eList.size();
	}

    /**This method adds the parameters from the MainForm into the ArrayList and counts after each one
     *
     * @param m This method adds components from the input form into the ArrayList
     * @return This will return a populated ArrayList with an incremental count
     */

    public void add(Employee m)
	{
		//person p is added to array
		eList.add(m);
		count++;
	}

    /**This method displays all records of the ArrayList to a dialogue box
     * @param Displays all contents of the ArrayList onto the screen
     * @return Returns all records of the ArrayList
     */

	public void displayAll()
	{


		for (int i =0; i < eList.size(); i++)
		{
			JOptionPane.showMessageDialog(null, "Employee Records: \n  ID: "
			+ eList.get(i).getId() + "\n Name: "
			+ eList.get(i).getName() + "\n Gender: "
			+ eList.get(i).getGender() + "\n Date of Birth: "
			+ eList.get(i).getDateOfBirth() + "\n Address: "
		    + eList.get(i).getAddress() + "/n Salary: "
			+ eList.get(i).getSalary() + "\n National Insurance Number: "
		    + eList.get(i).getNatInsceNo() + "\n Phone Number: "
			+ eList.get(i).getPhoneNo() + "\n Start Date: "
		    + eList.get(i).getStart() + "\n Job Title: "
			+ eList.get(i).getJobTitle());


		}



	}



}
