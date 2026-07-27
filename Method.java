import java.util.Scanner;
public class Method
	{	static double mul(double a, double b)	
		{
			return a*b;
		}
		static void add(double a, double b)	
		{
			System.out.println("Addition : "+ (a+b));
		}
		
		static void sub(double a, double b)	
		{
			System.out.println("Subtraction : "+ (a-b));
		}
		
		static void div(double a, double b)	
		{
			System.out.println("Division : "+ (a/b));
		}
	
		public static void main(String args[])
		{Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length : ");
		double l=sc.nextDouble();
		System.out.println("Enter the width : ");
		double w=sc.nextDouble();
		System.out.println("The answer : "+ mul(l,w));
		add(l,w);
		sub(l,w);
		div(l,w);
		
		
			
		}
	}