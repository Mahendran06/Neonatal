@neonatalLogin
Feature: Check login functionality of Neonatal page

  Scenario: Check the Neonatal login page with valid username and password
    Given login page is displayed
    Given login with valid credentials
      | username              | password |
      | mahendran.r@raster.in | 123456   |
    And click on the Login button
    Then check that neonatal dashboard name displays

  Scenario: Check error message is displaying for invalid username and password
    Given login page is displayed
    Given login with valid credentials
      | username              | password |
      | mahendran.r@raster.in | 1234     |
    And click on the Login button
    Then check that error message is displayed