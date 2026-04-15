Feature: Login

Scenario: Valid login
  Given user is on login page
  When user logs in with username "student" and password "Password123"
  Then dashboard should be displayed