package Question1;

import java.util.stream.IntStream;

public class PallindromeNumber {
	
	public static void main(String[] args) {
        int number = 220;
         int reduce = IntStream.iterate(number, i -> i / 10).map(n -> n % 10).limit(String.valueOf(number).length())
                 .reduce(0, (a, b) -> a = a * 10 + b);
         if(number == reduce) {
             System.out.println("The palindrome number is " + reduce);
         } else {
             System.out.println(number + " is not a palindrome number ");
         }
     }

}
