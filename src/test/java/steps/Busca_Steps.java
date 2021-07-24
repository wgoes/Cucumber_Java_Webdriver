package steps;

import config.BaseConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.home.Home_Page;

public class Busca_Steps extends BaseConfig {

    WebDriver driver = instanciarDriver();
    Home_Page home_Page = new Home_Page(driver);

    @Dado("que o usuário está na home do site de carros")
    public void que_o_usuário_está_na_home_do_site_de_carros() {
        driver.get("https://www.icarros.com.br/principal/index.jsp");
    }

    @Quando("clicar em Buscar")
    public void clicar_em_Buscar() {
        home_Page.clicarEmBuscar();
    }

    @Entao("deve visualizar os carros para a região em que o cliente se encontra.")
    public void deve_visualizar_os_carros_para_a_região_em_que_o_cliente_se_encontra() {
        Assert.assertEquals("Carros em Votorantim - SP", home_Page.obterTextoTituloRegiaoCLiente());
    }

    @Before
    public WebDriver setup(){
        driver.manage().window().maximize();
        return driver;
    }

    @After
    public void finalizar(){
        driver.close();
    }
}
