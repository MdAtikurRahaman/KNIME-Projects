
Feature: Verification of KNIME Web Application

  Scenario: Verify KNIME Functionality 
    Given I am in landing page
    When I click on Signin Menu
    Then verify I am in KNIME Signin Page
    And I enter Login Id
    And I enter Password
    And Click on Signin Button
    Then Click on Hub Menu
    And Click Signin again
    Then Verify Welcome Text
    Then I click on A Button
    Then I click on Space Button
    And Verify your space test 
    And I click Create New Space 
    Then I click on Private Button
    And Verify search box put space name and enter
    Then I click on Burger Menu
    And I click Delete Space
    
    
