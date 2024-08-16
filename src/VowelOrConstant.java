import java.util.Scanner;

public class VowelOrConstant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vowel or Constant Checking");
		System.out.println("Enter Charactr");
		String c = sc.next();
		
		switch (c) {
		case "a","A","e","E","i","I","o","O","u","U":
			System.out.println("It is Vowel.");
			break;

		default:
			System.out.println("It is Constant.");
			break;
		}
				
		sc.close();
	}
}
