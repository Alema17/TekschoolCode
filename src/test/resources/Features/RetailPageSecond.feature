@RetailPageLoginTest 
Feature: Retail Page Login testing features 

Background: 
	Given User is on Retail website 
	And User click on MyAccount 
	When  User click on Login 
	And User enter username 'alema@gmail.com' and password 'Pass@123' 
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard 
	
Scenario: Register as an Affiliate userwith Cheque Payment Method 
	When User click on‘Register for an Affiliate Account’link 
	And User fill affiliate form with below information 
		|company|website|taxID|paymentMethod|
	And User check on About us check box 
	And User click on Continue button 
	Then User should see a success message 
	
Scenario:
Edit your affiliate information from Cheque payment method to Bank Transfer 
	When User click on‘Edit your affiliate informationlink 
	And user click on Bank Transfer radio button 
	And User fill Bank information with below information 
		|bankName|abaNumber|swiftCode|accountName|accountNumber|
		|US|1234|12345|aaa|123456789123456|
	And User click on Continue AffiliateButton 
	Then User should see a success message 
	
Scenario: Edit your account Information 
	When User click on‘Edit your account information’ link 
	And User modify below information 
		|firstname|lastName|email|telephone|
		|Alema|Saadat|alema@gmail.com|9166776547|
	And User click on continue button 
	Then User should seea message ‘Success: Your account has been successfully updated.’ 
	
	
	
