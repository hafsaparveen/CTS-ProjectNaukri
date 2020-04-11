Feature: Test login in naukri
@Naukri_1
Scenario: Login to site 
Given I navigate to login page
When I open home page
Then user enter username
And the user enters password
And click on login button



@Naukri_2
Scenario: To search about company
Given the user opens the browser  
When user enters the skill
Then I enter a location
And click on jobsearch button


@Naukri_3
Scenario: To search for company reviews
Given I launch a browser  
When I open Companies page
Then I click on government jobs
And I click the defence
And I click on inidan army
 
 
 
 @Naukri_4
Scenario: To find recuiters options
Given user launches browser page
When I click recuiters option
Then user clicks on the IT
Then user click on particular Recuiter


@Naukri_5
Scenario: To logout from the page
Given Open chrome and start naukri application
When User enters valid username and password
Then user must able to login
Then user selects service page

 


 
 
 
 
  
