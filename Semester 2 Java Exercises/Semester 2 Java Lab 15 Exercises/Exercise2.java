//Exercise2.java

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Exercise2{
    JTextField jTextField;

    public Exercise2()
    {

        String password = "pass";

    JFrame jFrameWindow = new JFrame();

    jFrameWindow.setSize(400,100);

    jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    



    FlowLayout flowLayout = new FlowLayout();

    jFrameWindow.setLayout(flowLayout);




    JLabel jLabel = new JLabel("Username:");

    jFrameWindow.add(jLabel);




    JTextField jTextField = new JTextField(10);

    jFrameWindow.add(jTextField);




    JLabel l2 = new JLabel("Password:");

    jFrameWindow.add(l2);




   // passwordField = new JPasswordField();
    //passwordField.setBounds(75,128,243,31);
    //pass.setEchoChar('*');




    TextFieldEventHandler handler = new TextFieldEventHandler();

    jTextField.addActionListener(handler);

   
    

    jFrameWindow.setVisible(true);

    }
    public static void main(String args[])
    {
        Exercise2 gui = new Exercise2();
    }
    private class TextFieldEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String userName=jTextField.getText();
            JOptionPane.showMessageDialog(null,"Welcome to the system " + userName);
        }
    }
    

}