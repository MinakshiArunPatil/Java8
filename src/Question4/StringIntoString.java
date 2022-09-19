package Question4;

import java.util.Arrays;
import java.util.List;

public class StringIntoString {
	
	    public static void main(String[] args) {



	       List<String> list = Arrays.asList("Hi ","one");



	       StringBuilder sb = new StringBuilder();
	        list.forEach(sb::append);
	       
	        System.out.println(sb.insert(2, " every"));
	       


	       System.out.println(sb);
	    }
}
