@neonatalLogin
  Feature: Check login functionality of Neonatal page
    @invalidLogin
    Scenario: Check the Neonatal login page with valid username and password
      Given login page is displayed
      And enter the username "mahendran.r@raster.in"
      And enter the password "123456"
      And click on the Login button
      Then check that neonatal dashboard name displays

      Scenario: Check error message is displaying for invalid username and password
        Given login page is displayed
        And enter the username "m@gmail.com"
        And enter the password "1234"
        And click on the Login button
        Then check that error message is displayed