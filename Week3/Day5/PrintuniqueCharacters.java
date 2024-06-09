package week3.day4;

import java.util.HashSet;
import java.util.Set;

public class PrintuniqueCharacters {

	public static void main(String[] args) {
		
		 String str = "babu";
	        char[] charArray = str.toCharArray();
	        
	        Set<Character> uniqueChars = new HashSet<>();
	        System.out.println(uniqueChars);
	        Set<Character> duplicateChars = new HashSet<>();
	        System.out.println(duplicateChars);
	        for (char c : charArray) {
	            if (!uniqueChars.add(c)) {
	                duplicateChars.add(c);
	            }
	        }
	        
	        uniqueChars.removeAll(duplicateChars);
	        
	        System.out.println(uniqueChars);
			
			
			}



	

}
