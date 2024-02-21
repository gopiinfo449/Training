Feature: Validate Place Sheet

  @sanity @regression
  Scenario: Validate Place Sheet in Google search
    Given the user navigates to home page
    When user enters text as "Cascal"
    And the user Selects option from the list
    Then the user should be redirected Place sheet
    Then the user should click on Reserve a Table button
    Then the user should be navigated to Reserve a Table page