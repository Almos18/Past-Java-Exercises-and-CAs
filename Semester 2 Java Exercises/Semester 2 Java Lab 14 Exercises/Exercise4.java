//Exercise4.java

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercise4{
    public static void main(String args[])
    {
        JFrame jFrameWindow = new JFrame();
        String b;

        jFrameWindow.setTitle("Exercise4.java");
        jFrameWindow.setSize(250,250);
        jFrameWindow.setVisible(true);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameWindow.setLocation(150,150);

        b = jFrameWindow.getTitle();

        JOptionPane.showMessageDialog(null,"Text obtained from the JFrame title bar is" +
			 "\n\n\"" + b + "\"","Title Bar Text",JOptionPane.INFORMATION_MESSAGE);
    }
}