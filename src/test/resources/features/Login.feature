
  @E2E
Feature: As a user, I want to enter my email and my password to authenticate
			Background:
			Given I launch the TUTTO application #pré-conditions
    
    	When I click on login icon of nav-menu #action
    	Then Connexion Page is opened #resultat attendu
			
	@REGRESSION_TEST
	  Scenario Outline: Connect with wrong email or wrong passeword
	   
	    When I enter the mail "<mail>" and "<passeword>"
	    And I click on connect button 
	    Then An error "<message>" is displayed
	    
	   Examples:
		|mail|password|message|
		|anis.fatnassi.c@gmail.com|687fegrzef|Échec d'authentification|
		|anis.fatnassi89556qs@gmail.com|06061993|Échec d'authentification|

  @SMOKE_TEST
  Scenario: Connect with email and password correct
    
    When I enter the mail and password correct 
    And I click on connect button 
    Then I connect to my application's account
  
  