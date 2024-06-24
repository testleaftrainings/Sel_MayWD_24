# POM with Cucumber:
   For TestNG _POM :
     - with driver as static -> sequential execution is possible
     - To have sequential and parallel execution declare Parameterized Constructor in each pages  
   For Cucumber_POM:
      - Constructor should not be defined 
      - With driver as static -> sequential execution is possible 

# POM with ThreadLocal:
# ThreadLocal:
   - Java class which is used to access each thread independently
   private static final ThreadLocal<ChromeDriver> chDriver = new ThreadLocal<ChromeDriver>();     
 private:
    - This variable can be accessed only within the class
 static+final
    - constant -> cannot change the value

    
	public void setDriver() {
        //Sets the current thread's copy of this thread-local variable
		chDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
        //Returns the value in the current thread's copy of this thread-local variable
		return chDriver.get();
	}

 # Encapsulation:
     - getter and setter methods   


# Exception:
    - Abnormal behaviour which stops the program execution

Excpetions:
   - Compile Time Exceptions or Checked Exceptions
   - RunTime Exception or Unchecked Exceptions
      - NullPointerException
      - NoSuchElementException
      - ArrayOutOfBoundsException
      - NoSuchWindowException
      - StaleElementReferenceException
      - ElementNotInteractableException
      - NoAlertPresentException
      - UnhandledAlertException


# Exception Handling:
   - Apply try / catch block
   - catch block will be exceuted only when there is an exception
   - we cannot have try block alone
   - we cannot have catch block alone
   - All the Exceptions are classes
   - Exception is the super class for all the Exceptions
   - Finally block will be getting executed irrespective of the exceptions
   - To handle exceptions catch block is mandatory
   - try block should be followed by either catch block / finally / catch & finally
          