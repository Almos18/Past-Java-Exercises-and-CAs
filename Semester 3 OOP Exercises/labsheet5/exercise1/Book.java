package labsheet5.exercise1;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book() { this("No Title Available", 0.0, "No ISBN Available", 0);}

    public Book(String title, double price, String ISBN, int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }


    public String getTitle()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public int getPages()
    {
        return pages;
    }

    public String setString()
    {
        return "Title: " + getTitle() + "\nPrice: " + getPrice() + "\nISBN: " + getISBN() + "\nNumber of Pages: " + getPages();
    }
}
