Feature: Checking Doctor Login

    Background:
        Given The Guest is on the login page

    Scenario Outline: The Guest tries to login with the doctor login button
        When The User types in "<email>" and The User types in "<password>"
        Then The new title of the page should be "<title>"

    Examples:
        |    email                    |    password        |    title            |
        |    itsdoctor@gmail.com      |    password        |    Doctor Portal    |