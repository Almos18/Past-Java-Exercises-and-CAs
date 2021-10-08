//Try2.java

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Try2{

    public Try2()
    {
        JFrame jFrameWindow = new JFrame();

        jFrameWindow.setSize(300,200);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameWindow.setTitle("Title I Made");

        JLabel u1 = new JLabel();

        jFrameWindow.add(u1);
    }
}