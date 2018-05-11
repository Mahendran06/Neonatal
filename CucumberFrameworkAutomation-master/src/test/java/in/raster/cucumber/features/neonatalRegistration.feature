@neonatalRegistration
Feature: Check the functionality of mother and baby registrations

  Background:
    Given login with valid credentials
      | username              | password |
      | mahendran.r@raster.in | 123456   |
    And click on the Login button

  Scenario Outline: Create Mother Registration
    Given click "New Registration" tab
    Then enter MrNo as "<mrno>"
    Then select mother title as "<title>"
    And enter mother initial as "<initial>"
    And enter mother name as "<mname>"
    And enter mother lastname as "<lname>"
    And select mothers dob as <dob>
    And select mothers education level as "<meducation>"
    And enter mothers occupation as "<moccupation>"
    And select mothers current occupation type as "<mcop>"
    And enter mobile number and alternate mobile number as "<mmobile>" and "<amobile>"
    And enter mothers email as "<memail>"
    And enter mother spoken languages as "<languages>"
    Then select partner title as "<ptitle>"
    And enter partner initial as "<pinitial>"
    And enter partner name as "<pfirstname>"
    And enter partner lastname as "<plastname>"
    And select partners dob as <pdob>
    And select partners education level as "<peducation>"
    And select partners current occupation type as "<pcop>"
    And enter partners occupation as "<poccupation>"
    Then click on Same as mother's contact details including languages check box
    Then enter address line1 doorno as "<address1>"
    Then enter address line2 street name as "<address2>"
    Then enter address line3 city as "<address3>"
    Then enter address line4 pincode as "<address4>"
    Then enter address line5 country as "<address5>"
    Then click on same as current address check box for mailing address
      #Then click on save and close button
      #Then check that "<mrno>" is saved and displaying
    And click on register baby button
    Then enter baby MrNo as "<BMrNo>"



    Examples:
      | mrno   | title | initial | mname  | lname | dob       | meducation | moccupation | mcop               | mmobile    | amobile    | memail           | languages      | ptitle | pinitial | pfirstname | plastname | pdob      | peducation | pcop     | poccupation        | address1 | address2       | address3 | address4 | address5 |
      | 123585 | Mrs.  | MT      | Mother | Test  | 25-3-1989 | Graduate   | HouseWife   | Currently employed | 9994587023 | 8999548036 | mother@gmail.com | Tamil, English | Mr.    | FT       | Father     | Test      | 10-2-1988 | Graduate   | Business | Currently employed | 9, Anand | Angamal Colony | Salem    | 638052   | India    |

    Examples:
      | BMrNo    |
      | 18002545 |
