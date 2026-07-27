public class Book{
	public String title;
	public String author;
	public boolean availability;
	
public Book(String title,String author,boolean availability){
	this.title=title;
	this.author=author;
	this.availability=availability;
}

public String getTitle(){
	return title;
}

public String getAuthor(){
	return author;
}

public boolean getAvailability(){
	return availability;
}

public void setTitle(String title){
	this.title=title;
}

public void setAuthor(String author){
	this.author=author;
}

public void setAvailability(boolean availability){
	this.availability=availability;
}

}