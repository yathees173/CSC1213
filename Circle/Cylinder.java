public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(){
		super();
		this.height=1.0;
	}
	
	public Cylinder(double radius){
		super("Red",radius);
		this.height=1.0;
	}
	
	public Cylinder(double radius, double height){
		super("Red",radius);
		this.height=height;
	}
	
	public Cylinder(double radius, double height, String color){
		super(color,radius);
		this.height=height;	
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		this.height=height;
	}
	
	public double getVolume(){
		return (22/7.0)*getRadius()*getRadius()*height;
	}
	
	public void display(){
		System.out.println("Cylinder height is "+height+", radius is "+getRadius()+", color is "+getColor());
		System.out.println("The volume of the Cylinder is "+getVolume()+"\n");
	}
}