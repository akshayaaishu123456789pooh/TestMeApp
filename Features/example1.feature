Feature: Login Test
Description(optional): Registered user can login into TestMeApp using proper credentials.
- Pre-Requisite: Registration module should be completed
Example Mapping: 

Business Rule1:SignIn Link
Scenario: Lgin with valid credentials
Given user launch chrome browser And enters an TestMeApp url
When user enters a valid username in a username field
When user enters a valid password in a password field
When user clicks on OK button
Then user verify the result
