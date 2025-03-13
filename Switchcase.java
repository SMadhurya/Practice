package Basics;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fruit=sc.next();
		
		switch (fruit){
			case "Mango":
				System.out.println("King of fruits");
				break;
			case "Apple":
			System.out.println("Sweet red fruit");
			break;
			
			default:
				System.out.println("Please enter valid fruit");
		}

	}

}
