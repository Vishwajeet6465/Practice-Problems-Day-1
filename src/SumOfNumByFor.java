import java.util.Scanner;

public class SumOfNumByFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of N Natural Numbers by For Loop");
		System.out.println("Enter digit: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("Sum of Numbers: "+ sum);
		sc.close();
	}
}
