package labsheet8.exercise1;

public class Car extends Vehicle{
    private int maxPassengers;
    private String registrationNumber;

    public Car()
    {
        setMaxPassengers(0);
        setRegistrationNumber("No Registration Number");
    }
    public Car(double pri, double len, double hei, double wei, String manu, String mod, int pass, String reg)
    {
        super(pri, len, hei, wei, manu, mod);
        setMaxPassengers(pass);
        setRegistrationNumber(reg);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int pass) {
        maxPassengers = pass;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String reg) {
        registrationNumber = reg;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMaxPassengers " + getMaxPassengers() + "\nRegistrationNumber " + getRegistrationNumber();
    }
}