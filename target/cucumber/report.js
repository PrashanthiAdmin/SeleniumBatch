$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MultipleWindow.feature");
formatter.feature({
  "line": 1,
  "name": "IFrame Feature file",
  "description": "",
  "id": "iframe-feature-file",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "As a user, I should be able to switch to child window",
  "description": "",
  "id": "iframe-feature-file;as-a-user,-i-should-be-able-to-switch-to-child-window",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@multiplewindow"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am in windows page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on click here button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should switch to child window",
  "keyword": "Then "
});
formatter.match({
  "location": "MultipleWindowStepDefinitions.i_am_in_windows_page()"
});
formatter.result({
  "duration": 13070738400,
  "status": "passed"
});
formatter.match({
  "location": "MultipleWindowStepDefinitions.i_click_on_click_here_button()"
});
formatter.result({
  "duration": 10068246500,
  "status": "passed"
});
formatter.match({
  "location": "MultipleWindowStepDefinitions.i_should_switch_to_child_window()"
});
formatter.result({
  "duration": 1155980900,
  "status": "passed"
});
});