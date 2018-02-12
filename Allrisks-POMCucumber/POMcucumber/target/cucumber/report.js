$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/FeatureFiles/Login.Feature");
formatter.feature({
  "line": 1,
  "name": "AllRisks Application Test",
  "description": "",
  "id": "allrisks-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To validate Login page",
  "description": "",
  "id": "allrisks-application-test;to-validate-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "validate broswer title",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enter username and password and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on Homeowner / Dwelling / Condo Quote button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.user_opens_browser()"
});
formatter.result({
  "duration": 24844023270,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.validate_browser_title()"
});
formatter.result({
  "duration": 146249222,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.user_enter_username_and_password()"
});
formatter.result({
  "duration": 6897958507,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.home_page_is_displayed()"
});
formatter.result({
  "duration": 94076,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.validate_home_page_title()"
});
formatter.result({
  "duration": 18815,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.click_on_Homeowner_Dwelling_Condo_Quote_button()"
});
formatter.result({
  "duration": 21552,
  "status": "passed"
});
});