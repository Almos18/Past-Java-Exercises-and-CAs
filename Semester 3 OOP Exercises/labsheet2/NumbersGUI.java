package labsheet2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class NumbersGUI {

    JTextArea informationArea;
    JTextField numberEnterField;
    double largest=-1999999999, smallest=1999999999, TextFieldConvertedToDouble;

    public NumbersGUI()
    {
        JFrame jFrameWindow = new JFrame("Numbers Application");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameWindow.setSize(500,150);
        jFrameWindow.setLayout(flowLayout);

        JLabel numberEnterLabel = new JLabel("Please enter your numbers here");
        jFrameWindow.add(numberEnterLabel);

        numberEnterField = new JTextField(20);
        jFrameWindow.add(numberEnterField);

        informationArea = new JTextArea("No numbers entered yet");
        jFrameWindow.add(informationArea);

        TextFieldEventHandler handler = new TextFieldEventHandler();
        numberEnterField.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }
    public static void main(String args[]) {
        NumbersGUI guiApp = new NumbersGUI();
    }
    private class TextFieldEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(numberEnterField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You must enter something","Error",JOptionPane.ERROR_MESSAGE);
            }

            else if(!numberEnterField.getText().equals(""))
            {
                TextFieldConvertedToDouble = Double.parseDouble(numberEnterField.getText());

                if(TextFieldConvertedToDouble>largest)
                {
                    largest = TextFieldConvertedToDouble;
                }

                if(TextFieldConvertedToDouble<smallest)
                {
                    smallest = TextFieldConvertedToDouble;
                }
                informationArea.setText("Largest number so far is: " + largest + " Smallest so far is " + smallest);
            }
        }
    }
}
