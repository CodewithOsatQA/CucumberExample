Feature: Google Search Kittens

==============================
===	Information:
An example of a standard scenario, you can have multiple scenarios in a feature.
Cases where a step is matching such as we can open google will refer to the same step definition method.

	Scenario: find kittens images on google
		Given we can open google
		When we search for kittens
		Then google will return us image of kittens
		
	Scenario: find puppy images on google
		Given we can open google
		When we search for "puppies"
		Then google will return us image of "puppies"