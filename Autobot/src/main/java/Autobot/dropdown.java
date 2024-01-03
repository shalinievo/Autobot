package Autobot;
import javax.swing.*;

import java.awt.event.*;
import java.io.IOException;

public class dropdown {
	public static String currentDirectory=System.getProperty("user.dir");
	public static String browserName;
	static void menu(String[] args) throws IOException {
		//Create a JFrame Object
		JFrame frm = new JFrame();
		//Create label object and set the position 
		JLabel lbl3 = new JLabel("driver:", JLabel.LEFT);
		lbl3.setBounds(80,100,60,20);
		//Add label to frame
		frm.add(lbl3);    
		final JCheckBox chk1 = new JCheckBox("chrome"); 
		JCheckBox chk2 = new JCheckBox("firefox"); 
		//Create a new panel
		JPanel p = new JPanel(); 
		p.add(chk1); 
		p.add(chk2); 
		//Set the position of the label
		p.setBounds(160,90,250,30);
		//Add panel to frame 
		frm.add(p);   
		//Create label object and set the position 
		JLabel lbl4 = new JLabel("Favourite Place:", JLabel.LEFT);
		lbl4.setBounds(80,140,100,20);
		//Add label to frame
		frm.add(lbl4);
		//Create array of strings 
		String[] menuItems = {"Make Backlink", "AnubhavSite", "youtube", "CloseAll"};
		final JComboBox<String> combobox = new JComboBox<String>(menuItems); 
		frm.add(combobox);     
		//Create a new panel
		JPanel p2 = new JPanel();    
		p2.add(combobox); 
		//Set the panel position
		p2.setBounds(140,130,250,30);
		//Add the panel to the frame
		frm.add(p2); 
		//Create button
		JButton btn1 = new JButton("Submit");
		//Set button position
		btn1.setBounds(150,270,80,20);
		//Add button to frame
		frm.add(btn1);
		//Create button
		JButton btn2 = new JButton("Exit");
		//Set button position
		btn2.setBounds(250,270,80,20);       
		//Add button to frame
		frm.add(btn2);
		//Set the size of the form
		frm.setSize(500, 350);  
		//Set the layout  
		frm.setLayout(null);
		//Set the title of the form
		frm.setTitle("Welecome to Anubhavtraining.com");
		//set form in the center of the screen
		frm.setLocationRelativeTo(null);      
		//Display the form 
		frm.setVisible(true);
		//Add the following lines to add event handler code for the Submit button that will read the values of the swing controls.
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = combobox.getItemAt(combobox.getSelectedIndex());
				System.out.println(selectedOption);
			      if(chk1.isSelected()){
			    	  System.out.println(chk1.getText());
			    	  
			      }
			      String browserName = chk1.isSelected() ? "chrome" : "firefox";
			      switch (selectedOption) {
			      case "Make Backlink":
			    	  try {
			    		  backlinkbot.BacklinkWin1(browserName);
			    		  Thread.sleep(100);
			    		  backlinkbot.BacklinkWin2(browserName);
			    		  Thread.sleep(100);
			    		  backlinkbot.BacklinkWin3(browserName);
			    		}
			    		catch(Exception e1) {
			    		  //  Block of code to handle errors
			    		}
			          break;
			      case "AnubhavSite":
			    	  //AnubhavSite();
			          try {
			        	  backlinkbot.AnubhavSite(browserName);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			          break;
			      case "youtube":
			          // Action for Option 3
			    	  try {
			        	  backlinkbot.youtube(browserName);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			          break;
			  }
}
		});
        frm.setVisible(true);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    System.exit(0);
			}
		});
	  }

}
