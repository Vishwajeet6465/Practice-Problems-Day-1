import java.util.Scanner;

public class ReverseIntByWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Reverse number using While Loop");
		System.out.println("Enter digit: ");
		int n = sc.nextInt();
		String reverse = "";
		
		int temp = n;
		while(temp > 0) {
			int rem = temp % 10;
			reverse += rem;
			temp = temp / 10;
		}
		
		System.out.println(reverse);
		sc.close();
	}
}
