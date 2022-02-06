package lab12;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GUI extends JFrame{
	
	JFrame frame;
	GUI() {
	frame = new JFrame();

	
	// Buttons
     JButton okButton = new JButton("Ok");
     JButton cancelButton = new JButton("Cancel");
    JButton helpButton = new JButton("Help");

    // Grid 
     JCheckBox snapToGridCheckBox = new JCheckBox("Snap to Grid");
     JCheckBox showGridCheckBox = new JCheckBox("Show Grid");

     // Text fields
     JTextField xTextField = new JTextField();
     JTextField yTextField = new JTextField();

     // Labels for text fields 
     JLabel xLabel = new JLabel("X: ");
     JLabel yLabel = new JLabel("Y: ");
    
    frame.add(okButton); 
    frame.add(cancelButton);
    frame.add(helpButton);
    frame.add(snapToGridCheckBox);
    frame.add(showGridCheckBox);
    frame.add(xTextField);
    frame.add(yTextField);
    frame.add(xLabel);
    frame.add(yLabel);
    
    frame.setLayout(new GridLayout(3,6));    
    frame.setSize(600,600);    
    frame.setVisible(true); 
    
	}
	public static void main(String[] args) {    
	    new GUI();    
	}

	
    
    

    
    
   
    
    
    
    
}




    