@LandingPageTestCases

Feature: Verification of Address values on Contact US Page

  @AddressNameVerification_USA
  Scenario: Verify Irvine USA address values on Contact us Page
    Given I am on Hitachi Website LandingPage
    When I click on "Contact Us" option
    Then I verify the address field

