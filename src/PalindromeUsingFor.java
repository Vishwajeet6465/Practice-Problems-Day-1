import java.util.Scanner;

public class PalindromeUsingFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Palindrome Number Checking by For Loop");
		System.out.println("Enter digit");
		int num = sc.nextInt();
		String rev = "";
		
		for(int i = num; i > 0; i=i / 10) {
			int rem = i % 10;
			rev += rem;
			
		}
		
		int reversed = Integer.parseInt(rev);
		if(reversed == num) {
			System.out.println("Number entered is Palindrome.");
		}
		else {
			System.out.println("Number entered is not Palindrome");
		}
		sc.close();
	}
}
