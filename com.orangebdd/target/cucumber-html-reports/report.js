$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/automation_1june/com.orangebdd/src/test/java/feature_package/parameter.feature");
formatter.feature({
  "name": "check the login functionallity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "login the application with valid credtionals",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is onn login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter \"\u003csurname\u003e\" in username feild and \"\u003cpassword\u003e\" in password feild",
  "keyword": "Then "
});
formatter.step({
  "name": "clicks on the login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "surname",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    },
    {
      "cells": [
        "ad",
        "ad"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "login the application with valid credtionals",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is onn login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loggggggin.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"admin\" in username feild and \"admin\" in password feild",
  "keyword": "Then "
});
formatter.match({
  "location": "loggggggin.user_enter_in_username_feild_and_in_password_feild(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loggggggin.clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login the application with valid credtionals",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is onn login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loggggggin.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"ad\" in username feild and \"ad\" in password feild",
  "keyword": "Then "
});
formatter.match({
  "location": "loggggggin.user_enter_in_username_feild_and_in_password_feild(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loggggggin.clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login the application with valid credtionals",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is onn login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loggggggin.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Admin\" in username feild and \"admin123\" in password feild",
  "keyword": "Then "
});
formatter.match({
  "location": "loggggggin.user_enter_in_username_feild_and_in_password_feild(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loggggggin.clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
});