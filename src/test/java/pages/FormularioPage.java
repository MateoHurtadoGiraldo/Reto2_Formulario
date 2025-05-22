package pages;

public class FormularioPage extends BasePage{
    
    // private String tituloNombre = "//label[normalize-space()='Tu Nombre:']"; // Locator
    // private String campoNombre = "nombre"; // Locator Id
    // private String alertaNombre = "div[id='grupo__nombre'] p[class='formulario__input-error formulario__input-error-activo']"; // Locator Css Selector

    // private String tituloEmail = "//label[normalize-space()='Tu Email:']"; // Locator XPath 
    // private String campoEmail = "email"; // Locator Name
    // private String alertaEmail = "div[id='grupo__email'] p[class='formulario__input-error formulario__input-error-activo']"; // Locator Css Selector

    // private String tituloBarrio = "//label[normalize-space()='Varrio']"; // Locator XPath
    // private String campoBarrio = "barrio"; // Locator Name 
    // private String alertaBarrio = "div[id='grupo__barrio'] p[class='formulario__input-error formulario__input-error-activo']"; // Locator Css Selector

    // private String tituloAsunto = "//label[normalize-space()='Asunto:']"; // Locator XPath 
    // private String campoAsunto = "asunto"; // Locator
    // private String alertaAsunto = "div[id='grupo__asunto'] p[class='formulario__input-error formulario__input-error-activo']"; // Locator Css Selector
    
    // private String tituloMensaje = "//label[normalize-space()='Mensage:']"; // Locator XPath 
    // private String campoMensaje = "Mensaje"; // Locator XPath

    // Constructor
    public FormularioPage(){
        super(driver);
    }

    public void navegarA(){
        navegarUrl("http://64.227.54.255/Softesting/Frontend/Caso1.html");
    }
}
