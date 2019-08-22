$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resourcer/FeatureFiles/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Fill Register Form",
  "description": "As User\r\nI want to fill Register form\r\nSo that I can Login the website",
  "id": "fill-register-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8387251100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "https://demo.nopcommerce.com",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "To verify I should able to fill Register form So that I can Login",
  "description": "",
  "id": "fill-register-form;to-verify-i-should-able-to-fill-register-form-so-that-i-can-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I select male",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter First name",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter Last name",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Select day",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select Month",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select Year",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter Email",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter Company name",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter Confirm password",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should see massage Your registration completed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 399166200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1459984600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectMale()"
});
formatter.result({
  "duration": 105207700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterFirstName()"
});
formatter.result({
  "duration": 219612500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterLastName()"
});
formatter.result({
  "duration": 228834000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectDay()"
});
formatter.result({
  "duration": 181196400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectMonth()"
});
formatter.result({
  "duration": 172332100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectYear()"
});
formatter.result({
  "duration": 163059100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterEmail()"
});
formatter.result({
  "duration": 257907400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterCompanyName()"
});
formatter.result({
  "duration": 198451500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterPassword()"
});
formatter.result({
  "duration": 225309900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterConfirmPassword()"
});
formatter.result({
  "duration": 207923300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 1528482700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeMassageYourRegistrationCompleted()"
});
formatter.result({
  "duration": 61000,
  "status": "passed"
});
formatter.after({
  "duration": 783977100,
  "status": "passed"
});
});