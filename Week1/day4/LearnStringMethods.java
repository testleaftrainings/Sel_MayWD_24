package week1.day4;

public class LearnStringMethods {

	public static void main(String[] args) {
		
		
		//To retrieve only the number
		
		String str="Amount5005";
		
		//replaceAll
		
		String replaceAll = str.replaceAll("[^0-9]", "");
		
		System.out.println(replaceAll);
		
		//add 1000 rupees to 5005
		
		System.out.println(replaceAll+1000);
		
		System.out.println("---------------------");
		//parseInt method
		//convert String into int
		
	    int parseInt = Integer.parseInt(replaceAll);
	    System.out.println(parseInt+1000);
	
	
        //subString
	
	    System.out.println("--------------");
	    
	    String str5="VineethBabu";
	    
	    String substring = str5.substring(3);
	
	    System.out.println(substring);
	
	    String substring2 = str5.substring(3, 8);
	    //eethB
	    System.out.println(substring2);
	
	
	}

}
