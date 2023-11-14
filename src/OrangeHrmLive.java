import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    /**
     * Project-2 - ProjectName : com-orangehrmlive
     * BaseUrl = https://opensource-demo.orangehrmlive.com/
     * 1. Setup chrome browser.
     * 2. Open URL.
     * 3. Print the title of the page.
     * 4. Print the current url.
     * 5. Print the page source.
     * 6. Click on ‘Forgot your password?’ link.
     * 7. Print the current url.
     * 8. Navigate back to the login page.
     * 9. Refresh the page.
     * 10. Enter the email to email field.
     * 11. Enter the password to password field.
     * 12. Click on Login Button.
     * 13. Close the browser.
     */


    public class OrangeHrmLive {
        public static void main(String[] args) {

            String baseUrl = "https://opensource-demo.orangehrmlive.com/";

            // 1. Setup chrome browser.
            WebDriver driver = new ChromeDriver();

            // 2. Open Url.
            driver.get(baseUrl);

            // 3. Print the title of the page.
            String title = driver.getTitle();
            System.out.println(title);

            // 4. Print the current Url.
            System.out.println("This is current Url: " + driver.getCurrentUrl());

            // 5. Print the page source.
            System.out.println(driver.getPageSource());

            // 6. Click on ‘Forgot your password?’ link.
            WebElement forgotPasswordLink = driver.findElement(By.className("oxd-text oxd-text--p orangehrm-login-forgot-header"));
            forgotPasswordLink.click();

            // Step 7: Print the current URL.
            System.out.println("Current Url after clicking 'Forgot your password': " + driver.getCurrentUrl());

            // Step 8: Navigate back to the login page.
            driver.navigate().back();

            // Step 9: Refresh the page.
            driver.navigate().refresh();

            // Step 10: Enter the email to the email field.
            WebElement emailField = driver.findElement(By.className("oxd-input oxd-input--active"));
            emailField.sendKeys("Admin");

            // Step 11: Enter the password to the password field.
            WebElement passwordField = driver.findElement(By.className("oxd-input oxd-input--active"));
            passwordField.sendKeys("admin123");

            // Step 12: Click on Login Button.
            WebElement loginButton = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
            loginButton.click();

            // Step 13: Close the browser.
            driver.quit();


        }
    }
























