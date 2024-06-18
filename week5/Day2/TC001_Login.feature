Feature: Login functionality of leaftaps application



@Functional @Smoke
Scenario: Login using valid credential

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click the login button
Then It should navigate to the welcome page

@Functional @Regression
Scenario: Login using invalid credential

And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click the login button
But It should gives error message
