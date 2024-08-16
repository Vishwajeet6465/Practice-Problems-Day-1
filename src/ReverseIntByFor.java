import java.util.Scanner;

public class ReverseIntByFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Reverse Number by For Loop");
		System.out.println("Enter digit");
		int num = sc.nextInt();
		String rev = "";
		
		for(int i = num; i > 0; i=i / 10) {
			int rem = i % 10;
			rev += rem;
			
		}
		
		System.out.println(rev);
		sc.close();
	}
}
