Feature: Test Case

@Start
  Scenario: Find the cheapest product
    Given the store main page is displayed
    When the user put a low price
    Then results are shown

@Stop

  Scenario: Simple product search
    Given the store main page is displayed
    When in the search phrase "body" is entered
    Then results for "body" are shown

  @Stop

  Scenario: Check the stock
    Given the store main page is displayed
    When the user check "In stock"
    Then results which is in stock are shown

    @Stop

@functional
  Scenario: Check the brand
    Given the store main page is displayed
    When the user choose brand "Shadi"
    Then results are shown

  @Stop

  Scenario: Choose two colours
    Given the page with products is displayed
    When the user choose the colors "Black" and "Blue"
    Then the products with colors "Black" and "Blue" are shown