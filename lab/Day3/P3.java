import java.util.Scanner;
public class P3{
	
	public static void main(String args[]){
		
		//Student asp01=new Student();
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Enter the double input: ");
		double n=sc.nextDouble();
		System.out.println("The double value is : "+n);
		
		System.out.println("Enter the float input: ");
		float n=sc.nextFloat();
		System.out.println("The float value is : "+n);*/
		
		System.out.println("Enter the String input: ");
		String n=sc.nextLine();
		System.out.println("The string value is : "+n);
		
		char arr[]=new char[n.length()];
		
		for(int i=0; i<n.length(); i++)
			arr[i]=n.charAt(i);
		
		//check the palindrome
		
		for(int i=0; i<n.length(); i++)
			System.out.println(arr[i]);
		
		
	}
	
}