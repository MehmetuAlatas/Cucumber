@scenario_outline_1
Feature: day02_US12301_scenario_outline_1
  Background: opening_google_page
    Given user is on the google page
  Scenario Outline: TC_Google_Search_Test
    When user search for "<value>" on google
    Then verify the page title contains "<value>"
    Then close the application
    Examples: test_data
      | value    |
      | mercedes |
      | apple    |
      | teapot   |
      | bmw      |
#      Ctrl + Alt + L => organize the pipes