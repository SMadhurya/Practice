package Basics;
import java.util.Scanner;

public class Febonacci {

	public static void main(String[] args) {
		//Find the nth Febonacci number
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a=0;
		int b=1;
		for (int i=2;i<=n;i++) {
		int sum=b;
			b=b+a;
			a=sum;
		}
			System.out.print(b +" ");

			}

}
