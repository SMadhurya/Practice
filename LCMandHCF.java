package Basics;
import java.util.Scanner;

public class LCMandHCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a =sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		int max=(a>b)? a:b;
		while(true) {
			if(max%a==0 && max%b==0) {
				break;
			}
			max++;
		}
		int hcf=(a*b)/max;
		System.out.println("LCM of " +a +"and" +b +" is : " +max );
		System.out.println("HCF of " +a +"and" +b +" is : " +hcf );

	}

}
