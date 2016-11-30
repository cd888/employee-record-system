import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.*;

/**This is the GUI class to display the Employee Form
 * @author Chris Daly 
 * @version 15/12/2015
 */

public class MainForm extends JFrame {


	/**This adds the store class to the GUI
	 * @param adds Store class to MainForm
	 */

	Store eStore = new Store();

	/**These are all the components that are used in the MainForm GUI
	 * They are subdivided into sections for different parts of the GUI
	 */

	protected int[] days = new int[31];
	protected int[] months = new int [12];
	public Array years;
	private ArrayList <Employee> eList;
	private String id, name, gender;
	private Date dateOfBirth;
	protected JComboBox <Integer>  day1, month1, year1, day2, month2, year2;
	private String address;
	private float slry;
	private String natInsceNo, phoneNo;
	private Date start;
	private String jobTitle;
	protected int count;




	private JMenuBar menubar;
	private JMenu fileMenu, recordMenu, optionMenu;
	private JMenuItem displayItem;
	private JMenuItem newItem, openItem, saveItem, exitItem;
	private JMenuItem themeItem;
	private JFileChooser fc = new JFileChooser();

	/**Below is the three array components that are used to list the days, months and years for the date combo boxes.
	 * They include all the days in a month, and months in a year, and years that span 100 years.
	 */

	Integer[] daysArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	Integer[] monthsArr = {1,2,3,4,5,6,7,8,9,10,11,12};
	Integer[] yearsArr = {1920,1921,1922,1923,1924,1925,1926,1927,1928,1929,1930,1931,1933,1944,1945,1946,1947,1948,
			1949,1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,
			1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,
			1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2003,2004,2005,2006,2007,2009,2010,2011,2012,2013,
			2014,2015,2016,2017,2018,2019,2020};

	JLabel tl = null;
	JLabel il = null;
	JLabel nl = null;
	JLabel gl = null;
	JLabel dbl = null;
	JLabel al = null;
	JLabel sl = null;
	JLabel nil = null;
	JLabel pl = null;
	JLabel sdl = null;
	JLabel jl = null;

	JTextField itf = null;
	JTextField ntf = null;
	JRadioButton mrb = null;
	JRadioButton frb = null;
	ButtonGroup gbd = new ButtonGroup ();
	JComboBox<Integer> dbc = new JComboBox<Integer>(daysArr);
	JComboBox<Integer> mbc = new JComboBox<Integer>(monthsArr);
	JComboBox<Integer> ybc = new JComboBox<Integer>(yearsArr);
	JTextField atf = null;
	JTextField stf = null;
	JTextField nitf = null;
	JTextField ptf = null;
	JComboBox <Integer> dsc = new JComboBox<Integer>(daysArr);
	JComboBox <Integer> msc = new JComboBox<Integer>(monthsArr);
	JComboBox <Integer> ysc = new JComboBox<Integer>(yearsArr);
	JTextField jtf = null;

	JButton bp = null;
	JButton bn = null;
	JButton be = null;
	JButton bc = null;



	/**This method creates some of the behaviours for the GUI and provides variables for components.
	 * @param MainForm sets parameters for the GUI
	 * @return Adds conditions such as setting JFrame to visible
	 * Creates the Array List called eList and components inside
	 */


	public MainForm() {
		createSystem();

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);


		eList = new ArrayList<>();
		id = new String();
		name = new String();
		dateOfBirth = new Date();
		gender = new String();
		address = new String();
		slry = 0.0f;
		natInsceNo = new String();
		phoneNo = new String();
		start = new Date();
		jobTitle = new String();
		count = 0;

