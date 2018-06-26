$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumberJava\cucumberJava.feature');
formatter.feature({
  "line": 1,
  "name": "CucumberJava",
  "description": "",
  "id": "cucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login functionality exists",
  "description": "",
  "id": "cucumberjava;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the factory has a chair",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I order a chair",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I get discount",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberJava.createChair()"
});
formatter.result({
  "duration": 109461099,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.goToFacebook()"
});
formatter.result({
  "duration": 330049,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.discount()"
});
formatter.result({
  "duration": 2115349,
  "status": "passed"
});
});