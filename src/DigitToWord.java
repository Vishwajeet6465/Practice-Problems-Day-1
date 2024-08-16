import java.util.Scanner;

public class DigitToWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit: ");
		String n = sc.next();
		
		String[] unit = new String[] {"zero ","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
		String[] decimal = new String[] {"","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","ninteen "};
		String[] multipleoften = new String[] {"","","twenty ","thirty ","fourty ","fifty ","sixty ","seventy ","eighty ","ninty "};
		String[] poweroften = new String[] {"hundred ","thousand "};
		
		char[] num = n.toCharArray();
		int len = num.length;
		String word = "";
		
		if(len == 1) {
			word = unit[num[0]-'0'];
			System.out.println(word);
		}
		else if(len == 2) {
			
			if(num[0]-'0' == 1) {
				int sum = (num[0]-'0') + (num[1]-'0');
				System.out.println(decimal[sum]);
			}
			else {
				word += multipleoften[num[0]-'0'];
				word += unit[num[1]-'0'];
				System.out.println(word);
			}
		}
		else if(len == 3) {
			word += unit[num[0]-'0'];
			word += poweroften[0];
			
			if(num[1]-'0' == 1) {
				int sum = (num[1]-'0') + (num[2]-'0');
				word += decimal[sum];
				System.out.println(word);
			}
			else {
				word += multipleoften[num[1]-'0'];
				word += unit[num[2]-'0'];
				System.out.println(word);
			}
		}
		else if(len == 4) {
			word += unit[num[0]-'0'];
			word += poweroften[1];
			
			word += unit[num[1]-'0'];
			word += poweroften[0];
			
			if(num[2]-'0' == 1) {
				int sum = (num[2]-'0') + (num[3]-'0');
				word += decimal[sum];
				System.out.println(word);
			}
			else {
				word += multipleoften[num[2]-'0'];
				word += unit[num[3]-'0'];
				System.out.println(word);
			}
			
		}
		else {
			System.out.println("Enter the number less than 10000");
		}
		sc.close();
	}
}
