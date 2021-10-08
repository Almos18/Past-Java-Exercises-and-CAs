package labsheet1;

import java.util.Scanner;

public class TextAnalyser {

    public static void main(String args[])
    {
        int i=0, space=0, ed=0, vowelsLowercase;
        String sentence;

        Scanner Import = new Scanner(System.in);

        do{
            System.out.print("Please enter a piece of text " + (i+1) + ":");
            sentence = Import.nextLine();
            vowelsLowercase=0;
            ed=0;

                for(int j=0;j<sentence.length();j++)
                {
                    if(sentence.charAt(j)=='a'|| sentence.charAt(j)=='e'|| sentence.charAt(j)=='i'|| sentence.charAt(j)=='o'|| sentence.charAt(j)=='u')
                    {
                        vowelsLowercase++;
                    }
                    if(sentence.charAt(j)==' ')
                    {
                        space++;
                    }

                    if(sentence.charAt(j)=='e' && sentence.charAt(j+1)=='d')
                    {
                        /*This program was made by Andras Szivolics in case someone presents this as their own*/
                        ed++;
                    }
                }

            System.out.println("\t\n********Text Data*********" +
                    "\n\nThe number of characters: " + sentence.length() +
                    "\nNumber of lowercase vowels: " + vowelsLowercase +
                    "\nNumber of Words: " + (space+1) +
                    "\nNumber of times 'ed' appears in the text: " + ed);
             i++;
        }
        while(i!=3);
    }
}