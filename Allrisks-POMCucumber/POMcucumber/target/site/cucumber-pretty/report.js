$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/FeatureFiles/BaseRateCheck.Feature");
formatter.feature({
  "line": 1,
  "name": "AllRisks Application Test",
  "description": "",
  "id": "allrisks-application-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To validate Base Rate",
  "description": "",
  "id": "allrisks-application-test;to-validate-base-rate",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on Homeowner / Dwelling / Condo Quote button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"\u003cagency_code\u003e\" in Agency Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter the \"\u003cinsured_name\u003e\" Then \"\u003cinsured_mailing_address\u003e\" And \"\u003cphone_number\u003e\" in insured information",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on Riskinsured address same",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enter the \"\u003cprotection_class\u003e\" Then \"\u003cnumber_of_stories\u003e\" Then \"\u003csq_feet\u003e\" Then \"\u003cyear_built\u003e\" Then \"\u003cnumber_loss\u003e\" in location page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "allrisks-application-test;to-validate-base-rate;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "agency_code",
        "insured_name",
        "insured_mailing_address",
        "phone_number",
        "protection_class"
      ],
      "line": 12,
      "id": "allrisks-application-test;to-validate-base-rate;;1"
    },
    {
      "cells": [
        "allrisksunderwriter",
        "welcome1",
        "450076",
        "TestPOMsampleCucumber",
        "123 main street MD 21632",
        "1234567891",
        "1"
      ],
      "line": 13,
      "id": "allrisks-application-test;to-validate-base-rate;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "To validate Base Rate",
  "description": "",
  "id": "allrisks-application-test;to-validate-base-rate;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"allrisksunderwriter\" and \"welcome1\" and click on login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on Homeowner / Dwelling / Condo Quote button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"450076\" in Agency Page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter the \"TestPOMsampleCucumber\" Then \"123 main street MD 21632\" And \"1234567891\" in insured information",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on Riskinsured address same",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enter the \"1\" Then \"\u003cnumber_of_stories\u003e\" Then \"\u003csq_feet\u003e\" Then \"\u003cyear_built\u003e\" Then \"\u003cnumber_loss\u003e\" in location page",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSD.user_opens_browser()"
});
formatter.result({
  "duration": 14606767211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "allrisksunderwriter",
      "offset": 12
    },
    {
      "val": "welcome1",
      "offset": 38
    }
  ],
  "location": "LoginSD.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 7879301262,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.click_on_Homeowner_Dwelling_Condo_Quote_button()"
});
formatter.result({
  "duration": 93651583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "450076",
      "offset": 11
    }
  ],
  "location": "AgencyPageSD.enter_the_in_Agency_Page(String)"
});
formatter.result({
  "duration": 22363203923,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestPOMsampleCucumber",
      "offset": 11
    },
    {
      "val": "123 main street MD 21632",
      "offset": 40
    },
    {
      "val": "1234567891",
      "offset": 71
    }
  ],
  "location": "InsuredPageSD.enter_the_and_and_in_insured_information(String,String,String)"
});
formatter.result({
  "duration": 10570926129,
  "status": "passed"
});
formatter.match({
  "location": "LocatioPageSD.click_on_Riskinsured_address_same()"
});
formatter.result({
  "duration": 28238737678,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 11
    },
    {
      "val": "\u003cnumber_of_stories\u003e",
      "offset": 20
    },
    {
      "val": "\u003csq_feet\u003e",
      "offset": 47
    },
    {
      "val": "\u003cyear_built\u003e",
      "offset": 64
    },
    {
      "val": "\u003cnumber_loss\u003e",
      "offset": 84
    }
  ],
  "location": "LocatioPageSD.enter_the_Then_Then_Then_Then_in_location_page(String,String,String,String,String)"
});
formatter.result({
  "duration": 113576,
  "status": "passed"
});
});