Feature: Validate Rich list

Scenario: Validate Rich list in Google search
	When user enters text "Pizza sf"
	And the user Selects option from list
	Then the user should be redirected to Rich List