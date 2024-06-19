Steps to start with PageObjectModel
1. Create a new Project with the neccessary dependencies added in pom.xml
2. Create packages
     - base
         - Create ProjectSpecificMethods to have the common codes specific to the project
         - For sequential execution declare the driver as static
         - Create 2 methods
            preCondition() and postCondition()
            annotate the methods with @BeforeMethod and @AfterMethod respectively
     - pages
         - Create classes for each pages
         - All the pages should extend ProjectSpecificMethods   
         - Inside each pages create methods for each action
              LoginPage extends ProjectSpecificMethods
               - create enterUsername()
                  - Add return statement according to the page navigation
                  - if an action stays in the samepage return this(this represents the current class object)
                  - return this;
               - create enterPassword()
                  - return this;
               - create clickLoginButton()
                  - if an action navigates to a particular page 
                  - return new particularPage();
                  - return new WelcomePage();
             WelcomePage
               - clickCRMSFALink 
                 - return new MyHomePage();
      - testcases
         - Create classes for each testcases and all the testcases should extend ProjectSpecificMethods
         - Create RunCreateLead class
         - Create runCreateLead() and annotate with @test 
         - Create Object for LoginPage and call the methods and execute


        