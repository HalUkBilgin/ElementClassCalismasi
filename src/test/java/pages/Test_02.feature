
  Feature: test
    Scenario: testB
      Given user on homepage
      When user search "iphone"
      Then products should be visible
      And close the browser