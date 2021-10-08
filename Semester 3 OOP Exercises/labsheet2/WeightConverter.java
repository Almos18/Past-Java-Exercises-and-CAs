package labsheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WeightConverter {
    JTextField pounds;
    double kilo, poundsAsDouble;
    JTextArea area;

    public WeightConverter()
    {
        JFrame jFrameWindow = new JFrame();

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameWindow.setSize(300,100);
        jFrameWindow.setTitle("Weight Converter");

        JLabel jLabel = new JLabel("Pounds:");
        jFrameWindow.add(jLabel);

        pounds = new JTextField(5);
        jFrameWindow.add(pounds);

        area = new JTextArea("");
        jFrameWindow.add(area);

        TextFieldEventHandler handler = new TextFieldEventHandler();

        pounds.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }


    public static void main(String args[])
    {
        WeightConverter guiApp = new WeightConverter();
    }
    private class TextFieldEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(pounds.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"No","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
                poundsAsDouble = Double.parseDouble(pounds.getText());
                kilo = (poundsAsDouble*0.454);
                /*This program was made by Andras Szivolics in the case of someone presenting this as their own*/
                area.setText("converted is " + kilo + "kg");
        }
    }
}