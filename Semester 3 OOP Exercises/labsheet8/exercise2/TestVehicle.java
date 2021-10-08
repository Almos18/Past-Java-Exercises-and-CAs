package labsheet8.exercise2;

public class TestVehicle {
    public static void main(String[] args) {

        String output;

        Car car1 = new Car();

        output = "\n\nTesting the Car no arg constructor:" + car1.toString();

        Car car2 = new Car(100000,4.5,1.25,2000,"Ferrari","F2",2,"97-L-985671");

        output += "\n\nTesting the Car multi-arg constructor:" + car2.toString();

        Bicycle bicycle1 = new Bicycle();

        output += "\n\nTesting the Bicycle no arg constructor:" + bicycle1.toString();

        Bicycle bicycle2 = new Bicycle(500,1.5,1,50,"Raleigh","Mountainbike", 4, true);

        output += "\n\nTesting the Bicycle multi-arg constructor" + bicycle2.toString();

        System.out.print(output);
    }
}
