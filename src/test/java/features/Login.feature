Feature: Application Login
Scenario: Home Page defult Login

Given User on Netbanking landing page
When user login application with "asm" and password "1234"
Then home page is populated
And cards are displayed

Scenario: Home Page defult Login

Given User on Netbanking landing page
When user login application with "qwe" and password "12344"
Then home page is populated
And cards are displayed



