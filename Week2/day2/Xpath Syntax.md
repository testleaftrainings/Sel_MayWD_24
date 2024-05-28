


1. Relative Xpath:

    a.Basic xpath
    1. Attribute based xPath:
       Syntax:
       //tagname[@attributename='attributeValue']
       Example:
      //input[@id='password']
      //input[@id='twotabsearchtextbox']

    2. Text based xPath:
       Syntax:
       //tagname[text()='textvalue'] 
       Example:
       //a[text()='Leads']
       //span[text()='Hello, sign in']

    3. Partial Attribute based xpath:
       Syntax:
       //tagname[contains(@attributename,'partialattributevalue')]
       Example:
         //input[contains(@class,'decorative')]
         //input[contains(@id,'twotab')]

    4. Partial Text based xpath:  
       Syntax:
         //tagname[contains(text(),'partialtextvalue')] 
       Example:
        //a[contains(text(),'SFA')]  
        //span[contains(text(),'Hello')]

    5. Index based xpath:
       Syntax:
        (//tagname[@attributename='attributeValue'])[2]       
         (//tagname[text()='textvalue'])[3] `
       Example:
         (//a[contains(text(),'Lead')])[3]

      
    b.Advanced xPath(Axes based xPath)
     1. Parent to Child:
        Syntax:
         BasicRelativeXpathforParent/childTagname
        Example:
          (//form[@id='login']/p)[2] 

     2. Child to Parent:
        Syntax:
         BasicRelativeXpathforChild/parent::parenttagname
        Example:
        //label[text()='Password']/parent::p
        //p[@class='top']/parent::form   
