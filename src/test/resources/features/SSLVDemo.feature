@SmokeTest
  Feature: Webpage ss.lv cars and dogs filter feature tests

    Scenario: Dogs filter validation
      Given Open Chrome
      And Open Homepage
      When Open Dogs tab
      Then Change min price 1 and max price 1000
      And Change min age 1 and max age 10
      And Press submit button
      And Close Chrome