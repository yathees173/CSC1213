public class BookStore {
    public static void main(String[] args) {
        // Create instances of Author
        Author author1 = new Author("David", 'M', 34);
        Author author2 = new Author("Tharaka", 'F', 52);
        Author author3 = new Author("Henry", 'M', 45);
        Author author4 = new Author("Jeny", 'F', 32);
        Author author5 = new Author("Anjelina", 'F', 38);

        // Create instances of Book
        Book book1 = new Book("Introduction to Java", 450, 300, author1);
        Book book2 = new Book("Head First C++", 800, 450, author2);
        Book book3 = new Book("JavaScript", 750, 350, author3);
        Book book4 = new Book("C#", 600, 300, author4);
        Book book5 = new Book("PHP", 450, 250, author5);

        // Array of books
        Book[] books = { book1, book2, book3, book4, book5 };

        // Print details of books with price greater than 500
        System.out.println("Books with price greater than 500:");
        for (Book book : books) {
            if (book.getPrice() > 500) {
                book.displayDetails();
                System.out.println();
            }
        }

        // Print details of books with number of pages less than 400
        System.out.println("Books with number of pages less than 400:");
        for (Book book : books) {
            if (book.getNumberOfPages() < 400) {
                book.displayDetails();
                System.out.println();
            }
        }

        // Print details of books with author's age less than 40
        System.out.println("Books with author's age less than 40:");
        for (Book book : books) {
            if (book.getAuthor().getAge() < 40) {
                book.displayDetails();
                System.out.println();
            }
        }

        // Print details of books written by female authors
        System.out.println("Books written by female authors:");
        for (Book book : books) {
            if (book.getAuthor().getSer() == 'F') {
                book.displayDetails();
                System.out.println();
            }
        }
    }
}