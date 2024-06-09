package week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] nums= {2,4,5,7,2,8,7};
		
		Set<Integer> uniqueNumbers=new TreeSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			uniqueNumbers.add(nums[i]);
			
		}
		System.out.println(uniqueNumbers);
		
	}

}