		gbd.add(mrb);
		gbd.add(frb);


	}

	/**This method creates all the components for the GUI and implements methods into those components
	 * @param createSystem() creates the Menus, Buttons and Form Labels/Fields
	 * @return creates the GUI and implements methods associated with buttons and menu entries
	 */

 private void createSystem() {

		menubar = new JMenuBar ();
		this.setJMenuBar(menubar);

		newItem = new JMenuItem("New");
		newItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//new file code
			}
		});

		openItem = new JMenuItem("Open");
		openItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//open file code
				openFile();

			}
		});

		saveItem = new JMenuItem("Save");
		saveItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//save file code
				saveFile();
			}
		});

		exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});

		displayItem = new JMenuItem("Display All");
		displayItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				eStore.displayAll();
			}
		});

		themeItem = new JMenuItem("Change Theme");
		themeItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

			}
		});



		fileMenu = new JMenu("File");
		menubar.add(fileMenu);
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);


		recordMenu = new JMenu("Record");
		menubar.add(recordMenu);
		recordMenu.add(displayItem);


		optionMenu = new JMenu("Options");
		menubar.add(optionMenu);
		optionMenu.add(themeItem);





		JPanel panelMain = new JPanel();
		this.getContentPane().add(panelMain);
		panelMain.setLayout(new BorderLayout());
		getContentPane().add(panelMain, BorderLayout.WEST);

		JPanel panelEForm = new JPanel (new GridBagLayout());
		panelMain.add(panelEForm);


		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.insets = new Insets(10,10,5,10);

		panelEForm.add(tl = new JLabel("Enter Employee Information"),c);
		tl.setFont(new Font ("Ariel",Font.BOLD, 18));

		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(1,1,1,1);
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(il = new JLabel("ID Number: "),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(nl = new JLabel("Name: "),c);


		c.gridy++;
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(gl = new JLabel("Gender: "),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(dbl = new JLabel ("Date of Birth: "),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(al = new JLabel ("Address: "),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(sl = new JLabel ("Salary: "),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(nil = new JLabel ("National Inurance Number: "),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(pl = new JLabel ("Phone No: "),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(sdl = new JLabel ("Start Date: "),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(jl = new JLabel ("Job Title: "),c);

		c.gridy++;
		c.insets = new Insets(4,4,4,4);
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(bp = new JButton ("Previous"),c);

		c.gridy++;
		c.insets = new Insets(4,4,4,4);
		c.anchor = GridBagConstraints.LINE_END;
		panelEForm.add(be = new JButton ("Enter"),c);
		be.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				//get text from textfields
				if(e.getSource() == be)
				{
					Employee m = new Employee();

					Date dateOfBirth;
					Date start;
					String gender;

					id = itf.getText().trim();
					name = ntf.getText().trim();
					if (mrb.isSelected()){
						gender = "M";
					}
					else if(frb.isSelected()){
						gender = "F";
					}
					else{
						gender = "";
					}

					int day1 = (int) dbc.getSelectedItem();
					int month1 = (int) mbc.getSelectedItem();
					int year1 = (int) ybc.getSelectedItem();
					dateOfBirth = new Date (day1, month1, year1);
					address = atf.getText();
					slry = Float.parseFloat(stf.getText().trim());
					natInsceNo = nitf.getText();
					phoneNo = ptf.getText();
					int day2 = (int) dsc.getSelectedItem();
					int month2 = (int) msc.getSelectedItem();
					int year2 = (int) ysc.getSelectedItem();
					start = new Date (day2,month2, year2);
					jobTitle = jtf.getText();


					m.setId(id);
					m.setName(name);
					m.setGender(gender);
					m.setDateOfBirth(dateOfBirth);
					m.setAddress(address);
					m.setSalary(slry);
					m.setNatInsceNo(natInsceNo);
					m.setPhoneNo(phoneNo);
					m.setStart(start);
					m.setJobTitle(jobTitle);

					//add object to array list
					eStore.add(m);

					//increment count
					count++;
				}




			}
			});

		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(1,1,1,1);
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(itf = new JTextField (3),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(ntf = new JTextField (18),c);


		c.gridy++;
		c.insets = new Insets(1,1,1,50);
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(mrb = new JRadioButton ("Male"),c);
		c.insets = new Insets(1,50,1,1);
		panelEForm.add(frb = new JRadioButton ("Female"),c);


		c.insets = new Insets(1,1,1,50);
		c.gridy++;
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(dbc = new JComboBox<Integer> (daysArr),c);
		c.insets = new Insets(1,45,1,90);
		panelEForm.add(mbc = new JComboBox<Integer> (monthsArr),c);
		c.insets = new Insets(1,90,1,1);
		panelEForm.add(ybc = new JComboBox<Integer> (yearsArr),c);


		c.gridy++;
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets(1,1,1,1);
		panelEForm.add(atf = new JTextField (18),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(stf = new JTextField (7),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(nitf = new JTextField (13),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(ptf = new JTextField (13),c);

		c.gridy++;
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets (1,1,1,50);
		panelEForm.add(dsc = new JComboBox<Integer>(daysArr),c);
		c.insets = new Insets (1,45,1,90);
		panelEForm.add(msc = new JComboBox<Integer>(monthsArr),c);
		c.insets = new Insets (1,90,1,1);
		panelEForm.add(ysc = new JComboBox<Integer>(yearsArr),c);

		c.gridy++;
		c.insets = new Insets (1,1,1,1);
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(jtf = new JTextField (20),c);

		c.gridy++;
		c.insets = new Insets(4,4,4,4);
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(bn = new JButton ("Next"),c);

		c.gridy++;
		c.insets = new Insets(4,4,4,4);
		c.anchor = GridBagConstraints.LINE_START;
		panelEForm.add(bc = new JButton ("Clear"),c);




 }

public void openFile() {

	int result = fc.showOpenDialog(this);

	if (result == JFileChooser.APPROVE_OPTION){
		File myfile = fc.getSelectedFile();
		try{
			//load file stuff
			super.setTitle("open " +myfile.getAbsolutePath());
		} catch (Exception nfe){
			super.setTitle("An error occured during opening");
		}
	}
}

/**This is a method used to save the information stored in the ArrayList to a text file.
 * @param saveFile() Saves the contents of the ArrayList eList to a text file.
 */

public void saveFile() {

	int result = fc.showOpenDialog(this);

	if (result == JFileChooser.APPROVE_OPTION){
		File myFile = fc.getSelectedFile();
		//save file code needed
		try{

			PrintWriter empWriter = new PrintWriter(new FileWriter(myFile.getPath())); //new File("C:/Users/user/Desktop");
			//FileWriter empFile = new FileWriter("Emp.txt", true);
			//PrintWriter empWriter = new PrintWriter(empFile);

			for (Employee m : eList)
			{
				empWriter.println(m.getId());
				empWriter.println(m.getName());
				empWriter.println(m.getGender());
				empWriter.println(m.getDateOfBirth().toString());
				empWriter.println(m.getAddress());
				empWriter.println(m.getSalary());
				empWriter.println(m.getNatInsceNo());
				empWriter.println(m.getPhoneNo());
				empWriter.println(m.getStart().toString());
				empWriter.println(m.getJobTitle());
			}
			empWriter.close();


		JOptionPane.showMessageDialog(null, "File Saved!");
		} catch (IOException nfe) {
			JOptionPane.showMessageDialog(null, "An error has ocurred!");
		}

}
}

}
