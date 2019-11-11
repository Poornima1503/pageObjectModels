package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FacebookLoginPage;

import static stepDefinition.CucumberHooks.driver;

public class facebookLogin {

FacebookLoginPage flp;
FacebookLoginPage flp2;
FacebookLoginPage flp3;
FacebookLoginPage flp4;
FacebookLoginPage flp5;

    @Given("^The facebook url$")
    public void the_facebook_url() {
        driver.get("https://www.facebook.com");

    }

    @When("^I give user id and password$")
    public void i_give_user_id_and_password(){
        flp=new FacebookLoginPage(driver);
        flp.loginPage("poornii87@gmail.com","");

    }

    @Then("^I can login succesfully$")
    public void i_can_login_succesfully(){
    }

    @When("^I give first name, Sur name, mobile number, New password, birthday and gender$")
    public void i_give_first_name_Sur_name_mobile_number_New_password_birthday_and_gender(){
        flp2=new FacebookLoginPage(driver);
        flp2.SignUpPage("abcd", "xyz","1234567890","qaz");
    }

    @Then("^I cannot signUp due to new password error$")
    public void i_cannot_signUp_due_to_new_password_error()  {
        flp3=new FacebookLoginPage(driver);
       flp3.SignUpError();
    }
    @When("^I click on 'Forgot account' link$")
    public void i_click_on_Forgot_account_link(){
     flp4 = new FacebookLoginPage(driver);
      flp4.ForgottenAccount();
    }

    @Then("^I land on 'forgot account' page to reset account details$")
    public void i_land_on_forgot_account_page_to_reset_account_details() {
      flp5= new FacebookLoginPage(driver);
    flp5.ForgotYourAccountPage();
    }






}
