package labsheet3.exercise2;

public class Computer {
    private String manufacturer;
    private String type;
    private double speed;
    private int RAM;
    private double price;

    public Computer() {
        this("Not available","Not available",0,0,0);
    }

    public Computer(String manufacturer, String type, double speed, int RAM, double price) {
        setManufacturer(manufacturer);
        setType(type);
        setSpeed(speed);
        setRAM(RAM);
        setPrice(price);
    }

   /* public Computer(String manufacturer2, String type2, double speed2, int RAM2, double price2) {
        this.manufacturer = manufacturer2;
        this.type = type2;
        this.speed = speed2;
        this.RAM = RAM2;
        this.price = price2;
    }*/

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public double getSpeed() {
        return speed;
    }

    public int getRAM() {
        return RAM;
    }

    public double getPrice() {
        return price;
    }


    /*public String getManufacturer2() {
        return manufacturer;
    }

    public String getType2() {
        return type;
    }

    public double getSpeed2() {
        return speed;
    }

    public int getRAM2() {
        return RAM;
    }

    public double getPrice2() {
        return price;
    }*/


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(double speed) {
        if (speed > 0)
            this.speed = speed;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*public void setManufacturer2(String manufacturer2) {
        this.manufacturer = manufacturer2;
    }

    public void setType2(String type2) {
        this.type = type2;
    }

    public void setSpeed2(double speed2) {
        if (speed > 0)
            this.speed = speed2;
    }

    public void setRAM2(int RAM2) {
        this.RAM = RAM2;
    }

    public void setPrice2(double price2) {
        this.price = price2;
    }*/

    public String toString() {
        return "Manufacturer: " + getManufacturer() + "\nType: " + getType() + "\nSpeed: " + getSpeed() +
                "\nRAM: " + getRAM() + "\nPrice " + getPrice();

    /*public String toString() {
        return "Manufacturer: " + getManufacturer() + "\nType: " + getType() + "\nSpeed: " + getSpeed() +
                "\nRAM: " + getRAM() + "\nPrice " + getPrice();
        }*/
    }
}