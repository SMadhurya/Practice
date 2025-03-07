package Basics;
import java.util.Scanner;

public class countrepeat {

	public static void main(String[] args) {
		// count the number of repeatation for the given input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:  ");
		int n = sc.nextInt();
		System.out.println("Enter the interger to count the number of repeatation :");
		int rep=sc.nextInt();
		int count=0;
		while(n>0) {
			int rem = n%10;
			n=n/10;
			if(rem==rep) {
				count++;
			}
			
		}
		System.out.println("The count of " +rep + " is : " +count);

	}

}
