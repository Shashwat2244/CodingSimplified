import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int a = sc.nextInt();
		System.out.println("Enter the second integer: ");
		int b = sc.nextInt();
		System.out.println("Enter the operand ( + / - / % / *)");
		char c = sc.next().charAt(0);
		int ans = 0;
		if(c == '+') {
			ans = a+b;
		}
		else if(c == '-') {
			ans = a-b;
		}else if(c == '%') {
			ans = a/b;
		}
		else if(c=='*') {
			ans = a*b;
		}else {
			System.out.println("Invalid Operand");
		}
		System.out.println("Answer: " + ans);
	}

}
