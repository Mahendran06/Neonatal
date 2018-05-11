@motherRegistration
Feature: Check mother registration functionalities
  @register
  Scenario: Check that mother registration page is displayed
    Given login with valid credentials "mahendran.r@raster.in" and "123456"
    And click on "registration" tab
    And click on mother registration tab
    Then check that mother registration page is displayed

  Scenario: Check that mother details and partner details are entered and saved
    Given login with valid credentials "mahendran.r@raster.in" and "123456"
    And click on "registration" tab
    And click on mother registration tab
    And click on create new button
    Then check that mother details page is displayed
    And enter "951/357" in the MrNo textfield
    And select "Mrs." from mother details title dropdown menu
    And enter "R" in mother details initial text field
    And enter "Mother" in mother details first name text field
    And enter "Test" in mother details last name text field
    And select dob from mother details dob field date picker
    And select "Graduate" from mother details mother's education level drop down menu
    And enter "House Wife" in mother details occupation type text field
    And select "Previously employed but currently not employed" from mother details current occupation status drop down menu
    And enter "9994578521" and "9778524568" in mother details in contact fields
    And enter "mother@gmail.com" in mother details email text field
    And enter "Tamil" in mother details mother spoken languages
    And select "Mr." from partner details title dropdown menu
    And enter "PR" in partner details initial text field
    And enter "Father" in partner details first name text field
    And enter "Test" in partner details last name text field
    And select dob from partner details dob field date picker
    And select "Graduate" from partner details father's education level drop down menu
    And enter "Employee" in partner details occupation type text field
    And select "Currently employed" from partner details current occupation status drop down menu
    Then click on Same as mother's contact details including languages check box
    Then check that mother's and partner's contact details, email, language are same
    Then enter "9" in address line1 doorno field
    And enter "Angamal Colony" in adddress line2 streetname field
    And enter "Chennai" in address line3 city field
    And enter "600036" in address line4 pincode field
    And enter "India" in address line5 country field
    Then click on same as current address check box for mailing address
    Then check that same address is displaying
    Then click on save button
    #Then Checking







