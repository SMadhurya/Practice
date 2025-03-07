package Basics;
import java.util.Scanner;

public class Casecheck {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch>='a' && ch<='z') {
		System.out.println("Given Character is lowercase");
	}
	else {
		System.out.println("Given Character is Uppercase");
	}

	}

}
