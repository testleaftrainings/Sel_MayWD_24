Feature: CreadLead functionality of leaftaps application

Scenario Outline: CreadLead with multiple data


And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click the login button
Then It should navigate to the welcome page
When Click the crmsfa link
And Click the Leads button
And Click the CreateLead button
Given Enter the Company name as <companyName>
And Enter the FirstName as <firstName>
And Enter the LastName as <lastName>
When Click the submit button
Then Lead should be created

Examples:
|companyName|firstName|lastName|
|TestLeaf|Vineeth|Rajendran|
|Qeagle|Hari|R|









