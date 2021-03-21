@LaptopAndNoteBooksTest 
Feature: Laptop And NoteBooks Features 

Background: 
	Given User is on Retail website 
	When User click on Laptop & NoteBook tab 
	And User click on Show all Laptop & NoteBook option 
	
Scenario: Add and Remove a Mac Book from Cart 
	And User click on MacBook item 
	And User clickadd to Cart button 
	Then User should see a message ‘Success: You have added MacBook to your shopping cart!’ 
	And User should see ‘1tem(s)-602.00’showed to the cart 
	And User click on cart option 
	And User click on red X button to remove the item from cart 
	Then item should be removed and cartshould show ‘0 item(s)’ 
	
Scenario: Product Comparison 
	And User click on product comparison icon on ‘MacBook’ 
	And User click on product comparison icon on ‘MacBook Air 
	Then User should see a message ‘Success: You have added MacBook Air to your product comparison!’ 
	And User click on Product comparison link 
	Then User should see Product Comparison Chart 
	
Scenario: Adding and item to Wish list 
	And User click on heart icon to add ‘Sony VaIO’laptop to wish list 
	Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’ 
	
Scenario: Validate the price of MacBook Pro is 2000 
	And User click on ‘MacBook Pro’item 
	Then User should see ‘$2,000.00’price tag is present on UI. 
