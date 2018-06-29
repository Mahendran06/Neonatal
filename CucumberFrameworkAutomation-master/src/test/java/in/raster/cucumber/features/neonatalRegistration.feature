@neonatalRegistration @MReg
Feature: Check the functionality of mother and baby registrations

  Background:
    Given login with valid credentials
      | username              | password |
      | mahendran.r@raster.in | 123456   |
    And click on the Login button

  Scenario Outline: Create Mother Registration
    Given click "New Registration" tab
    Then enter MrNo
    Then select mother title as "<title>"
    #And enter mother initial as "<initial>"
    #And enter mother name as "<mname>"
    #And enter mother lastname as "<lname>"
    #And select mothers dob as "<date>" "<month>" and "<year>"
    #And select mothers education level as "<meducation>"
    #And enter mothers occupation as "<moccupation>"
    #And select mothers current occupation type as "<mcop>"
    #And enter mobile number and alternate mobile number as "<mmobile>" and "<amobile>"
    #And enter mothers email as "<memail>"
    #And enter mother spoken languages as "<languages>"
    #Then select partner title as "<ptitle>"
    #And enter partner initial as "<pinitial>"
    #And enter partner name as "<pfirstname>"
    #And enter partner lastname as "<plastname>"
    #And select partners dob as "<pDate>" "<pMonth>" and "<pYear>"
    #And select partners education level as "<peducation>"
    #And select partners current occupation type as "<pcop>"
    #And enter partners occupation as "<poccupation>"
    #Then click on Same as mother's contact details including languages check box
    #Then enter address line1 doorno as "<address1>"
    #Then enter address line2 street name as "<address2>"
    #Then enter address line3 city as "<address3>"
    #Then enter address line4 pincode as "<address4>"
    #Then enter address line5 country as "<address5>"
    #Then click on same as current address check box for mailing address
    #And click on register baby button
    #Then enter baby MrNo as "<Bmrno>"
    #Then select babys dob as "<bDate>" "<bMonth>" and "<bYear>"
    #And select babys time of birth as "<bMins>" "<bSecs>" and "<BAM>"
    #And select muliple pregnancy type as "<multiplePregnancy>"
    #And select baby sex as "<sex>"
    #And enter gestation of baby as "<gWeeks>" and "<gDays>"
    #And enter birth status of baby as "<birthStatus>"
    #And enter birth weight of baby as "<bWeight>"
    #And select babys blood group as "<bloodGroup>"
    #And select consultant as "<neonatalConsultant>"

    Examples:
      | mrno      | title | initial | mname  | lname | date | month | year | meducation | moccupation | mcop               | mmobile    | amobile    | memail           | languages      | ptitle | pinitial | pfirstname | plastname | pDate | pMonth | pYear | peducation | pcop     | poccupation        | address1 | address2       | address3 | address4 | address5 | Bmrno    | bDate | bMonth | bYear | bMins | bSecs | BAM | multiplePregnancy | sex  | gWeeks | gDays | birthStatus | bWeight | bloodGroup | neonatalConsultant |
      | 180004600 | Mrs.  | MT      | Mother | Test  | 25   | Apr   | 1990 | Graduate   | HouseWife   | Currently employed | 9994587023 | 8999548036 | mother@gmail.com | Tamil, English | Mr.    | FT       | Father     | Test      | 10    | Jun    | 1988  | Graduate   | Business | Currently employed | 9, Anand | Angamal Colony | Salem    | 638052   | India    | 18000520 | 10    | May    | 2018  | 2     | 50    | AM  | No                | Male | 40     |       | Inborn      | 3000    | B Negative | Dr Shobana S       |
