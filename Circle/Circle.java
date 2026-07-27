public class Circle{
	private String color;
	private double radius;
	
	public Circle(){
		this.color="Red";
		this.radius=1.0;
	}
	
	public Circle(double radius){
		this.color="Red";
		this.radius=radius;
	}
	
	public Circle(String color, double radius){
		this.color=color;
		this.radius=radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public double getArea(){
		return (22/7.0)*getRadius()*getRadius();
	}
	
	public void display(){
		System.out.println("Circle radius is "+getRadius()+", color is "+getColor());
		System.out.println("The Sureface of the Circle is "+getArea()+"\n");
	}
	
}
	