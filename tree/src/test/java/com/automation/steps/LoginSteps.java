package com.automation.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("the employee is on the login page")
public void the_employee_is_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("C:/Users/TDomain/com/com/src/tree/src/test/resources/web-pages/login-page.html");
}

@When("the manager enters its correct username")
public void the_manager_enters_its_correct_username() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterUsername("geedo123");
}
@When("the manager uses its correct password")
public void the_manager_uses_its_correct_password() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterPassword("12345");
}
@When("the employee clicks the button")
public void the_employee_clicks_the_button() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.clickButton(); 
}
@Then("the manager should be redirected to the manager home page")
public void the_manager_should_be_redirected_to_the_manager_home_page() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.wait.until(ExpectedConditions.titleIs("Manager Home"));
   String title = TestRunner.driver.getTitle();

   Assert.assertEquals("Manager Home", title);
}

@When("the tester enters its correct username")
public void the_tester_enters_its_correct_username() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterUsername("terell05");
}
@When("the tester uses its correct password")
public void the_tester_uses_its_correct_password() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterPassword("54321");
}
@Then("the tester should be redirected to the tester home page")
public void the_tester_should_be_redirected_to_the_tester_home_page() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.wait.until(ExpectedConditions.titleIs("Tester Home"));
    String title = TestRunner.driver.getTitle();
 
    Assert.assertEquals("Tester Home", title);;
}

@Given("the manager is at its home page")
public void the_manager_is_at_its_home_page() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("C:/Users/TDomain/com/com/src/tree/src/test/resources/web-pages/manager-home.html");
}

@When("the manager enters a defect description")
public void the_manager_enters_a_defect_description() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.defectInput("automationTest");
}
@When("the manager enters the tester choice")
public void the_manager_enters_the_tester_choice() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.assignInput("terell05");
}
@When("the manager should click the button")
public void the_manager_should_click_the_button() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.managerButton();
}
@Then("the manager should see an updated alert")
public void the_manager_should_see_an_updated_alert() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    // Write code here that turns the phrase above into concrete actions
    String checkIfCreated = TestRunner.driver.switchTo().alert().getText();
     Assert.assertEquals("Updated!", checkIfCreated);
     TestRunner.driver.switchTo().alert().dismiss();
}

}
