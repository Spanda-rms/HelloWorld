$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/resources/FeatureFile.feature");
formatter.feature({
  "line": 1,
  "name": "Sample Hello world Test",
  "description": "Description: The purpose of this feature file is to run a trial test through Jenkins to validate the sample webpage hosted on AWS and send an email with report.Edited",
  "id": "sample-hello-world-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User inputs a text in the textfield and clicks button",
  "description": "",
  "id": "sample-hello-world-test;user-inputs-a-text-in-the-textfield-and-clicks-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the Webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter a value in the textfield",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I press the \u0027click Me\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the H1 header displays \u0027Hello WORLD\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_am_on_the_webpage()"
});
formatter.result({
  "duration": 5514481314,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_a_value_in_the_textfield()"
});
formatter.result({
  "duration": 77537325,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_press_the_click_me_button()"
});
formatter.result({
  "duration": 1082729892,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_h1_header_displays_hello_world()"
});
formatter.result({
  "duration": 37392025,
  "status": "passed"
});
});