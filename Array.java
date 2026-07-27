public class Array{
	public int[] marks;
	
	public void print(){
	for(int i=0; i<marks.length; i++){
	System.out.println(marks[i]);
	}
	}
	
	public static void main(String args[]){
		Array t1 = new Array();
		t1.marks=new int[]{1,2,3,45,4,5,3,4,2};
		t1.print();
		
	}

}