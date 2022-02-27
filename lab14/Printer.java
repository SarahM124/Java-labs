package lab14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


	
	public class Printer extends JFrame implements ActionListener{

		// print list 
		String[] printArr = {"High", "Medium", "Low"};
		
		Container container = getContentPane();
		// buttons 
		JButton okButton = new JButton("Ok"); 
		JButton cancelButton = new JButton("Cancel"); 
		JButton setupButton = new JButton("Setup..."); 
		JButton helpButton = new JButton("Help"); 
		
		
		// Text fields
		JTextField textfield1 = new JTextField();
		JTextField textfield2 = new JTextField(); 
		JTextField textfield3 = new JTextField();
		
		// check boxes 
		JCheckBox image = new JCheckBox("Image");
		JCheckBox text = new JCheckBox("Text");
		JCheckBox code = new JCheckBox("Code");
		JCheckBox selection = new JCheckBox("Selection");
		JCheckBox all = new JCheckBox("All");
		JCheckBox applet = new JCheckBox("Applet");
		JCheckBox printFile = new JCheckBox("Print to File");
		
		// labels 
		JLabel myPrinter = new JLabel("Printer: MyPrinter");
		JLabel printQuality = new JLabel("Print Quality:"); 
		
		// combo box 
		JComboBox printList = new JComboBox(printArr);
	
		
		
		// constructor 
		Printer() {
			
			setLocation();
			addComponentsToContainer(); 
			setLayoutManager();
		}
		
		private void addComponentsToContainer() {
			   container.add(okButton);
			    container.add(cancelButton);
			    container.add(setupButton);
			    container.add(helpButton);
			    container.add(textfield1);
			    container.add(textfield2);
			    container.add(textfield3);
			    container.add(image); 
			    container.add(text); 
			    container.add(code);
			    container.add(selection); 
			    container.add(all);
			    container.add(applet);
			    container.add(myPrinter); 
			    container.add(printList); 
			    container.add(printQuality);
			    container.add(printFile);
			    }

		public void setLocation()
		{
			okButton.setBounds(440,50,150,50); //setBounds (x,y, width, height)
		    cancelButton.setBounds(440,100,150,50);
		    setupButton.setBounds(440,150,150,50);
		    helpButton.setBounds(440,200,150,50);
		    
		    textfield1.setBounds(40, 50, 70, 130);
		    image.setBounds(100, 10, 70, 130);
		    text.setBounds(100, 50, 70, 130);
		    code.setBounds(100, 100, 70, 130);
		    
		    textfield2.setBounds(200, 50, 50, 130);
		    selection.setBounds(240, 10, 90, 130 );
		    all.setBounds(240, 50, 90, 130);
		    applet.setBounds(240, 100, 90, 130 );
		    
		    textfield3.setBounds(350, 50, 70, 130);
		    
		    myPrinter.setBounds(40, -40, 140, 130);
		    
		    printList.setBounds(150, 180, 140, 130); 
		    
		    printQuality.setBounds(40, 180, 140, 130);
		    
		    printFile.setBounds(290, 180, 140, 130);
		    
		}
		
		public void setLayoutManager()
		{
			// setting layout manager of container to null 
			container.setLayout(null);
		}
		
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	

		
	}

	
	