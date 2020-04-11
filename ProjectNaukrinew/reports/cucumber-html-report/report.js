$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("naukri.feature");
formatter.feature({
  "line": 1,
  "name": "Test login in naukri",
  "description": "",
  "id": "test-login-in-naukri",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to site",
  "description": "",
  "id": "test-login-in-naukri;login-to-site",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Naukri_1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I open home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the user enters password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_TC.i_navigate_to_login_page()"
});
formatter.result({
  "duration": 29792481754,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.i_open_home_page()"
});
formatter.result({
  "duration": 173469861,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.user_enter_username()"
});
formatter.result({
  "duration": 741975361,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.the_user_enters_password()"
});
formatter.result({
  "duration": 141219142,
  "status": "passed"
});
formatter.match({
  "location": "Login_TC.click_on_login_button()"
});
formatter.result({
  "duration": 3078377172,
  "status": "passed"
});
});