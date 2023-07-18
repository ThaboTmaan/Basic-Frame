
package za.ac.tut.gui;

import java.awt.Color;
import javax.swing.JFrame;


public class MyFirstFrame extends JFrame{
    public MyFirstFrame()
    {
        setTitle("Khosa Thabo");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
}
