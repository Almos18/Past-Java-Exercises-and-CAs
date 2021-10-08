//Exercise2.java

import javax.swing.JOptionPane;

public class Exercise2 {
    public static void main(String args[])
    {
        int studentID [] = new int[5];
        float sHeight[] = new float[5];
        char sGrade[] = new char[5];

        populateArrays(studentID, sHeight, sGrade);

        displayTable(studentID, sHeight, sGrade);

        linearSearch(studentID, sHeight, sGrade);

    }

    public static void populateArrays(int st[], float sH[], char sG[])
    {
        int i;
        String IDAsString, heightAsString, gradeAsString;
        
        for (i=0;i<5;i++)
        {
        IDAsString = JOptionPane.showInputDialog(null,"Please input student " + (i+1) + " ID");
        heightAsString = JOptionPane.showInputDialog(null,"Please input student " + (i+1) + " Height");
        gradeAsString = JOptionPane.showInputDialog(null,"Please input student " + (i+1) + " Grade");
        st[i] = Integer.parseInt(IDAsString);
        sH[i] = Float.parseFloat(heightAsString);
        sG[i] = gradeAsString.charAt(0);
        }
    }

    public static void displayTable(int st[], float sH[], char sG[])
    {
        JOptionPane.showMessageDialog(null,"StudentID \t Height \t Average Grade\n\n---------- \t ------- \t ------------\n\n" + 
        (st[0]) + "      " + (sH[0]) + "          " + (sG[0]) + "\n" + (st[1]) + "         " + (sH[1]) + "        " + (sG[1]) + "\n" + 
        (st[2]) + "          " +  (sH[2]) + "           " +  (sG[2]));

    }

    public static void linearSearch(int st[], float sH[], char sG[])
    {
        String searchIDAsString;
        int searchID;
        int j=0, anse=0;
        boolean valid=false;

        searchIDAsString = JOptionPane.showInputDialog("Please enter the ID number of the student you seek");

        searchID = Integer.parseInt(searchIDAsString);

    
        for(j=0;j<st.length;j++)
        {
            if(st[j]==searchID)
            {
            anse=j;   
            }
            else
            anse=-1;
        }

        while(valid=false)
        {
            if(st[anse]==searchID)
            {
            JOptionPane.showMessageDialog(null,"That is a valid ID" + st[anse]);
            valid=true;
            }
            else
            searchIDAsString = JOptionPane.showInputDialog(null,"That is not a valid ID");
         searchID = Integer.parseInt(searchIDAsString);
        }

       
        //valid=true;
        //j=ans;

    }
}