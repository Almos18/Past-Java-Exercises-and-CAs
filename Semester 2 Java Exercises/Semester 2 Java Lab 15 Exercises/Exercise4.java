//Excercise4.java

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise4
{
    JTextField p1;
    JTextField p2;
    String nameOldest;
    int totalProcessed=0,totalAge=0,oldestAge=0,youngestAge=0;
    String names[] = new String[100];
    int ages[] = new int[100];

    public Exercise4()

    {
        JFrame jFrameWindow = new JFrame();

        jFrameWindow.setSize(350,200);

        jFrameWindow.setTitle("Enter Details");

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);




        JLabel a1 = new JLabel("Name:");

        jFrameWindow.add(a1);



        p1 = new JTextField(10);

        TextFieldEventHandler tfHandler = new TextFieldEventHandler();
 
 		p1.addActionListener(tfHandler);

        jFrameWindow.add(p1);



        JLabel a2 = new JLabel("Age:");

        jFrameWindow.add(a2);



        p2 = new JTextField(3);

        jFrameWindow.add(p2);


        
        JButton submitButton = new JButton("Submit");

        jFrameWindow.add(submitButton);

        ButtonEventHandler handler = new ButtonEventHandler();
 			 
        submitButton.addActionListener(handler);

        jFrameWindow.setVisible(true);

    }

    public static void main(String args[])
    {
        Exercise4 gui = new Exercise4();
    }
    private class TextFieldEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int age = p2.getInt();

            float averageAge = (age/5);

            JOptionPane.showMessageDialog(null,"Average age: " + averageAge);
        }
    }
}