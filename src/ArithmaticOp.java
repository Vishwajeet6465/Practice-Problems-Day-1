import java.util.Scanner;
public class ArithmaticOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculating Arithmetic Operations i) a+b*c ii) c+a/b\r\n"
				+ "iii) a%b+c iV) a*b+c");
		System.out.println("Enter the Number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Number 2:");
		int num2 = sc.nextInt();
		System.out.println("Enter the Number 3:");
		int num3 = sc.nextInt();
		
		int i = num1+num2*num3;
		float ii = num3+num1/num2;
		float iii = num1%num2+num3;
		int iv = num1*num2+num3;
		
		System.out.println("i) a+b*c : " + i);
		System.out.println("ii) c+a/b : " + ii);
		System.out.println("iii) a%b+c : " + iii);
		System.out.println("iv) a*b+c : " + iv);
		sc.close();
	}
}
