
/**This is a class for testing the base classes
 *
 * @author Chris Daly
 * @version 15/12/2015
 */

public class BaseController {

	/**This is the main method used to test the base classes
	 *
	 * @param args the main method to display data from base classes
	 * @return Returns employee information
	 */

	public static void main(String[] args)
	{
		// Main Method


		Employee e = new Employee("02", "John", "M", new Date(1,3,1979), "12 Albert Square", new Date(1,3,2009), "Cleaner");

		Store store ;
		store = new Store();

		System.out.println("Current size of store is " + Store.getCount());

		if (!Store.isFull())
			store.add(e);
		else
			System.out.println("Store full");

		store.displayAll();
		System.out.println("Current size of store is " + Store.getCount());

	}

}
