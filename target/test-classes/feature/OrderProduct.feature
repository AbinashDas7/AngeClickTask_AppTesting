Feature: Functionality Order


  Scenario: Functionality Order the products
    Given user is on product page
    And Verify user able to click on product
    Then Verify User able to Add that product into cart
    Then Check user able to click on cart
    And Check whether the same price showing in cart or not
    And Verify User able to click on Proceed TO Checkout button
    Then Verify User able to Login or not
    And Check User able to add all shipping address
    And Verify User able add card Details
    And Check whether the product price and shipping price sums up and total price calculated or not
    And Check user able to Order the product and get successfull message

  Scenario: Functionality Order two products
    Given user is on product page
    And Verify user able to click on product
    Then Verify User able to Add that product two times into cart
    Then Check user able to click on cart
    And Verify User able to click on Proceed TO Checkout button
    Then Verify User able to Login or not
    And Check User able to add all shipping address
    And Verify User able add card Details
    And Check whether the product price and shipping price sums up and total price calculated or not
    And Check user able to Order the product and get successfull message

  Scenario: Functionality Order delete one product
    Given user is on product page
    And Verify user able to click on product
    Then Verify User able to Add that product two times into cart
    Then Check user able to click on cart
    And Check whether user able to delete one product from cart or not
    And Verify User able to click on Proceed TO Checkout button
    Then Verify User able to Login or not
    And Check User able to add all shipping address
    And Verify User able add card Details
    And Check whether the product price and shipping price sums up and total price calculated or not
    And Check user able to Order the product and get successfull message

  Scenario: Functionality Order Add multiple product
    Given user is on product page
    And Verify user able to click on product
    Then Verify User able to Add that product into cart
    Then Verify User able to add another different product
    Then Verify User able to Add that product into cart
    Then Check user able to click on cart
    And Verify User able to click on Proceed TO Checkout button
    Then Verify User able to Login or not
    And Check User able to add all shipping address
    And Verify User able add card Details
    And Check whether the product price and shipping price sums up and total price calculated or not
    And Check user able to Order the product and get successfull message
