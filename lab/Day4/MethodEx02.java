import java.util.Scanner;
class MethodEx02{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1=sc.nextInt();
		System.out.println("Enter number2:");
		int num2=sc.nextInt();	
		MethodEx02 me02=new MethodEx02();
		int add=me02.add(num1,num2);
		System.out.println(num1+"+"+num2+"="+add);
		System.out.println(num1+"-"+num2+"="+me02.sub(num1,num2));
		System.out.println(num1+"/"+num2+"="+me02.div(num1,num2));
		System.out.println(num1+"*"+num2+"="+me02.mul(num1,num2));
	}
	public int add(int a,int b){
		return (a+b);
	}
	public int sub(int a,int b){
		return (a-b);
	}
	public double div(int a,int b){
		return ((double)a/(double)b);
	}
	public int mul(int a,int b){
		return (a*b);
	}
}
/*
C:\CAMPUS DOCS\IT1214&CSC1213\31-12-2020>javac MethodEx02.java

C:\CAMPUS DOCS\IT1214&CSC1213\31-12-2020>java MethodEx02
Enter number1:
45
Enter number2:
35
45+35=80
45-35=10
45/35=1.2857142857142858
45*35=1575

C:\CAMPUS DOCS\IT1214&CSC1213\31-12-2020>*/