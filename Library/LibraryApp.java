public class LibraryApp{

public static void main(String args[]){
	FictionBook fictionBook1 = new FictionBook("The Great Gatsby","F. Scott Fitzgerald",true,"Classic");
	FictionBook fictionBook2 = new FictionBook("To Kill a Mockingbird", "Harper Lee", true, "Drama");
    FictionBook fictionBook3 = new FictionBook("1984", "George Orwell", true, "Dystopian");
    FictionBook fictionBook4 = new FictionBook("Pride and Prejudice", "Jane Austen", true, "Romance");
    FictionBook fictionBook5 = new FictionBook("The Catcher in the Rye", "J.D. Salinger", true, "Coming-of-age");
    FictionBook fictionBook6 = new FictionBook("The Hobbit", "J.R.R. Tolkien", true, "Fantasy");
    FictionBook fictionBook7 = new FictionBook("The Chronicles of Narnia", "C.S. Lewis", true, "Fantasy");
    FictionBook fictionBook8 = new FictionBook("Harry Potter and the Philosopher's Stone", "J.K. Rowling", true, "Fantasy");

Library library =new Library(8);

library.addBook(fictionBook1);
library.addBook(fictionBook2);
library.addBook(fictionBook3);
library.addBook(fictionBook4);
library.addBook(fictionBook5);
library.addBook(fictionBook6);
library.addBook(fictionBook7);
library.addBook(fictionBook8);

library.displayBooks();

for(int i=0; i<8; i++){
	if(library.books[i].getTitle()=="Rich Dad Poor Dad")
	{library.books[i].removeBook(i)}
}

library.displayBooks();



}

}