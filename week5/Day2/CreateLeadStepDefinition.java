package steps;

import org.openqa.selenium.By;

import hooks.HooksImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass {
	
	@When("Click the crmsfa link")
	public void click_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click the Leads button")
	public void click_the_leads_button() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click the CreateLead button")
	public void click_the_create_lead_button() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the Company name as (.*)$")
	public void enter_the_company_name_as_test_leaf(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}
	@Given("Enter the FirstName as (.*)$")
	public void enter_the_first_name_as_vineeth(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@Given("Enter the LastName as (.*)$")
	public void enter_the_last_name_as_rajendran(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@When("Click the submit button")
	public void click_the_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Lead should be created")
	public void lead_should_be_created() {
	  String leadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	if (leadName.equals("Vineeth")) {
		System.out.println("Lead id was created");
	}
	else {
		System.out.println("Lead was not created");
	}
	}

}
