$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumberJava\cucumberJava.feature');
formatter.feature({
  "line": 1,
  "name": "Apply prescribed rebates to orders",
  "description": "",
  "id": "apply-prescribed-rebates-to-orders",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Chinesse client has specific rebate",
  "description": "",
  "id": "apply-prescribed-rebates-to-orders;chinesse-client-has-specific-rebate",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the client is Chinesse",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "a chair is orderd",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "VAT rebate applies",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberJava.createChinesseClient()"
});
formatter.result({
  "duration": 262758120,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.orderChair()"
});
formatter.result({
  "duration": 346622,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.VATdefaultClientRebate()"
});
formatter.result({
  "duration": 7471599,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Multiple rebate types on same order",
  "description": "",
  "id": "apply-prescribed-rebates-to-orders;multiple-rebate-types-on-same-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "the client is the mom",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "a chair is orderd",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "there is a clearance",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Friends\u0026Family and Clearance rebate applies",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberJava.createMomClient()"
});
formatter.result({
  "duration": 1295867,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.orderChair()"
});
formatter.result({
  "duration": 49719,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.applyClearance()"
});
formatter.result({
  "duration": 203460,
  "status": "passed"
});
formatter.match({
  "location": "cucumberJava.composedRebates()"
});
formatter.result({
  "duration": 863911,
  "status": "passed"
});
});