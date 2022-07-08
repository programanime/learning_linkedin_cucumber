#Author: dnl.molina@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Menu Management
    Background: get source connection
        Given: initial preparation 10
        
    @Humo
    Scenario: Add a menu item
        Given I have a menu item with name "Cucumber sandwich" and price $20
        When I add that menu item
        Then Menu Item with name "Cucumber Sandwich" should be added
    
    @RegularTest
    Scenario: Add a menu item
        Given I have a menu item with name "Cucumber sandwich" and price $20
        When I add that menu item
        Then Menu Item with name "Cucumber Sandwich" should be added
    
    @NightlyBuildTest @RegularTest
    Scenario: Add a menu item
        Given I have a menu item with name "Cucumber sandwich" and price $20
        When I add that menu item
        Then Menu Item with name "Cucumber Sandwich" should be added
        
    Scenario: update one item
        Given I have a menu item with name "Cucumber sandwich" and i need to change to "Cucumber new"
        When i update one item
        Then Menu Item with name "Cucumber Sandwich" should be update