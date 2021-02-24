$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "user Login In The Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigates To The SearchHotelPage",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;;1"
    },
    {
      "cells": [
        "ABC",
        "123"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;;2"
    },
    {
      "cells": [
        "sandeep",
        "12332"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;;3"
    },
    {
      "cells": [
        "cibi",
        "12456"
      ],
      "line": 16,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;;4"
    },
    {
      "cells": [
        "Blackstar17",
        "Music17"
      ],
      "line": 17,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "user Login In The Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"ABC\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigates To The SearchHotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 5136631900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ABC",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 577424300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 366054600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage()"
});
formatter.result({
  "duration": 2501673200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "user Login In The Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"sandeep\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"12332\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigates To The SearchHotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 1948041700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sandeep",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 1623207500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12332",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 1808762000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage()"
});
formatter.result({
  "duration": 1377724900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "user Login In The Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"cibi\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"12456\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigates To The SearchHotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 1383836300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cibi",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 1047539500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12456",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 467406400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage()"
});
formatter.result({
  "duration": 1363514700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "user Login In The Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-login-page;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Blackstar17\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"Music17\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigates To The SearchHotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 1231988400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blackstar17",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 729982900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Music17",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 644727800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage()"
});
formatter.result({
  "duration": 3352895800,
  "status": "passed"
});
});