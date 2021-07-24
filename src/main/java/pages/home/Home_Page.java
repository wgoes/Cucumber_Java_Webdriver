package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {

    protected WebDriver driver;

    public Home_Page(WebDriver driver) {

        this.driver = driver;
    }

    public void clicarEmBuscar(){
        driver.findElement(By.cssSelector(".button.button--primary.button--large.button--block")).click();
    }

    public String obterTextoTituloRegiaoCLiente(){
        String txtTituloRegiaoCliente = driver.findElement(By.cssSelector(".titulo")).getText();
        return txtTituloRegiaoCliente;
    }



}
