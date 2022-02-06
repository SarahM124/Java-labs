package lab12;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class GUIdriver 
{
    public static void main(String[] args) 
    {
    GUI align = new GUI();
    align.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //align.setSize(200, 200);
    //align.setVisible(true);
    
    align.setLayout(new GridLayout(3,3));    
    align.setSize(300,300);    
    align.setVisible(true); 

    }
}
