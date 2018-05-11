@neonatal
  Feature: Check the functionality of Neonatal Proforma

    Background:
      Given login with valid credentials "mahendran.r@raster.in" and "123456"
      And click on neonate Basic entry form for all babies tab
      Then check that neonatal proforma page is displayed

#    Scenario: Check that neonatal proforma page is displayed when clicked on neonatal proforma tab
     #Given login with valid credentials "mahendran.r@raster.in" and "123456"
      #And click on neonate Basic entry form for all babies tab
      #Then check that neonatal proforma page is displayed

    Scenario: Check that baby details is registered and saved
      #Given login with valid credentials "mahendran.r@raster.in" and "123456"
        #And click on neonate Basic entry form for all babies tab
        #Then check that neonatal proforma page is displayed
        And click on create new button in neonatal proforma page
        And click on select from list drop down menu to select the baby
        And click on "B/O Mother Father - 123/454MB" from the listed select baby drop down
        Then click on start button to enter medical details
        Then check that baby details tab is displayed

    Scenario: Check that basic details are displayed and should also be edited and saved
          #Given login with valid credentials "mahendran.r@raster.in" and "123456"
          #And click on neonate Basic entry form for all babies tab
          #Then check that neonatal proforma page is displayed
          And click on create new button in neonatal proforma page
          And click on select from list drop down menu to select the baby
          And click on "B/O Mother Father - 123/454MB" from the listed select baby drop down
          Then click on start button to enter medical details
          Then check that baby details tab is displayed
          Then check that system date is displayed in date field
          Then check that "B/O Mother Father" baby name is displaying in baby name text field
          Then check that "25-03-2010" dob is displayed in DOB text field

