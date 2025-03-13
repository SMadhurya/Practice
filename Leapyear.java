package Basics;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year=sc.nextInt();
		
		if(year%4==0 && year%100!=0) {
            System.out.println("It is a Leap year");
		}
		
		else if(year%100==0 && year%400==0) {
               System.out.println("It is a Leap year");
		}
			else {
				System.out.println("It is not a Leap year");
			}
		}

	}


