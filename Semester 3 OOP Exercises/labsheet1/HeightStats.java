package labsheet1;

import java.util.Scanner;

public class HeightStats {

    public static void main(String args[])
    {
        double height, heightAVG=0, smallestHeight=2.72, GOLBAL_AVERAGE=1.665, aboveAVG=0;
        int inclusive=0;

        Scanner Input = new Scanner(System.in);

        for(int i=0;i<6;i++)
        {
            System.out.print("Loop " + (i+1) + "- Please enter height: ");
            height = Input.nextDouble();

            while(height>2.72 || height<0.5464)
            {
                System.out.print("Loop " + (i+1) + " Height value invalid!!! Please re-enter height: ");
                height = Input.nextDouble();
            }
            heightAVG += height;

            if(height<smallestHeight)
            {
                smallestHeight=height;
            }

            if(height>=1.3 && height<=1.9)
            {
                inclusive++;
            }

            if(height>GOLBAL_AVERAGE)
            {
                aboveAVG+=16.6666666666667;
            }
        }

        System.out.print("___________________________\n\n\tHeight Statistics\n___________________________" +
                "\nThe average of the height entered is " + (heightAVG/6) + "m" +
                "\nThe smallest height value entered is " + smallestHeight + "m" +
                "\nThe number of height values between 1.3m and 1.9m inclusive is " + inclusive +
                "\nThe percentage of height values exceeding the global average height is " + aboveAVG + "%");
    }
}
