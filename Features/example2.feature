Feature: purchase products in TestMeApp
@category1
Scenario: search product by category
Given user login
When user selects products using category

Then verify the produt list And closes the application
@category2
Scenario: search product by sub-category
Given user login
When user selects products using sub-category

Then verify the produt list And closes the application
@category3
Scenario: search product by product name
Given user login
When user selects product using product search
Then verify the produt list And closes the application
