package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize(); // Maximiza la pantalla
    }

    // Constructor
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    // Metodo para navegar a una URL
    public void navegarUrl(String url) {
        driver.get(url);
    }

    // Metodo para cerrar el navegador
    public static void cerrarNavegador() {
        driver.close();
    }

    // Localizador de ubica a un elemento por su Xpath
    private WebElement econtrarElementoXpath(String localizador) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(localizador)));
    }

    // Localizador de ubica a un elemento por su Id
    private WebElement econtrarElementoId(String localizador) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(localizador)));
    }

    // Localizador de ubica a un elemento por su Nombre
    private WebElement econtrarElementoName(String localizador) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.name(localizador)));
    }

    // Localizador de ubica a un elemento por su Selector Css
    private WebElement econtrarElementoCss(String localizador) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(localizador)));
    }

    // Metodo para clicar un elemento por su Xpath
    public void clicarElementoXpath(String localizador) {
        econtrarElementoXpath(localizador);
    }

    // Metodo para clicar un elemento por su Id
    public void clicarElementoXpathId(String localizador) {
        econtrarElementoId(localizador);
    }

    // Metodo para clicar un elemento por su Nombre
    public void clicarElementoName(String localizador) {
        econtrarElementoName(localizador);
    }

    // Metodo para clicar un elemento por su Selector Css
    public void clicarElementoCss(String localizador) {
        econtrarElementoCss(localizador);
    }

    // Metodo para escribir
    public void escribir(String localizador, String texto) {
        clicarElementoName(localizador);
        econtrarElementoName(localizador).clear();
        econtrarElementoName(localizador).sendKeys(texto);
    }

    // Metodo para validar que un elemento es visible
    public void elementoVisible(String locator, String mensaje) {
        String textoEsperado = mensaje;
        String textoEncontrado = econtrarElementoCss(locator).getText();
        
        Assert.assertTrue(textoEncontrado.contains(textoEsperado));
    }

    // Metodo para validad que un elemento no es visible
    public void elementoNoVisible(String locator, String mensaje) {
        String textoEsperado = mensaje;
        String textoEncontrado = econtrarElementoCss(locator).getText();

        Assert.assertFalse(textoEncontrado.contains(textoEsperado));
    }
    // Metodo que valida si un elemento web esta presente
    public void estaPresente(String locator) {
        WebElement elemento = econtrarElementoCss(locator);

        Assert.assertTrue(elemento.isDisplayed());
    }
    
    // Metodo que valida si un elemento web esta no presente
    public void noPresente(String locator) {
        WebElement elemento = econtrarElementoCss(locator);

        Assert.assertFalse(elemento.isDisplayed());
    }

    // Metodo para Validar que las palabras son las mismas
    public void encontrarTexto(String localizador, String texto){
        String textoEsperado = texto;
        String textoEncontrado = econtrarElementoXpath(localizador).getText();

        Assert.assertEquals(textoEsperado, textoEncontrado);
    }
}