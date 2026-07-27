public class P2{
	
	public static void main(String args[]){
		
		//int arr[]= {1,2,3,4,5};
		int arr[]=new int[5];
		
		for(int i=0; i<5; i++){
			int tri=((i+1)*(i+2))/2;
			arr[i]=tri;
		}
			
		
		for(int i=0; i<5; i++)
			System.out.println(arr[i]);
		
		
		
		
	}
	
}