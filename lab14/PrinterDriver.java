package lab14;

import javax.swing.JFrame;



public class PrinterDriver extends Printer {

	public static void main(String[] args) {
		
		{
			Printer frame = new Printer(); 
			frame.setTitle("Printer");
			frame.setVisible(true);
			frame.setBounds(10, 10, 600, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
		}

	}

}
