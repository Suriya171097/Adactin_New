Feature: Hotel Booking In Adactin Application 


Background:
    Given the user is logged in

@smokeTest 
Scenario Outline: user Login In The Login Page 

	Given user Launch The Application 
	When user Enter The "<Username>" In Username Field 
	And user Enter The "<Password>" In Password Field 
	Then user Click On The Login Button And It Navigates To The SearchHotelPage 
	
	Examples: 
	
		|Username|Password|
		|ABC|123|
		|sandeep|12332|
		|cibi|12456|
		|Blackstar17|Music17|
		
		
		@sanityTest 
		Scenario: Hotel Searching 
			When user Select The Location And Select The Hotel And Select Room Type 
			And User Select Number of Rooms And Input The Checkout Date And Select The Number Of Adults 
			And Select Number Of Children 
			Then user Click The Search Button And It Navigates To Hotel Select Page 
			
		@sanityTest 
		Scenario: Hotel Selecting 
			When user Select The Hotel Radio Button 
			Then user Click The Continue Button And It Navigates To Book A Hotel Page 
			
		@regressionTest 
		Scenario: Book Hotel 
			When user Enters The Firstname In The Firstname Box And User Enters The Lastname In the Lastname Box 
			And User Enters The Billing Address In The Address Box And User Enters The Creditcard Number In The Creditcard Number Box 
			And Select The Expiry Month Of The Card And Select The Expiry Year Of The Card And User Enter The Cvv Number Of The Card 
			Then user Clicks the Booknow Button And It Navigates To Confirm Page 
			
		@regressionTest 
		Scenario: Hotel Confirmation 
			When user Takes Screenshot Of The Order 
			Then user Click The Itinary Button And It Navigates To Logout Page 
			
		@regressionTest 
		Scenario: Logging Out From App 
			Then user Click The Logout Button To Signout From The App 
	