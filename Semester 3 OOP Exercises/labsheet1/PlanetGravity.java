package labsheet1;

import java.util.*;

public class PlanetGravity {

    public static void main(String args[])
    {
        double earthMass, earthRadius, planetMass, planetRadius, result;
        double ACCELERATION = 9.81;

        Scanner Input = new Scanner(System.in);

        System.out.print("Please enter the mass of planet Earth: ");
        earthMass = Input.nextDouble();

        System.out.print("Please enter the radius of planet Earth: ");
        earthRadius = Input.nextDouble();

        System.out.print("Please enter the mass of a planet: ");
        planetMass = Input.nextDouble();

        System.out.print("Please enter the radius of a planet: ");
        planetRadius = Input.nextDouble();

        result = ((ACCELERATION*((earthRadius*earthRadius)*planetMass)) / ((planetRadius*planetRadius)*earthMass));

        System.out.print("The acceleration due to gravity on the other planet is " +
        result + " m/s/s");
    }
}