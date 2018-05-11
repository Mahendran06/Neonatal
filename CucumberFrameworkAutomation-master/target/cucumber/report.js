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
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Create Mother Registration",
  "description": "",
  "id": "check-the-functionality-of-mother-and-baby-registrations;create-mother-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@motherReg"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "click \"New Registration\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "enter MrNo as \"\u003cmrno\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "select mother title as \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "enter mother initial as \"\u003cinitial\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter mother name as \"\u003cmname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter mother lastname as \"\u003clname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select mothers dob as \u003cdob\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select mothers education level as \"\u003cmeducation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "enter mothers occupation as \"\u003cmoccupation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select mothers current occupation type as \"\u003cmcop\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enter mobile number and alternate mobile number as \"\u003cmmobile\u003e\" and \"\u003camobile\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "enter mothers email as \"\u003cmemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "enter mother spoken languages as \"\u003clanguages\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "select partner title as \"\u003cptitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "enter partner initial as \"\u003cpinitial\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "enter partner name as \"\u003cpfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "enter partner lastname as \"\u003cplastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "select partners dob as \u003cpdob\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "select partners education level as \"\u003cpeducation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "select partners current occupation type as \"\u003cpcop\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "enter partners occupation as \"\u003cpoccupation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "click on Same as mother\u0027s contact details including languages check box",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "enter address line1 doorno as \"\u003caddress1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "enter address line2 street name as \"\u003caddress2\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "enter address line3 city as \"\u003caddress3\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "enter address line4 pincode as \"\u003caddress4\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "enter address line5 country as \"\u003caddress5\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "click on same as current address check box for mailing address",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 40,
      "value": "#Then click on save and close button"
    },
    {
      "line": 41,
      "value": "#Then check that \"\u003cmrno\u003e\" is saved and displaying"
    },
    {
      "line": 42,
      "value": "#And click on register baby button"
    },
    {
      "line": 43,
      "value": "#Then enter baby MrNo as \"\u003cBMrNo\u003e\""
    }
  ],
  "line": 47,
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
        "dob",
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
        "pdob",
        "peducation",
        "pcop",
        "poccupation",
        "address1",
        "address2",
        "address3",
        "address4",
        "address5"
      ],
      "line": 48,
      "id": "check-the-functionality-of-mother-and-baby-registrations;create-mother-registration;;1"
    },
    {
      "cells": [
        "123585",
        "Mrs.",
        "MT",
        "Mother",
        "Test",
        "25-3-1989",
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
        "10-2-1988",
        "Graduate",
        "Business",
        "Currently employed",
        "9, Anand",
        "Angamal Colony",
        "Salem",
        "638052",
        "India"
      ],
      "line": 49,
      "id": "check-the-functionality-of-mother-and-baby-registrations;create-mother-registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2689860716,
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
  "duration": 196181039,
  "status": "passed"
});
formatter.match({
  "location": "NeonatalLoginStepDefs.click_on_the_Login_button()"
});
formatter.result({
  "duration": 1028338780,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Create Mother Registration",
  "description": "",
  "id": "check-the-functionality-of-mother-and-baby-registrations;create-mother-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@motherReg"
    },
    {
      "line": 1,
      "name": "@neonatalRegistration"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "click \"New Registration\" tab",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "enter MrNo as \"123585\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "select mother title as \"Mrs.\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "enter mother initial as \"MT\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter mother name as \"Mother\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enter mother lastname as \"Test\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select mothers dob as 25-3-1989",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select mothers education level as \"Graduate\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "enter mothers occupation as \"HouseWife\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select mothers current occupation type as \"Currently employed\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "enter mobile number and alternate mobile number as \"9994587023\" and \"8999548036\"",
  "matchedColumns": [
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "enter mothers email as \"mother@gmail.com\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "enter mother spoken languages as \"Tamil, English\"",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "select partner title as \"Mr.\"",
  "matchedColumns": [
    13
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "enter partner initial as \"FT\"",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "enter partner name as \"Father\"",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "enter partner lastname as \"Test\"",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "select partners dob as 10-2-1988",
  "matchedColumns": [
    17
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "select partners education level as \"Graduate\"",
  "matchedColumns": [
    18
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "select partners current occupation type as \"Business\"",
  "matchedColumns": [
    19
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "enter partners occupation as \"Currently employed\"",
  "matchedColumns": [
    20
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "click on Same as mother\u0027s contact details including languages check box",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "enter address line1 doorno as \"9, Anand\"",
  "matchedColumns": [
    21
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "enter address line2 street name as \"Angamal Colony\"",
  "matchedColumns": [
    22
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "enter address line3 city as \"Salem\"",
  "matchedColumns": [
    23
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "enter address line4 pincode as \"638052\"",
  "matchedColumns": [
    24
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "enter address line5 country as \"India\"",
  "matchedColumns": [
    25
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "click on same as current address check box for mailing address",
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
  "duration": 527476026,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123585",
      "offset": 15
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_MrNo_as(String)"
});
formatter.result({
  "duration": 201867759,
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
  "duration": 111015837,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MT",
      "offset": 25
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_mother_initial_as(String)"
});
formatter.result({
  "duration": 181435407,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mother",
      "offset": 22
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_mother_name_as(String)"
});
formatter.result({
  "duration": 223951598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 26
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_mother_lastname_as(String)"
});
formatter.result({
  "duration": 182748239,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 22
    },
    {
      "val": "3",
      "offset": 25
    },
    {
      "val": "1989",
      "offset": 27
    }
  ],
  "location": "NeonatalRegistrationStepDefs.select_mothers_dob_as(String,String,String)"
});
formatter.result({
  "duration": 374399963,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Graduate",
      "offset": 35
    }
  ],
  "location": "NeonatalRegistrationStepDefs.select_mothers_education_level_as(String)"
});
formatter.result({
  "duration": 97491066,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HouseWife",
      "offset": 29
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_mothers_occupation_as(String)"
});
formatter.result({
  "duration": 207984226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Currently employed",
      "offset": 43
    }
  ],
  "location": "NeonatalRegistrationStepDefs.select_mothers_current_occupation_type_as(String)"
});
formatter.result({
  "duration": 94014727,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9994587023",
      "offset": 52
    },
    {
      "val": "8999548036",
      "offset": 69
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_mobile_number_and_alternate_mobile_number_as_and(String,String)"
});
formatter.result({
  "duration": 436941788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mother@gmail.com",
      "offset": 24
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_mothers_email_as(String)"
});
formatter.result({
  "duration": 196343354,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tamil, English",
      "offset": 34
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_mother_spoken_languages_as(String)"
});
formatter.result({
  "duration": 207114150,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr.",
      "offset": 25
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_partner_title_as(String)"
});
formatter.result({
  "duration": 84259332,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FT",
      "offset": 26
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_partner_initial_as(String)"
});
formatter.result({
  "duration": 171025256,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Father",
      "offset": 23
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_partner_name_as(String)"
});
formatter.result({
  "duration": 189751550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 27
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_partner_lastname_as(String)"
});
formatter.result({
  "duration": 163923293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 26
    },
    {
      "val": "1988",
      "offset": 28
    }
  ],
  "location": "NeonatalRegistrationStepDefs.select_partners_dob_as(String,String,String)"
});
formatter.result({
  "duration": 370723017,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Graduate",
      "offset": 36
    }
  ],
  "location": "NeonatalRegistrationStepDefs.select_partners_education_level_as(String)"
});
formatter.result({
  "duration": 95532823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Business",
      "offset": 44
    }
  ],
  "location": "NeonatalRegistrationStepDefs.select_partners_current_occupation_type_as(String)"
});
formatter.result({
  "duration": 196163233,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Currently employed",
      "offset": 30
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_partners_occupation_as(String)"
});
formatter.result({
  "duration": 85287033,
  "status": "passed"
});
formatter.match({
  "location": "NeonatalMotherRegStepDefs.click_on_Same_as_mother_s_contact_details_including_languages_check_box()"
});
formatter.result({
  "duration": 70731590,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 18
    },
    {
      "val": "9, Anand",
      "offset": 31
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_address_line_doorno_as(int,String)"
});
formatter.result({
  "duration": 178087005,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    },
    {
      "val": "Angamal Colony",
      "offset": 36
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_address_line_street_name_as(int,String)"
});
formatter.result({
  "duration": 202267753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 18
    },
    {
      "val": "Salem",
      "offset": 29
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_address_line_city_as(int,String)"
});
formatter.result({
  "duration": 172611815,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 18
    },
    {
      "val": "638052",
      "offset": 32
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_address_line_pincode_as(int,String)"
});
formatter.result({
  "duration": 168791121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 18
    },
    {
      "val": "India",
      "offset": 32
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enter_address_line_country_as(int,String)"
});
formatter.result({
  "duration": 193495603,
  "status": "passed"
});
formatter.match({
  "location": "NeonatalMotherRegStepDefs.click_on_same_as_current_address_check_box_for_mailing_address()"
});
formatter.result({
  "duration": 60682978,
  "status": "passed"
});
formatter.after({
  "duration": 86450,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 51,
  "name": "",
  "description": "",
  "id": "check-the-functionality-of-mother-and-baby-registrations;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 52,
  "name": "click on register baby button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "enter baby MrNo as \"\u003cBMrNo\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 54,
  "name": "",
  "description": "",
  "id": "check-the-functionality-of-mother-and-baby-registrations;;",
  "rows": [
    {
      "cells": [
        "BMrNo"
      ],
      "line": 55,
      "id": "check-the-functionality-of-mother-and-baby-registrations;;;1"
    },
    {
      "cells": [
        "18002545"
      ],
      "line": 56,
      "id": "check-the-functionality-of-mother-and-baby-registrations;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2467597751,
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
  "duration": 163913692,
  "status": "passed"
});
formatter.match({
  "location": "NeonatalLoginStepDefs.click_on_the_Login_button()"
});
formatter.result({
  "duration": 987596688,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "",
  "description": "",
  "id": "check-the-functionality-of-mother-and-baby-registrations;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@neonatalRegistration"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "click on register baby button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "enter baby MrNo as \"18002545\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "NeonatalRegistrationStepDefs.clickOnRegisterBabyButton()"
});
formatter.result({
  "duration": 16433118566,
  "error_message": "java.lang.NullPointerException\n\tat sun.reflect.GeneratedMethodAccessor8.invoke(Unknown Source)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:301)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:43)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:287)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:284)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:672)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$23.apply(ExpectedConditions.java:668)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\n\tat in.raster.cucumber.utilities.CommonMethod.clickOnAButton(CommonMethod.java:74)\n\tat in.raster.cucumber.pages.NeonatalRegistrationPage.clickOnRegisterBabyButton(NeonatalRegistrationPage.java:23)\n\tat in.raster.cucumber.steps.NeonatalRegistrationStepDefs.clickOnRegisterBabyButton(NeonatalRegistrationStepDefs.java:191)\n\tat ✽.And click on register baby button(neonatalRegistration.feature:52)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "18002545",
      "offset": 20
    }
  ],
  "location": "NeonatalRegistrationStepDefs.enterBabyMrNoAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 8867976,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d63.0.3239.108)\n  (Driver info: chromedriver\u003d2.34.522913 (36222509aa6e819815938cbf2709b4849735537c),platform\u003dLinux 4.10.0-38-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027raster-ras\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.10.0-38-generic\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.34.522913 (36222509aa6e81..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 63.0.3239.108, webStorageEnabled: true}\nSession ID: f3c593a9273de0ec1182792855732a6f\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:658)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:343)\n\tat in.raster.cucumber.steps.NeonatalLoginStepDefs.afterEveryScenario(NeonatalLoginStepDefs.java:36)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
});