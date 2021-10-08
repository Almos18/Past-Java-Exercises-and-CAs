package labsheet4.exercise5;

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
        if(title.equals("") || title == null)
        {
            this.title = "No Valid Title Supplied";
        }
        else
            this.title = title;
    }

    public void setPrice(double price)
    {
        if(price<0 || price > 6000)
        {
            this.price = 0;
        }
        else
            this.price = price;
    }

    public void setPages(int pages)
    {
        if(pages < 1 || pages > 4000) {
            this.pages = 0;
        }
        else
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

    public void setISBN(String ISBN)
    {
        if(ISBN == null || ISBN.equals(""))
            this.ISBN = "No Valid ISBN Supplied";
        else
            this.ISBN = ISBN;
    }

    public int getPages()
    {
        return pages;
    }

    public String setString()
    {
        return "Title: " + getTitle() + "\nPrice: " +
                getPrice() + "\nISBN: " + getISBN() +
                "\nNumber of Pages: " + getPages();
    }
}
