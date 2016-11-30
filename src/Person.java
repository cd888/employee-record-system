import java.io.*;

/**This is one of the base classes for the employment system to hold information on a person
 *
 * @author Chris Daly
 * @version 15/12/2015
 */

public class Person implements Serializable
{
	/**
	 * These are the Variables for the Person Class
	 */
	protected String name;
	protected String gender;
	protected Date dateOfBirth;
	protected String address;
	protected String natInsceNo;
	protected String phoneNo;

	/**This method invokes the components of the Person class into an order
	 * @param Person invokes into an order
	 * @return lists the name gender date of birth and address
	 */

	public Person()
	{
		this("", "", new Date(),"");
	}

	/**
	 * These create variables for the name, gender, date of birth and address
	 * @param nme
	 * @param sex
	 * @param dob
	 * @param add
	 */

	public Person(String nme, String sex, Date dob, String add)
	{
		name = nme;
		gender = sex;
		dateOfBirth = dob;
		address = add;
	}

	/**This outputs the Person class variables to a list of Strings
	 * @param toString outputs all variables to a list.
	 * @return Returns all variables in the order they were created.
	 */

	public String toString()
	{
		String output="";

		output = " Name: " + name + " Gender: " + gender + " Date of Birth: " + dateOfBirth + " Address " + address;

		return output;
	}

	/**The below methods get and set the components of the Person Class in order to be used by the MainForm and Store Classes
	 * @param getName get the name from the Person class
	 * @param setName sets the name from the Person Class
	 * @return Returns the name field
	 * @return Returns name as name
	 * @param getGender get the gender from the Person class
	 * @param setGender sets the gender from the Person Class
	 * @return Returns the gender field
	 * @return Returns gender as gender
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNatInsceNo() {
		return natInsceNo;
	}

	public void setNatInsceNo(String natInsceNo) {
		this.natInsceNo = natInsceNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



}
