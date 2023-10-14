package week1.day2;

public class Palindrome {
	 public static void main(String[] args) {
		 int num=35453;
		 int a, sum=0,temp;
		 temp=num;
		 while(num>0) {		 
		 a=num%10;		 
		 sum=(sum*10)+a;		 
		 num=num/10;
		 }
		if(temp==sum)
			System.out.println("Is Palindrome" );
		else
			System.out.println("Not a Palindrome");
	}
}
