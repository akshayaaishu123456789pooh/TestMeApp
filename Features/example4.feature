Feature: The user wants to select a product and proceed with checkout

Scenario: Select a product and checkout

Given user loggin to TestMeApp
When user selects a product as "laptop"
When user clicks on add to cart
When user clicks on cart link
When user provides a quantity as 1
When user proceed checkout
Then verify the product review and payment page
