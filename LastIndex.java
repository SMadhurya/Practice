package Basics;

public class LastIndex {

	public static void main(String[] args) {
	String str = "The quick fox ran into the forest area";
	int a=str.lastIndexOf("a", str.length()-6);
	int l=str.length();
	int l2=str.length()-1;
	System.out.println("a = " +a + "l = " +l +"l2 = " +l2);

	}

}
