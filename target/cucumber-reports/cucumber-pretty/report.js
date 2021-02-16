$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/RetailPage.feature");
formatter.feature({
  "line": 2,
  "name": "Retail Website Features",
  "description": "",
  "id": "retail-website-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@retailPage"
    }
  ]
});
formatter.before({
  "duration": 1951414878,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#Every feature file starts with Feature: \u003cName of feature file\u003e"
    },
    {
      "line": 5,
      "value": "#Every Scenario starts with Scenario: \u003cName of Test case we want to automate\u003e"
    },
    {
      "line": 6,
      "value": "#Gherkin keywords are Given When Then"
    },
    {
      "line": 7,
      "value": "#Given is precondition"
    },
    {
      "line": 8,
      "value": "#When is an Action taken"
    },
    {
      "line": 9,
      "value": "#Then is an expected result ( we write validation )"
    },
    {
      "line": 10,
      "value": "#And is repeating an action or can be used following Given keyword as well"
    },
    {
      "line": 11,
      "value": "#But is used for negative scenarios verification"
    }
  ],
  "line": 14,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 15,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2252387965,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search functionality Test case",
  "description": "",
  "id": "retail-website-features;search-functionality-test-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User search for \u0027iphone\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User should see Iphone image",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "iphone",
      "offset": 17
    }
  ],
  "location": "RetailPageTestStepDefinitions.user_search_for_iphone(String)"
});
formatter.result({
  "duration": 780824037,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_click_on_search_button()"
});
formatter.result({
  "duration": 412301420,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_should_see_Iphone_image()"
});
formatter.result({
  "duration": 494219180,
  "status": "passed"
});
formatter.after({
  "duration": 159505118,
  "status": "passed"
});
});