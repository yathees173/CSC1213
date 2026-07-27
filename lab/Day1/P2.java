class P2{
	public static void main(String args[])
	{
		int x=5;
		int y=4;
		//arithmetic operators
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(++x);//x=x+1
		System.out.println(--x);//x=x-1
		
		int z=3;
		z+=3;
		//Assignment operators
		System.out.println(z);
		
		//comparision operators
		
		int m=7;
		int n=10;
		
		System.out.println(m!=n);//not equal
		
		//logical operators
		System.out.println(m>3 && n>5);
		System.out.println(m>10 || n>5);
		System.out.println(!(m>3 && n>5));
	}
}