Feature: Users should be able to login to access their homepages

    Scenario: As a manager I want to sign in so that I can do my custom home page

        Given the employee is on the login page
        When the manager enters its correct username
        When the manager uses its correct password
        When the employee clicks the button
        Then the manager should be redirected to the manager home page

    Scenario: As a tester I want to sign into my home page
        Given the employee is on the login page
        When the tester enters its correct username
        When the tester uses its correct password
        When the employee clicks the button
        Then the tester should be redirected to the tester home page

