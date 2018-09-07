Feature: Sample Hello world Test
  Description: The purpose of this feature file is to run a trial test through Jenkins to validate the sample webpage hosted on AWS and send an email with report

  Scenario: User inputs a text in the textfield and clicks button
    Given I am on the Webpage
    When I enter a value in the textfield
    And I press the 'click Me' button
    Then the H1 header displays 'Hello WORLD'
