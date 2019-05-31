Feature: Login with multiple set of test data

Scenario Outline: login

Given user launching TestMeApp
When user enters username as "<username>" And enter password as "<password>" 
Then clicks ok
And verify login result

Examples: 
|username|password|
|lalitha|password123|
|akshaya|abc1236|