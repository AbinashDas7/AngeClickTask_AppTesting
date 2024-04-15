Feature: Login functionality

  Scenario: Functionality login with username and password
    Given user is on product page
    Then Verify user able to click on Menu
    And Check Login option from Menu catalogue
    Then Verify User able to Login or not
    
    
    Scenario: Functionality login with username and no password
    Given user is on product page
    Then Verify user able to click on Menu
    And Check Login option from Menu catalogue
    Then Check User login through only username
    
    Scenario: Functionality login with no username and password
    Given user is on product page
    Then Verify user able to click on Menu
    And Check Login option from Menu catalogue
    Then Check User login through no username and password

		