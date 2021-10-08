package labsheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NamesGUI {

    JTextArea remainingNamesTextArea;
    JTextField nameTextField;
    int n = 5, i = 0;
    JButton searchButton, longestNameButton;
    String namesAsStringArray[]= new String[5];
    String largestString="";

    public NamesGUI() {
        JFrame jFrameWindow = new JFrame("Student Names");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameWindow.setSize(500, 100);
        jFrameWindow.setLayout(flowLayout);

        JLabel nameLabel = new JLabel("Name");
        jFrameWindow.add(nameLabel);

        nameTextField = new JTextField(20);
        jFrameWindow.add(nameTextField);

        remainingNamesTextArea = new JTextArea("The names array is currently empty! Add names using text-field above");
        jFrameWindow.add(remainingNamesTextArea);

        searchButton = new JButton("Search");
        jFrameWindow.add(searchButton);
        searchButton.setVisible(false);

        longestNameButton = new JButton("Longest Name");
        jFrameWindow.add(longestNameButton);
        longestNameButton.setVisible(false);

        TextFieldEventHandler handlerField = new TextFieldEventHandler();

        ButtonEventHandler handlerButton = new ButtonEventHandler();

        nameTextField.addActionListener(handlerField);
        searchButton.addActionListener(handlerButton);
        longestNameButton.addActionListener(handlerButton);

        jFrameWindow.setVisible(true);
    }

    public static void main(String args[])
    {
        NamesGUI guiApp = new NamesGUI();

    }

    private class TextFieldEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (!nameTextField.getText().equals("")) {
                namesAsStringArray[i] = nameTextField.getText();
                i++;
                n = (n - 1);
                remainingNamesTextArea.setText("Names added! " + n + " slots of the array remain empty");

                if (i == 5) {
                    JOptionPane.showMessageDialog(null,
                            "Names array is now full! To find the longest name or search this array hit return",
                    "Array Full!", JOptionPane.INFORMATION_MESSAGE);
                    remainingNamesTextArea.setVisible(false);
                    searchButton.setVisible(true);
                    longestNameButton.setVisible(true);
                }
            }
        }
    }

    private class ButtonEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==searchButton)
            {
                selectionSort(namesAsStringArray, nameTextField);
            }

            if(e.getSource()==longestNameButton)
            {
                longestName(namesAsStringArray, nameTextField, largestString);
            }
        }
    }

    public static void selectionSort(String namesAsStringArray[], JTextField nameTextField)
    {
        boolean valid=false;
        for(int i = 0;i < 5;i++)
        {
           if(namesAsStringArray[i].equals(nameTextField.getText()))
           {
               JOptionPane.showMessageDialog(null,"The name you have searched for " + nameTextField.getText() + " was found",
               "Name Found",JOptionPane.INFORMATION_MESSAGE);
               valid=true;
           }
        }

        if(!valid)
        {
            JOptionPane.showMessageDialog(null,"The name you have search for " + nameTextField.getText() + " was not found",
            "Name not Found",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void longestName(String namesAsStringArray[], JTextField nameTextField, String largestString)
    {
        for(int i=0;i<5;i++)
        {
            if(namesAsStringArray[i].length() > largestString.length())
            {
                largestString = namesAsStringArray[i];
            }
        }
        JOptionPane.showMessageDialog(null,"The longest name found is " + largestString , "Longest Name" ,
        JOptionPane.INFORMATION_MESSAGE);
    }
}