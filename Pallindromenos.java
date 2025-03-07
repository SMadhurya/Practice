package Basics;

public class Pallindromenos {

	public static void main(String[] args) {
          int n=1222345321;
          int ans=0;
          while(n>0) {
        	  int rem=n%10;
        	  n=n/10;
        	  ans=ans*10+rem;
          }
          System.out.println("Print the reversed number : " + ans);
	}

}
