//jFrameFurther.java

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jFrameFurther{
    JTextField jTextField;

    public jFrameFurther()
    {
        JFrame jFrameWindow = new JFrame("Adding a JTextField JFrame");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);

        jFrameWindow.setSize(350,100);

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Please enter your name: ");

        jFrameWindow.add(jLabel);

        jTextField = new JTextField(15);

        jFrameWindow.add(jTextField);

        TextFieldEventHandler handler = new TextFieldEventHandler();

        jTextField.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }

    public static void main(String args[])
    {
        jFrameFurther guiApp = new jFrameFurther();
    }
    private class TextFieldEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
            String name = jTextField.getText();
            JOptionPane.showMessageDialog(null,"Your name is " + name,"",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }
}