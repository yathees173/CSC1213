public class Book {
    // Private attributes
    private String title;
    private int numberOfPages;
    private double price;
    private Author author;

    // Public constructor to initialize the attributes
    public Book(String title, int numberOfPages, double price, Author author) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.author = author;
    }

    // Public setter for numberOfPages
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Public setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Public getter for title
    public String getTitle() {
        return title;
    }

    // Public getter for numberOfPages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Public getter for price
    public double getPrice() {
        return price;
    }

    // Public getter for author
    public Author getAuthor() {
        return author;
    }

    // Public method to display the details of the book along with the author's details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Price: " + price);
        System.out.println("Author Details:");
        System.out.println("Name: " + author.getName());
        System.out.println("Ser: " + author.getSer());
        System.out.println("Age: " + author.getAge());
    }

   }