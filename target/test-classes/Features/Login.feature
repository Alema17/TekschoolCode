@LoginRegression  @CompleteTest
Feature: Login to Retail Website 

#any steps which are repeated at the beginning of all scenarios in one feature can be placed
#under Background keyword and it will reduce code duplicate and writing same steps over and over
Background: 
	Given User is on Retail website 
	And User click  on MyAccount
	
	
@login @SmokeTest 
Scenario: Login to MyAccount 

	When  User click on Login 
	And User enter username 'sdet@tekschool.us' and password 'sdet' 
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard 
	
	
	#if i want to run same scenario with multiple userName and Password 
	# Should i copy and past same scenario with multiple user and pass ? 
	
@MultipleUserLogin 
Scenario Outline: Login to Retail Site with multiple users 


	When User click on Login 
	And User enter username '<userName>' and password '<password>' 
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard 
	
	Examples: 
		|userName|password|
		|sdet@tekschool.us|sdet|
		|consumer@tekschool.us|JBond|
		|students@tekschool.us|TEST|
		
	