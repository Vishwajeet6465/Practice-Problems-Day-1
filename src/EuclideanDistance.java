import java.util.Scanner;

public class EuclideanDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).");
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter y: ");
		int y = sc.nextInt();
		
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("Euclidean Distance is: "+ distance);
		sc.close();
	}
}
