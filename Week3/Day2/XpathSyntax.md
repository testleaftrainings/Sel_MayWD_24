
1. **Relative Xpath:**

    a.*Basic xpath*
    1. Attribute based xPath:
       Syntax:
       `//tagname[@attributename='attributeValue']`
       Example:
      ` //input[@id='password']`
      `//input[@id='twotabsearchtextbox']`

    2. Text based xPath:
       Syntax:
       ` //tagname[text()='textvalue'] ` 
       Example:
       ` //a[text()='Leads']`
       `//span[text()='Hello, sign in']`

    3. Partial Attribute based xpath:
       Syntax:
       `//tagname[contains(@attributename,'partialattributevalue')]`
       Example:
         `//input[contains(@class,'decorative')]`
         `//input[contains(@id,'twotab')]`

    4. Partial Text based xpath:  
       Syntax:
         `//tagname[contains(text(),'partialtextvalue')] `
       Example:
        `//a[contains(text(),'SFA')]`  
        `//span[contains(text(),'Hello')]`

    5. Index based xpath:
       Syntax:
        `(//tagname[@attributename='attributeValue'])[2]`        
        ` (//tagname[text()='textvalue'])[3] `
       Example:
         `(//a[contains(text(),'Lead')])[3] `

      
    b.*Advanced xPath(Axes based xPath)*
     1. Parent to Child:
        Syntax:
         `BasicRelativeXpathforParent/childTagname`
        Example:
          `(//form[@id='login']/p)[2] `

     2. Child to Parent:
        Syntax:
         ` BasicRelativeXpathforChild/parent::parenttagname` 
        Example:
        ` //label[text()='Password']/parent::p`
         `//p[@class='top']/parent::form`    

     3. GrandParent to GrandChild:
        Syntax:
          `BasicRelativeXpathforGrandParent//grandchildTagname` 
        Example:
          `(//form[@id='login']//input)[3] `     

     4. GrandChild to GrandParent:
        Syntax:
            ` BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname`   
        Example:
          `//input[@class='decorativeSubmit']/ancestor::form` 

     5. ElderCousin to YoungerCousin:
        Syntax:
           `BasicRelativeXpathforElderCousin/following::youngerCousintagname`   
        Example:
           `//span[text()='Company Name']/following::input  
           
     6. YoungerCousin to ElderCousin:
        Syntax:
            `BasicRelativeXpathforYoungerCousin/preceding::ElderCousintagname`   
        Example:
           `//input[@id='createLeadForm_firstName']/preceding::input[2] ` 


     7. ElderSibling to YoungerSibling:
        Syntax:      
           `BasicRelativeXpathforElderSibling/following-sibling::youngerSiblingtagname`
        Example:
           `//label[text()='Username']/following-sibling::input`
      
     8. YoungerSibling to ElderSibling:
        Syntax:
          `BasicRelativeXpathforYoungerSibling/preceding-sibling::ElderSiblingtagname`
        Example:  
           `//input[@id='username']/preceding-sibling::label`    
              `       
     
### Exceptions:
### InvalidSelectorException
1. **Definition**: 
   - This exception occurs when the format of a given selector is incorrect or unsupported. 
2. **Common Causes**:
   - Syntax errors in the selector string.
3. **Handling Tips**:
   - Double-check the syntax of your selector.
   

### NoSuchElementException
1. **Definition**: 
     - This exception is thrown when an element could not be found on the page.
     - It indicates that the search operation did not locate the element within the current webpage.
2. **Common Causes**:
     - The element does not exist on the page at the time of search.
     - The selector used does not correctly identify the desired element.
     - The element is not loaded yet due to web page's dynamic loading or delays.
3. **Handling Tips**:
   - Ensure the correctness of the selector.
   - Use waits ( implicit) to allow time for the element to load.
   
