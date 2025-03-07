package Basics;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          int ans=0;
    	  while(true) {
              System.out.println("Enter the operation to be performed : ");

              char ch=sc.next().trim().charAt(0);

          if(ch == '+' || ch == '-' || ch=='*' || ch=='/' || ch=='%' ) {
              System.out.println("Enter the operands : ");

              int num1=sc.nextInt();
              int num2=sc.nextInt();
          
        	  
        		  if(ch=='+') {
        			  ans=num1+num2;
        		  }
        		  else if(ch=='-') {
        			  ans=num1-num2;
        		  }
        		  else if(ch=='*') {
        			  ans=num1*num2;
        		  }
        		  else if(ch=='/') {
        			  if(num2!=0) {
        				  
        				  ans=num1/num2;
        			  }
        			  else {
        				  ans=0;//this should be invalid
        			  }
        		  }
        		  else if (ch=='%'){
        			  ans=num1%num2;
        		  }
          }
        		  else if(ch=='x' || ch == 'X') {
        			  break;
        		  }
        	  
          
        	  
        	  else {
        		  System.out.println("Invalid");
        	  }
    	  
          System.out.println(ans);
    	  }
	}
}




