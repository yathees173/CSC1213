class Constructor{
	static int i;
	static double d;
	static float f;
	static char c;
	static String s;
	static boolean b;
	
	/*Constructor(){
		this.c=' ';
		this.f=0;
		this.d=0;
		this.s="";
		this.b=true;
	}
	*/
	static void display(){
		System.out.println(i+" "+d+" "+f+" "+c+" "+s+" "+b);
	}
	
	
	
	public static void main(String[] args){
		//Constructor c1=new Constructor();
		display();
	
	}
}