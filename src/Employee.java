/**This class is the Employee base class used for the Employee information and inherits from the Person Class
 *
 * @author Chris Daly 
 * @version 15/12/2015
 *
 */


public class Employee extends Person {

	protected String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public float getSalary() {
		return salary;
	}

	protected Date start;
	protected float salary;
	protected String jobTitle;

	public Employee()
	{
		this ("", "", "", new Date(), "", new Date(),"");
	}

	public Employee(String id, String name, String sex, Date dob, String add, Date start, String jobTitle)

	{
		super(name, sex, dob, add);
		this.id = id;
		this.start = start;
		salary = 0.0f;
		this.jobTitle = jobTitle;
	}



	public void setSalary(float slry)
	//set salary
	{
		salary = slry;
	}

	/** This method returns the employee values as String
	 * @param This method produces the Employee values as String
	 * @return This returns the values of the Employee class and Person class
	 */

	public String toString()
	//return employee values
	{
		return "Id " + id + " Start date " + start + " Salary " + salary + super.toString() + " Job Title " + jobTitle;
	}

}
