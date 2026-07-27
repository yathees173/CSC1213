public class Library{
	public Book[] books;

public Library(int capacity){
	this.books=new Book[capacity];
}

public Book[] getBooks(){
	return books;
}

public void setBooks(Book[] books){
	this.books=books;
}

public void addBook(Book book){
	for(int i=0; i<books.length; i++){
		if(books[i]==null){
			books[i]=book;
		}
		
		
	}
	
}

public void removeBook(int index){
	for(int i=0; i<books.length; i++){	
	if(i==index){
		books[i]=null;
	}
	else{
		System.out.println("The Book was not available...");
	}
	}
}

public void displayBooks(){
	for(int i=0; i<books.length; i++){
		System.out.println("Title : " + books[i].getTitle());
		System.out.println("Author : " + books[i].getAuthor());
		System.out.println("Avaialability : " + books[i].getAvailability());
		System.out.println();
	}

}

}