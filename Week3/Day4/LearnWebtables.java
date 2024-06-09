package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {

	public static void main(String[] args) {
		 //Launch Chrome Browser
        ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		  driver.get("https://leafground.com/table.xhtml");
		
		//Maximize the window
	      driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Locate the table
	      WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));

		
	    //To get the Row Count
		  List<WebElement> row = table.findElements(By.tagName("tr"));
		  int rowCount = row.size();
		  System.out.println("The row count is: "+rowCount);
		
		//To get the column count
		List<WebElement> column = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
		int coulumnCount = column.size();
	    System.out.println("The column count is: "+coulumnCount);
		
		//Retrieve the Specific data
		 WebElement row4Col1WE = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//tbody/tr[4]/td"));
		System.out.println(row4Col1WE.getText());
		
		//Retrieve the entire data in a specific row
		List<WebElement> row2Elements = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//tbody/tr[2]/td"));
		
	    for (WebElement rowElements : row2Elements) {
		String rowElementsText = rowElements.getText();
		System.out.println("The row elements are"+rowElementsText);
		}
		
		
		//Retrieve the entire data in the table
	       
	    //Method1:
	       
	    List<WebElement> allElements = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//tbody/tr/td"));
		
		for (WebElement alldatas : allElements) {
			String alltabledatas = alldatas.getText();
			System.out.println("All table datas:"+alltabledatas);
		}
		
	
		//Method 2: Dynamic
		
		for (int i = 1; i <= rowCount; i++) {
			WebElement eachRow = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//tbody/tr["+i+"]/td"));
			for (int j = 1; j <=coulumnCount; j++) {
			WebElement allRowsCoulmnsData = eachRow.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//tbody/tr["+i+"]/td["+j+"]"));
			System.out.println("The all datas are: "+allRowsCoulmnsData.getText());
			
			}
			
        }
		
	}

}
