import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is this date is in Spring Season.");
		System.out.println("Enter the Month");
		int month = sc.nextInt();
		System.out.println("Enter the Day");
		int day = sc.nextInt();
		
		if((month == 3 && day > 19) && (month == 3 && day < 32)) {
			System.out.println("It is in Spring Season");
			
		}
		else if((month == 4 && day > 0) && (month == 4 && day < 31)) {
			System.out.println("It is in Spring Season");
		}
		else if((month == 5 && day > 0) && (month == 5 && day < 31)) {
			System.out.println("It is in Spring Season");
		}
		else if((month == 6 && day > 0) && (month == 6 && day < 21)) {
			System.out.println("It is in Spring Season");
		}
		else {
			System.out.println("This is not spring Season");
		}
		sc.close();
	}
}
