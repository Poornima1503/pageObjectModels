package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



    public class CucumberHooks {
        public static WebDriver driver;
        @Before
        public void beforeScenario(){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\poorn\\IdeaProjects\\pageObjectModels\\src\\test\\java\\utility\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        @After
        public void afterScenario(){
driver.quit();

        }

    }


