@SmokeTest
@JIRA-3123
@Bug-1322

Feature: This is our first feature

  Background:
    Given Login to page as Admin
    And Open Homepage

  @FirstScenario

  Scenario: This is our first scenario
    Given I login to somepage
#     This is my comment
    And I open homepage
    When I open profile page
    Then I validate that profile name is something

    @SecondScenario
    Scenario Outline: This is my multiple scenario
      Given Login as <userType>
      When Open profile page
      And Change name to <nameToChange>
      Then Validate error message <errorMessage>

      Examples:
      | userType | nameToChange | errorMessage                  |
      | admin    | admin        | You have rights to do this    |
      | user     | admin        | You have no rights to do this |
      | user     | user         | Who are you?                  |