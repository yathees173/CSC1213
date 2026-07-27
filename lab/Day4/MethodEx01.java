class MethodEx01{
	public static void main(String args[]){
		MethodEx01 me=new MethodEx01();
		me.sayHello();
		MethodEx01.sayHi();
		sayHi();//don't need to have instance to call
	}//end of main method
	//<access-modifier> <return-type> <name-of-the-method>(parametre-list)
	public void sayHello(){
		System.out.println("Hello user!");
	}//end of sayHello method
	public void sayHello2(){
		sayHello();
	}
	public static void sayHi(){
		System.out.println("Hi user!");
	}//end of sayHi method
}