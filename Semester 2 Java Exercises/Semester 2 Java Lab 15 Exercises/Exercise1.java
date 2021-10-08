//Exercise1.java

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise1{
    JTextField jTextField;

    public Exercise1()
    {
    JFrame jFrameWindow = new JFrame();

    FlowLayout flowLayout = new FlowLayout();

    jFrameWindow.setLayout(flowLayout);

    jFrameWindow.setSize(800,700);

    jFrameWindow.setTitle("L");

    jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel jLabel = new JLabel("Please enter your address:");

    jFrameWindow.add(jLabel);

    jTextField = new JTextField(15);

    jFrameWindow.add(jTextField);

    TextFieldEventHandler handler = new TextFieldEventHandler();

    jTextField.addActionListener(handler);

    jFrameWindow.setVisible(true);
    }

    public static void main(String args[])
    {
        Exercise1 guiApp = new Exercise1();
    }
    private class TextFieldEventHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            String address = jTextField.getText();
            JOptionPane.showMessageDialog(null,"Your address is" + address,"",
            JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
}


