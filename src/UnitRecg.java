import java.util.Scanner;

public class UnitRecg {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Unit Recognition");
	System.out.println("Enter digit: ");
	String n = sc.next();
	
	if(n.length() == 1) {
		System.out.println("Unit");
	}
	else if(n.length() == 2) {
		System.out.println("Ten");
	}
	else if(n.length() == 3) {
		System.out.println("Hundred");
	}
	else if(n.length() == 4) {
		System.out.println("Thousand");
	}
	sc.close();
}
}
