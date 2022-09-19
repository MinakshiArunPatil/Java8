package Question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Question3.OperationPerform;

class MyMaths1{
	
	public static boolean checker(OperationPerform p, int num, int numb) {
	return p.check(num, numb);
}

public static OperationPerform isPalindrome() {
	return (a, c) -> c == Integer.parseInt(new StringBuilder(String.valueOf(c)).reverse().toString()) ? true
			: false;
}

public static OperationPerform isEven() {
	return (a, c) -> (c % 2 == 0) ? true : false;

}

public static OperationPerform isOdd() {
	return (a, c) -> (c % 2 != 0) ? true : false;

}

}

public class CheckNo {

public static void main(String[] args) throws NumberFormatException, IOException {

	MyMaths1 ob = new MyMaths1();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number to check for Palindrome");
	int T = Integer.parseInt(br.readLine());
	int input = Integer.parseInt(br.readLine());

	OperationPerform op;
	boolean ret = false;
	String ans = null;

	// op = ob.isPalindrome();

	// System.out.println(ans);

	if (T == 1) {
		op = ob.isEven();
		ret = ob.checker(op, T, input);
		ans = (ret) ? "ODD" : "EVEN";
		if (ret == true) {
			System.out.println(" num is even");
		}
		System.out.println(" num is not even");
	}
	if (T == 2) {
		op = ob.isOdd();
		ret = ob.checker(op, T, input);
		ans = (ret) ? "ODD" : "EVEN";
		// System.out.println(ret);
		if (ret == true) {
			System.out.println(" num is odd");
		}
		System.out.println("num is not odd");
	}
	if (T == 4) {
		op = ob.isPalindrome();
		ret = ob.checker(op, T, input);

		ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
		if (ans == "PALINDROME") {
			System.out.println("it is palindrome");
		}
		System.out.println("it is not palindrome");
	}
	
	br.close();
}
}

	


