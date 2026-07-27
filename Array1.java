/*Define a class called student. Add relevant data like name, roll no, marks in an array.
Define marksTotal method. Create different student objects, assign values and invoke the method*/

class Array1{
	Array1 name;
	int rollNo;
	int[] marks;
	
	int marksTotal(){
		int sum=0;
		for(int i=0;i<marks.length;i++){
			sum=sum+marks[i];
		}
		return sum;
	}

	 public static void main(String args[]) {
        Array1 mk = new Array1();
        mk.marks = new int[]{50, 60, 85, 92};  

        int total = mk.marksTotal();        
        System.out.println("Total marks: " + total);  
    }
}
