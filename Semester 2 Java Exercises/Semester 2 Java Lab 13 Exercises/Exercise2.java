//Exercise2.java

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercise2 {
    public static void main(String args[])
    {
        String tNumbersArray[] = new String[10];
        String coursesArray[] = new String[10];
        String tNumbers, courses, temp, seek, largestCourse;
        int sub, largest, largestj, here;
        boolean found;
        int t003=0, courseCounter=0;


        for(int i=0;i<tNumbersArray.length;i++)
        {
            tNumbers = JOptionPane.showInputDialog(null,"Enter t-number for student " + (i+1));
            tNumbersArray[i] = tNumbers;
            courses = JOptionPane.showInputDialog(null,"Enter course name for student " + (i+1));
            coursesArray[i] = courses;
        }

        JOptionPane.showMessageDialog(null,"Before sorting the contents the contents of the t-Numbers and course names arrays are:\n\n" + 
        Arrays.toString(tNumbersArray) + "\n" + Arrays.toString(coursesArray));

        for(int i=0;i<tNumbersArray.length-1;i++)
        { 
            if(tNumbersArray[i].startsWith("t"))
            {
                tNumbersArray[i].replaceFirst("t","0");
            }
            
            largest = Integer.parseInt(tNumbersArray[i]);
            here = Integer.parseInt(tNumbersArray[i]);
            sub = i;

            for(int j=i+1;j<tNumbersArray.length;j++)
            {
                largestj = Integer.parseInt(tNumbersArray[j]);
                if(largestj < largest)
                {
                    largest = largestj;
                    sub = j;
                }
            }
            tNumbersArray[i] = Integer.toString(here);
            temp = tNumbersArray[i];
            tNumbersArray[i] = tNumbersArray[sub];
            tNumbersArray[sub] = temp;
            temp = coursesArray[i];
            coursesArray[i] = coursesArray[sub];
            coursesArray[sub] = temp;

        }

        JOptionPane.showMessageDialog(null,"After sorting the contents the contents of the t-Numbers and course names arrays are:\n\n" + 
        Arrays.toString(tNumbersArray) + "\n" + Arrays.toString(coursesArray));  

        seek = JOptionPane.showInputDialog(null,"Enter the t-number you seek");

        found = binarySearch(tNumbersArray,seek);

        if(found)
            JOptionPane.showMessageDialog(null,"The player you sought was found in the array and the corresponding course name for this student is ","found",JOptionPane.INFORMATION_MESSAGE);

        else
            JOptionPane.showMessageDialog(null,"The player you sought was not found in the array","Not Found!",JOptionPane.INFORMATION_MESSAGE);

        counterMethod(tNumbersArray, coursesArray, t003, courseCounter);
        
    }

    public static boolean binarySearch(String tNumbersArray[], String seek)
    {
        int lowerSub=0, higherSub=tNumbersArray.length-1, middleSub;
    
        while(lowerSub<=higherSub)
        {
            middleSub = (lowerSub+higherSub)/2;

            if(tNumbersArray[middleSub].compareTo(seek) < 0)
                lowerSub = middleSub+1;
            else if(tNumbersArray[middleSub].compareTo(seek) > 0)
                higherSub = middleSub-1;
            else

            return true;
        }

    return false;
    }

    public static void counterMethod(String tNumbersArray[], String coursesArray[], int courseCounter, int t003)
    {
        for(int h=0;h<coursesArray.length;h++)
            {
                if(tNumbersArray[h].startsWith("3"))
                {              
                t003++;
                }              

                if(coursesArray[h].equals("Health & Leisure") || coursesArray[h].equals("Chemistry"))
                {
                courseCounter++;
                }
                
            }

            JOptionPane.showMessageDialog(null,"The number of students whose t-number begins with 003 is " + t003 +
            "\nThe number of students whose course name is either Health or Chemistry is " + courseCounter);
    }

}