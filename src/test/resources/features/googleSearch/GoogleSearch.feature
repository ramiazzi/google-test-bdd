@Googlesearch
Feature: Google search
  As User, I can search a keyword on google home page

  Scenario Outline:As User, I can search a keyword on google home page
    Given I can access to google Homepage
    When I search "<KEYWORD>" in the search bar
    Then I click on first result
     Examples:
    |KEYWORD|
    |SONEPAR|

  