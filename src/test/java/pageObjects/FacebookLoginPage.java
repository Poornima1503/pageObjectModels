package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.font.TrueTypeFont;

import java.sql.SQLOutput;

import static stepDefinition.CucumberHooks.driver;

public class FacebookLoginPage {
    WebElement emailInput;
    WebElement pwdInput;
    WebElement firstNameInput;
    WebElement surNameInput;
    WebElement loginButton;
    WebElement MobNumInput;
    WebElement NewPwdInput;
    WebElement BdayInput;
    WebElement DayInput;
    WebElement MonthInput;
    WebElement YearInput;
    WebElement GenderInput;
    WebElement FemaleRadioButton;
    WebElement MaleRadioButton;
    WebElement SignUpButton;
    WebElement SignUpError;
    WebElement ForgotAccountLink;
    WebElement ForgotYourAccountTitle;

    public FacebookLoginPage(WebDriver driver){
     emailInput= driver.findElement(By.id("email"))   ;
     pwdInput = driver.findElement(By.id("pass"));
     firstNameInput= driver.findElement(By.xpath("//input[@name='firstname']"));
     surNameInput= driver.findElement(By.xpath("//input[@name='lastname']"));
     loginButton= driver.findElement(By.xpath("//input[@value='Log In']"));
     MobNumInput= driver.findElement(By.xpath("//input[@name='reg_email__']"));
     NewPwdInput= driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
     DayInput = driver.findElement(By.xpath("//select[@id='day']"));
     MonthInput= driver.findElement(By.xpath("//select[@id='month']"));
     YearInput= driver.findElement(By.xpath("//select[@id='year']"));
     FemaleRadioButton= driver.findElement(By.xpath("//input[@value='1']"));
     MaleRadioButton=driver.findElement(By.xpath("//input[@value='2']"));
     SignUpButton=driver.findElement(By.name("websubmit"));
     SignUpError= driver.findElement(By.xpath("//div[@id='reg_error_inner']"));
     ForgotAccountLink= driver.findElement(By.linkText("Forgotten account?"));
     //ForgotYourAccountTitle=driver.findElement(By.xpath("//div//h2[@class='accessible_elem' and text()='Find Your Account']"));

    }

    public void loginPage(String usr, String pwd){
        emailInput.sendKeys(usr);
        pwdInput.sendKeys(pwd);
        loginButton.click();
    }
    public void SignUpPage(String fName, String lName, String mobNum, String newPwd ){
        firstNameInput.sendKeys(fName);
        surNameInput.sendKeys(lName);
        MobNumInput.sendKeys(mobNum);
        NewPwdInput.sendKeys(newPwd);
        Select day = new Select(DayInput);
        day.selectByIndex(6);
        Select month = new Select(MonthInput);
        month.selectByIndex(10);
        Select year = new Select(YearInput);
        year.selectByVisibleText("1991");
        FemaleRadioButton.click();
        SignUpButton.click();
    }
    public void SignUpError(){
      SignUpError.isDisplayed();
       System.out.println("Password verification during signUp success");
    }
    public void ForgottenAccount(){
        ForgotAccountLink.click();

    }
public void ForgotYourAccountPage(){
  Assert.assertEquals(true,ForgotYourAccountTitle.isDisplayed());
    System.out.println("I am in Find your account page");
}
}
