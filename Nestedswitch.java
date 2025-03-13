package Basics;
import java.util.Scanner;

public class Nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int empid =sc.nextInt();
		String dept =sc.next();
		switch(empid){
		case 1:
			System.out.println("Madhurya");
			break;
		case 2:
			System.out.println("Sudhindra");
			break;
		case 3:
			System.out.println("Suma");
			break;
		case 4:
			System.out.println("Sanjula");
			break;
		case 5:
			System.out.println("Karthik");
			break;
		case 6:
			System.out.println("Emp 6");
			switch(dept) {
			case "IT":
				System.out.println("IT");
				break;
			case "Management":
				System.out.println("Management");
				break;
				default:
					System.out.println("Invalid");
					
			}
			break;
			default:
				System.out.println("Emp ID not valid");
		}
			}
		

	}


