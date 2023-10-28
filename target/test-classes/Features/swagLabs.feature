Feature: SwagLabs

  Scenario: Successful Login
    Given User navigate to SwagLabs Page
    When User enter correct username and password values
    Then User get directed to dashboard page
    And close browser

  Scenario: Failed Login (Empty Fields)
    Given User navigate to SwagLabs Page
    When User leave the username and password fields empty
    Then User should see an error message
    And close browser

  Scenario: Failed Login (Invalid Credentials)
    Given User navigate to SwagLabs Page
    When User enter invalid credentials
    Then User should see an error message
    And close browser

  Scenario:  Filter Product based Name (A to Z)
    Given User navigate to SwagLabs Page
    When User enter correct username and password values
    Then User get directed to dashboard page
    And User verify button Filter
    Then User click button Filter
    Then User click Name A to Z
    And close browser

  Scenario: Filter Product based Price (low to high)
    Given User navigate to SwagLabs Page
    When User enter correct username and password values
    Then User get directed to dashboard page
    And User verify button Filter
    Then User click button Filter
    Then User click Price low to high
    And close browser

  Scenario: Filter Product based Price (high to low)
    Given User navigate to SwagLabs Page
    When User enter correct username and password values
    Then User get directed to dashboard page
    And User verify button Filter
    Then User click button Filter
    Then User click Price high to low
    And close browser

  Scenario: Add To Cart Product
    Given User navigate to SwagLabs Page
    When User enter correct username and password values
    Then User get directed to dashboard page
    And User verify button Add to cart
    Then User click button Add to cart
    And User verify button remove
    Then User click button cart
    And User redirected to cart page
    Then User validate product
    And close browser

  Scenario: Remove Product from Cart
    Given User navigate to SwagLabs Page
    When User enter correct username and password values
    Then User get directed to dashboard page
    And User verify button Add to cart
    Then User click button Add to cart
    And User verify button remove
    Then User click button cart
    And User redirected to cart page
    Then User validate product
    And User verify button remove
    Then User click button Remove


