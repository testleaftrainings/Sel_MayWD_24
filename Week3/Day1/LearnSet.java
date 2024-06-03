package week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		//Set<String> mentors=new HashSet<String>();        //Random order
		
		//Set<String> mentors=new LinkedHashSet<String>();    //Insertion order
		
		 Set<String> mentors=new TreeSet<String>();           //Acsii Order
		
		//add
		mentors.add("Vinoth");   //0
		mentors.add("Raghu");    //1
		mentors.add("Muthu");     //2
		mentors.add("Muthu");    //3
		mentors.add("Vineeth");  //4
		mentors.add("Aravind");   //5
		     
		System.out.println(mentors);
		
		//remove
		
		mentors.remove("Vineeth");
		System.out.println("The treeset: "+mentors);
		
		
		//size
		
		int size = mentors.size();
		System.out.println("The size is: "+size);
		
		//addAll
		
		Set<String> staffs=new HashSet<String>();
		
		staffs.addAll(mentors);
		
		System.out.println("The new set:"+staffs);
		
		
		//retrieve an element from set
		//convert set to list
		
		List<String> staffs1=new ArrayList<String>(staffs);
		
		System.out.println("The list is:" +staffs1);
		
		String string = staffs1.get(0);
		
		System.out.println("The first index value:"+string);
		
		
		//to print all the elements in the list
		
		for (String staffsName : staffs1) {
			System.out.println("The individual list elements:"+staffsName);
		}
		
		
	}

}
