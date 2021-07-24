package config;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseConfig {
    WebDriver driver;

    public WebDriver instanciarDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wdsgo\\OneDrive\\Área de Trabalho\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }


}
