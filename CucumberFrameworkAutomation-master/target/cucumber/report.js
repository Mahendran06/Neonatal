$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("neonatalRegistration.feature");
formatter.feature({
  "line": 2,
  "name": "Check the functionality of mother and baby registrations",
  "description": "",
  "id": "check-the-functionality-of-mother-and-baby-registrations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@neonatalRegistration"
    },
    {
      "line": 1,
      "name": "@MReg"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Create Mother Registration",
  "description": "",
  "id": "check-the-functionality-of-mother-and-baby-registrations;create-mother-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "click \"New Registration\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enter MrNo",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "select mother title as \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 14,
      "value": "#And enter mother initial as \"\u003cinitial\u003e\""
    },
    {
      "line": 15,
      "value": "#And enter mother name as \"\u003cmname\u003e\""
    },
    {
      "line": 16,
      "value": "#And enter mother lastname as \"\u003clname\u003e\""
    },
    {
      "line": 17,
      "value": "#And select mothers dob as \"\u003cdate\u003e\" \"\u003cmonth\u003e\" and \"\u003cyear\u003e\""
    },
    {
      "line": 18,
      "value": "#And select mothers education level as \"\u003cmeducation\u003e\""
    },
    {
      "line": 19,
      "value": "#And enter mothers occupation as \"\u003cmoccupation\u003e\""
    },
    {
      "line": 20,
      "value": "#And select mothers current occupation type as \"\u003cmcop\u003e\""
    },
    {
      "line": 21,
      "value": "#And enter mobile number and alternate mobile number as \"\u003cmmobile\u003e\" and \"\u003camobile\u003e\""
    },
    {
      "line": 22,
      "value": "#And enter mothers email as \"\u003cmemail\u003e\""
    },
    {
      "line": 23,
      "value": "#And enter mother spoken languages as \"\u003clanguages\u003e\""
    },
    {
      "line": 24,
      "value": "#Then select partner title as \"\u003cptitle\u003e\""
    },
    {
      "line": 25,
      "value": "#And enter partner initial as \"\u003cpinitial\u003e\""
    },
    {
      "line": 26,
      "value": "#And enter partner name as \"\u003cpfirstname\u003e\""
    },
    {
      "line": 27,
      "value": "#And enter partner lastname as \"\u003cplastname\u003e\""
    },
    {
      "line": 28,
      "value": "#And select partners dob as \"\u003cpDate\u003e\" \"\u003cpMonth\u003e\" and \"\u003cpYear\u003e\""
    },
    {
      "line": 29,
      "value": "#And select partners education level as \"\u003cpeducation\u003e\""
    },
    {
      "line": 30,
      "value": "#And select partners current occupation type as \"\u003cpcop\u003e\""
    },
    {
      "line": 31,
      "value": "#And enter partners occupation as \"\u003cpoccupation\u003e\""
    },
    {
      "line": 32,
      "value": "#Then click on Same as mother\u0027s contact details including languages check box"
    },
    {
      "line": 33,
      "value": "#Then enter address line1 doorno as \"\u003caddress1\u003e\""
    },
    {
      "line": 34,
      "value": "#Then enter address line2 street name as \"\u003caddress2\u003e\""
    },
    {
      "line": 35,
      "value": "#Then enter address line3 city as \"\u003caddress3\u003e\""
    },
    {
      "line": 36,
      "value": "#Then enter address line4 pincode as \"\u003caddress4\u003e\""
    },
    {
      "line": 37,
      "value": "#Then enter address line5 country as \"\u003caddress5\u003e\""
    },
    {
      "line": 38,
      "value": "#Then click on same as current address check box for mailing address"
    },
    {
      "line": 39,
      "value": "#And click on register baby button"
    },
    {
      "line": 40,
      "value": "#Then enter baby MrNo as \"\u003cBmrno\u003e\""
    },
    {
      "line": 41,
      "value": "#Then select babys dob as \"\u003cbDate\u003e\" \"\u003cbMonth\u003e\" and \"\u003cbYear\u003e\""
    },
    {
      "line": 42,
      "value": "#And select babys time of birth as \"\u003cbMins\u003e\" \"\u003cbSecs\u003e\" and \"\u003cBAM\u003e\""
    },
    {
      "line": 43,
      "value": "#And select muliple pregnancy type as \"\u003cmultiplePregnancy\u003e\""
    },
    {
      "line": 44,
      "value": "#And select baby sex as \"\u003csex\u003e\""
    },
    {
      "line": 45,
      "value": "#And enter gestation of baby as \"\u003cgWeeks\u003e\" and \"\u003cgDays\u003e\""
    },
    {
      "line": 46,
      "value": "#And enter birth status of baby as \"\u003cbirthStatus\u003e\""
    },
    {
      "line": 47,
      "value": "#And enter birth weight of baby as \"\u003cbWeight\u003e\""
    },
    {
      "line": 48,
      "value": "#And select babys blood group as \"\u003cbloodGroup\u003e\""
    },
    {
      "line": 49,
      "value": "#And select consultant as \"\u003cneonatalConsultant\u003e\""
    }
  ],
  "line": 51,
  "name": "",
  "description": "",
  "id": "check-the-functionality-of-mother-and-baby-registrations;create-mother-registration;",
  "rows": [
    {
      "cells": [
        "mrno",
        "title",
        "initial",
        "mname",
        "lname",
        "date",
        "month",
        "year",
        "meducation",
        "moccupation",
        "mcop",
        "mmobile",
        "amobile",
        "memail",
        "languages",
        "ptitle",
        "pinitial",
        "pfirstname",
        "plastname",
        "pDate",
        "pMonth",
        "pYear",
        "peducation",
        "pcop",
        "poccupation",
        "address1",
        "address2",
        "address3",
        "address4",
        "address5",
        "Bmrno",
        "bDate",
        "bMonth",
        "bYear",
        "bMins",
        "bSecs",
        "BAM",
        "multiplePregnancy",
        "sex",
        "gWeeks",
        "gDays",
        "birthStatus",
        "bWeight",
        "bloodGroup",
        "neonatalConsultant"
      ],
      "line": 52,
      "id": "check-the-functionality-of-mother-and-baby-registrations;create-mother-registration;;1"
    },
    {
      "cells": [
        "180004600",
        "Mrs.",
        "MT",
        "Mother",
        "Test",
        "25",
        "Apr",
        "1990",
        "Graduate",
        "HouseWife",
        "Currently employed",
        "9994587023",
        "8999548036",
        "mother@gmail.com",
        "Tamil, English",
        "Mr.",
        "FT",
        "Father",
        "Test",
        "10",
        "Jun",
        "1988",
        "Graduate",
        "Business",
        "Currently employed",
        "9, Anand",
        "Angamal Colony",
        "Salem",
        "638052",
        "India",
        "18000520",
        "10",
        "May",
        "2018",
        "2",
        "50",
        "AM",
        "No",
        "Male",
        "40",
        "",
        "Inborn",
        "3000",
        "B Negative",
        "Dr Shobana S"
      ],
      "line": 53,
      "id": "check-the-functionality-of-mother-and-baby-registrations;create-mother-registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2809318604,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "login with valid credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "mahendran.r@raster.in",
        "123456"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "NeonatalLoginStepDefs.login_with_valid_credentials(DataTable)"
});
formatter.result({
  "duration": 195606219,
  "status": "passed"
});
formatter.match({
  "location": "NeonatalLoginStepDefs.click_on_the_Login_button()"
});
formatter.result({
  "duration": 940106140,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Create Mother Registration",
  "description": "",
  "id": "check-the-functionality-of-mother-and-baby-registrations;create-mother-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@neonatalRegistration"
    },
    {
      "line": 1,
      "name": "@MReg"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "click \"New Registration\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enter MrNo",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "select mother title as \"Mrs.\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New Registration",
      "offset": 7
    }
  ],
  "location": "NeonatalMotherRegStepDefs.clickTab(String)"
});
formatter.result({
  "duration": 518558660,
  "status": "passed"
});
formatter.match({
  "location": "NeonatalRegistrationStepDefs.enterMrNo()"
});
formatter.result({
  "duration": 250727656,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mrs.",
      "offset": 24
    }
  ],
  "location": "NeonatalRegistrationStepDefs.select_mother_title_as(String)"
});
formatter.result({
  "duration": 105310330,
  "status": "passed"
});
formatter.after({
  "duration": 76817,
  "status": "passed"
});
});