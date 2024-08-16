import java.util.Scanner;

public class WhileLoopSumNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of N natural numbers using While Loop");
		System.out.println("Enter digit: ");
		int n = sc.nextInt();
		int sum = 0;
		
		int num = 0;
		while(num <= n) {
			sum = sum + num;
			num++;
		}
		System.out.println(sum);
		sc.close();
	}
}
