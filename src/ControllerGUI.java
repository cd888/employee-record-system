/**This class invokes a main method to run the GUI and other classes of the system.
 *
 * @author Chris Daly 
 * @version 15/12/2015
 *
 */

public class ControllerGUI {

	/**This method is the main method that will run the GUI MainForm and the base classes
	 *
	 * @param args Invoke the main method to the Employee Record System
	 * @return The GUI will appear on screen.
	 */

	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run (){
				MainForm f = new MainForm();
			}
		});

	}
}
