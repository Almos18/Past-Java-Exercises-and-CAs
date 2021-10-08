//Excercise2.java

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Excercise2{

    JButton createNewAccountButton, viewSpecificAccountButton, removeAccountButton, viewAccountsButton;
    String[] accountArrayOutside = new String[2];
    String password, username;

    public Excercise2(){

        JFrame jFrameWindow = new JFrame("Account Administrator");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameWindow.setLayout(flowLayout);
        jFrameWindow.setSize(400,200);

        JLabel asking = new JLabel("Welcome administrator which action would you like to perform?");
        jFrameWindow.add(asking);

        createNewAccountButton = new JButton("Create New Account");
        jFrameWindow.add(createNewAccountButton);

        viewSpecificAccountButton = new JButton("View Specific Account");
        jFrameWindow.add(viewSpecificAccountButton);

        removeAccountButton = new JButton("Remove Account");
        jFrameWindow.add(removeAccountButton);

        viewAccountsButton = new JButton("View Account");
        jFrameWindow.add(viewAccountsButton);

        ButtonEventHandler buttonHandler = new ButtonEventHandler();

        createNewAccountButton.addActionListener(buttonHandler);
        viewSpecificAccountButton.addActionListener(buttonHandler);
        removeAccountButton.addActionListener(buttonHandler);
        viewAccountsButton.addActionListener(buttonHandler);

        jFrameWindow.setVisible(true);
    }

    public static void main(String args[])
    {
        Excercise2 guiApp = new Excercise2();
    }
    private class ButtonEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == createNewAccountButton) {
                accountArrayOutside = createNewAccountMethod();

                username += accountArrayOutside[0];
                password += accountArrayOutside[1];

                JOptionPane.showMessageDialog(null,"Added");
            }
            if(e.getSource() == removeAccountButton)
        }
    }

    private static String[] createNewAccountMethod()
    {
        String usernameInArray, passwordInArray;
        String[] accountArray = new String[2];

        usernameInArray = JOptionPane.showInputDialog(null,"Please enter new username");
        passwordInArray = JOptionPane.showInputDialog(null,"Please enter new password");

        accountArray[0] = usernameInArray;
        accountArray[1] = passwordInArray;

        return accountArray;
    }
}