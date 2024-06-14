
# Steps to create excel sheet inside the project:
   -> Right click on the Project -> New Folder -> data -> finish 
   -> Right click on the data folder -> Show in -> System Explorer 
   -> Open data folder -> Create new Excel worksheet and give a name
   -> Inside the excel sheet -> Enter all the datas and save and close the workbook
   -> Finally, refresh the data folder inside your project -> You can see the 
      excel sheet inside 


## How to read data from Excel?

    - Microsoft Excel
    - Apache POI - access MS office software 
    - Excel extensions : .xls, .xlsx


 - Workbook (CreateLead.xlsx)
 -  WorkSheet (Sheet1, Sheet 2)
   - Rows
    - Column (cell)


How to integrate Apache POI with TestNG?
1. Convert the method with return type as String[][] and keep the method as a static
2. Push all the excel data to the array
3. Inside the String[][] remove the hardcoded value and mention the rowCount and columnCount
4. Close the workbook and return the data


Steps:
  1. Pass input argument to the readExcel method and replace the hardcoded excel sheet name
  2. Create sendData() and annotate with @DataProvider
      -Inside this method call readExcel() and parameterize the filename by creating the fileName globally in the BaseClass
         @DataProvider
	public String[][] sendData() throws IOException { 
		
		return ReadExcelDataIntegration.readExcel(fileName);
         

	}
  3. Create setValues() and annotate with @BeforeTest in each testcase to mention the fileName
      @BeforeTest
	public void setValues() {
		fileName="CreateLead";
	}
	
  4. Finally, run different classes from the xml file 


@BS 
   
   @BT              - setValues()
      
      @BC         

         @DP        - sendData()

           @BM      - preCondition()
      

             @Test

           @AM

      @AC

  @AT

@AS      
