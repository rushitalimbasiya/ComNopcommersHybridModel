Feature:Fill Register Form
  As User
  I want to fill Register form
  So that I can Login the website
  Background: https://demo.nopcommerce.com

    @Test
    Scenario:To verify I should able to fill Register form So that I can Login
      Given I am on Home Page
      When I click on Register link
      And I select male
      And I enter First name
      And I enter Last name
      And I Select day
      And I select Month
      And I select Year
      And I enter Email
      And I enter Company name
      And I enter Password
      And I enter Confirm password
      And I click on Register button
      Then I should see massage Your registration completed