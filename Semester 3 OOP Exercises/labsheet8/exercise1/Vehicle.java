package labsheet8.exercise1;

public class Vehicle {
    private double price;
    private double length;
    private double height;
    private double weight;
    private String manufacturer;
    private String model;

    public Vehicle() { this(0,0,0,0,"","");}

    public Vehicle(double pr, double len, double hei, double wei, String manu, String mod)
    {
      setPrice(pr);
      setLength(len);
      setHeight(hei);
      setManufacturer(manu);
      setModel(mod);
      toString();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        price = pr;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double len) {
        length = len;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double hei) {
        height = hei;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double wei) {
        weight = wei;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manu) {
        manufacturer = manu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String mod) {
        model = mod;
    }

    @Override
    public String toString() {
        return "\nPrice " + getPrice() + "\nLength " + getLength() + "\nHeight " + getHeight() +
                "\nWeight " + getWeight() + "\nManufacturer " + getManufacturer() + "\nModel " + getModel();
    }
}
