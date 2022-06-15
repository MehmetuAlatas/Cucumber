Feature: Homework
  Scenario: TC22_TestCasesStepDefs
    Given user launches the browserr
    When user navigate to URL
    Then user scroll to bottom of page
    Then user verifies that RECOMMENDED ITEMS are visible
    Then user clicks on Add to chart on RECOMMENDED product
    Then  user clicks on view cart button
    Then  user verifies that product is displayed in cart page
    Then user closes the browserr