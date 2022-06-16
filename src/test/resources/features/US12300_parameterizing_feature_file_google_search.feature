@parameterization1
Feature: US12300_parameterizing_feature_file_google_search
  Background: user_is_on_the_google_page
    Given user is on the google page
  Scenario: TC01_car_search
    When user search for "car" on google
    Then verify the page title contains "car"
    And close the application
  Scenario: TC02_sobiyet_search
    When user search for "sobiyet" on google
    Then verify the page title contains "sobiyet"
    And close the application
  Scenario: TC03_qa_jobs_search
    When user search for "qa jobs" on google
    Then verify the page title contains "qa jobs"
    And close the application
  Scenario: TC04_kokorec_search
    When user search for "kokorec" on google
    Then verify the page title contains "kokorec"
    And close the application
