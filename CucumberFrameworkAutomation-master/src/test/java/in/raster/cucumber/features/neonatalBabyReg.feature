@babyRegistration
  Feature: Check baby registration functionalities
@registration
    Scenario: Check that baby registration page is displayed
      Given login with valid credentials "mahendran.r@raster.in" and "123456"
      And click on "registration" tab
      And click on baby registration tab
      Then check that baby registration page is displayed

    Scenario: Check that baby details is entered and saved
      Given login with valid credentials "mahendran.r@raster.in" and "123456"
      And click on "registration" tab
      And click on baby registration tab
      Then click on baby registration create new button
      And click on select from list drop down in choose mother page
      And click on start button
      Then check that baby registration create page is displayed
      Then enter "8745/8888" in baby mrno text field
      And check that "B/O Mother Father" baby name is displayed
      And select baby date of birth
      And select baby's time of birth "5" hrs "14"min "PM" evening
      And select "No" in multiple pregnancy drop down menu
      And select "Female" from baby's sex drop down menu
      And enter "40" gestation in weeks and "2" gestation in days
      And select "Outborn" from birth status drop down menu
      And enter "3000" birth weight of a baby
      Then check that birth weight "3000" is displaying in kilogram
      And select "B Negative" from baby's blood group drop down menu
      And select "Dr Shobana S" from neonatal consultant drop down menu
      Then click on Add more button if you want to add more consultant
      Then select "Dr S Ramakrishnan MRCPCH, MRCPI" from neonatal consultant add more drop down menu
     # Then select "Dr test" from Paediatric Surgeon drop down menu
     # Then click on save button