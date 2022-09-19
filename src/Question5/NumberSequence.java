package Question5;

public class NumberSequence {
	
		public static void main(String[] args) {

			int a = 8;
			int b = 6;
			int n = 9;

			for (int i = 1; i <= n; i++) {
				int c = a + b;
				System.out.print(a + " " + b + " " + c);
				System.out.println(" ");
				a = c;
				b = b + 1;

			}

		}

	

}
