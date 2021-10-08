//Exercise3.java

import javax.swing.JOptionPane;

public class Exercise3{
    public static void main(String args[])
    {
    String letter;
    int totalVowels=0;
    
    for(int i=1;i<=10;i++)
        {
        letter = JOptionPane.showInputDialog(null,"Please enter input " + i);

        while(!isValidLowercase(letter))
            {
            letter = JOptionPane.showInputDialog(null,"Re-enter letter " + i);
            }

        if(letter.equals("a") || letter.equals("e") || letter.equals("i")||letter.equals("o")||letter.equals("u"))
        totalVowels++;

        }
        JOptionPane.showMessageDialog(null,"The total number of vowels is " + totalVowels +
                                            "\nThe total number of consonants is " + (10-totalVowels));
    }

    public static boolean isValidLowercase(String l)
        {

        boolean valid=false;

         if(l.length()==1 && Character.isLowerCase(l.charAt(0)))
         valid=true;

         return valid;
        }
}