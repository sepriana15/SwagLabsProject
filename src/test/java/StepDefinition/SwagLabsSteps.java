package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class SwagLabsSteps {
//    WebDriver driver = new ChromeDriver();
    WebDriver driver = new FirefoxDriver();
    @Test
    void setup() {
        System.setProperty("webdriver.firefox.driver", System.getProperty("ISQA.dir")+ "/src/test/resources/geckodriver-v0.31.0-win64/geckodriver.exe");
    }
   @Given("User navigate to SwagLabs Page")
    public void userNavigateToSwagLabsPage(){
        driver.get("https://www.saucedemo.com");

   }

   @When("User enter correct username and password values")
    public void userEnterCorrectUsernameAndPasswordValues(){
       driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

       driver.findElement(By.xpath("//input[@type='submit']")).click();
   }

    @Then("User get directed to dashboard page")
    public void userGeDirectedToDashboardPage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.saucedemo.com/inventory.html");
        boolean status = driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
        Assert.assertEquals(true, status);

    }
    @And("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }

    @When("User leave the username and password fields empty")
    public void usernameAndPasswordFieldsEmpty(){
        driver.findElement(By.xpath("//input[@id='user-name']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("User should see an error message")
    public void userSeeAnErrorMessage(){
       driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
    }

    @When("User enter invalid credentials")
    public void userEnterInvalidCredentials(){
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("problem_user");

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @And("User verify button Filter")
    public void verifyButtonFilter(){
        boolean status = driver.findElement(By.xpath("//select[@class='product_sort_container']")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @Then("User click button Filter")
    public void clickButtonFilter(){
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
    }


    @Then("User click Name A to Z")
    public void clickNameAtoZ(){
        driver.findElement(By.xpath("//option[@value='az']")).click();
    }

    @Then("User click Price low to high")
    public void clickPriceLowtoHigh(){
        driver.findElement(By.xpath("//option[@value='lohi']")).click();
    }

    @Then("User click Price high to low")
    public void clickPriceHightoLow(){
        driver.findElement(By.xpath("//option[@value='hilo']")).click();
    }

    @And("User verify button Add to cart")
    public void verifyButtonAddtoCart(){
        boolean status = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @Then("User click button Add to cart")
    public void clickButtonAddtoCart(){
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }

    @And("User verify button remove")
    public void verifyButtonChangetoRemove(){
        boolean status = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @Then("User click button cart")
    public void clickButtonCart(){
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
    }

    @And("User redirected to cart page")
    public void redirectedToCartPage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.saucedemo.com/cart.html");

        WebElement element = driver.findElement(By.xpath("//span[@class='title']"));

        String actualValue = element.getText();
        String expectedValue = "Your Cart";

        //verify
        if (actualValue.equals(expectedValue)){
            System.out.println("You in Page Cart" + actualValue);
        } else {
            System.out.println("You not in Page Cart. Actual You in : " + actualValue + ", Expected : " + expectedValue);
        }
    }

    @Then("User validate product")
    public void validateProduct(){
        //validate
        boolean product = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).isDisplayed();
        Assert.assertEquals(true, product);

        //validate QTY
        boolean QTY = driver.findElement(By.xpath("//div[@class='cart_quantity']")).isDisplayed();
        Assert.assertEquals(true, QTY);
    }


    @Then("User click button Remove")
    public void clickButtonRemove(){
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
    }
}
