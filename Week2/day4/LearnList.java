package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	
public static void main(String[] args) {
	
	//declaring list
	List<String> students=new ArrayList<>();
	
	//empty list
	System.out.println("Empty list: " +students);
	
	
	//add an elements in the list
	students.add("Vikki");
	System.out.println(students);
	
	
	//adding more elements
	students.add("Uma");
	students.add("Giri");
	students.add("sudha");
	
	System.out.println(students);
	
	//add by index
	students.add(1, "Vineeth");
	System.out.println(students);
	
	//to get size of list
	int studentsSize = students.size();
	System.out.println(studentsSize);
	
	//remove an element
	students.remove(1);
	System.out.println("list after remove: "+students);
	
	//contains
	boolean contains = students.contains("Vikki");
	System.out.println(contains);
	
	//get
	String string = students.get(1);
	System.out.println(string);
	

	//clear
	students.clear();
	System.out.println(students);
	
	}

}
