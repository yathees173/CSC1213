
class par{
 static int peremeter(int a, int b)
	{ return a*b;}
}

class Class_metho{
	
 /* static int peremeter(int a, int b)
	{ return 2*(a+b);}
	
	static int area(int a, int b)
	{ return a*b;}
	*/
	
	public static void main(String args[])
{
	//par ans=new par();
	System.out.println(par.peremeter(5,7));
	//System.out.println(area(5,7));
}

}