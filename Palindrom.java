import java.util.*;
class Palindrom{
	public static void main(String args[])
	{int k=1;
	while(k>0){
		Scanner word=new Scanner(System.in);
		System.out.println("Enter the word : ");
		String w1=word.next();
		boolean pal=true;
		int con=w1.length()-1;
		for(int i=0; i<w1.length(); i++)
		{if(w1.charAt(i)!=w1.charAt(con))
			pal=false;
		
		con=con-1;
		}
		
		if(pal==true)
			System.out.println("It is palin");
		else
			System.out.println("It is not palin");
	}
	k++;}
}