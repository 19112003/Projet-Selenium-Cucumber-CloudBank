package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverSingleton {
    private static WebDriver driver ;

    public static WebDriver getInstance(){
            if (driver == null){
                    driver = new ChromeDriver();
                driver.manage().window().maximize();
                //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));

            }
            return driver;
        }

        public static void destroy(){
            if (driver != null){
                driver.quit();
                driver = null ;
            }
        }
    }