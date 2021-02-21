Feature: Patient login feature works

	Background: 
		Given The Guest is on the login Page
		
	Scenario Outline: login works
		When The user types "<email>" and "<password>" and clicks login button
		Then The title of the page should be "<title>"
	
	Examples:
		| email             | password | title 			    |
		| scott@gmail.com   | password | Patient Portal     |
		| sydney@gmail.com  | password | Patient Portal     |
		| steven@gmail.com  | password | Patient Portal     |
		| azhar@gmail.com   | password | Patient Portal     |