package pages;

public class FormularioPage extends BasePage{
    
    // private String tituloNombre = "//label[normalize-space()='Tu Nombre:']"; // Localizador por Xpath
     private String campoNombre = "nombre"; // Localizador por nombre
    private String alertaNombre = "div[id='grupo__nombre'] p[class='formulario__input-error formulario__input-error-activo']"; // Localizador por Selector Css

    // private String tituloEmail = "//label[normalize-space()='Tu Email:']"; // Localizador por Xpath
     private String campoEmail = "email"; // Localizador por nombre
    private String alertaEmail = "div[id='grupo__email'] p[class='formulario__input-error formulario__input-error-activo']"; // Localizador por Selector Css

    // private String tituloBarrio = "//label[normalize-space()='Varrio']"; // Localizador por Xpath
     private String campoBarrio = "barrio"; // Localizador por nombre 
    private String alertaBarrio = "div[id='grupo__barrio'] p[class='formulario__input-error formulario__input-error-activo']"; // Localizador por Selector Css

    // private String tituloAsunto = "//label[normalize-space()='Asunto:']"; // Localizador por Xpath
     private String campoAsunto = "asunto"; // Localizador por nombre
    private String alertaAsunto = "div[id='grupo__asunto'] p[class='formulario__input-error formulario__input-error-activo']"; // Localizador por Selector Css
    
    // private String tituloMensaje = "//label[normalize-space()='Mensage:']"; // Localizador por Xpath
     private String campoMensaje = "Mensaje"; // Localizador por nombre

    String mensaje[] = {
        "El nombre debe ser mayor a 4 letras y no debe incluir caracteres especiales", // el indice para este mensaje es el 0 
        "El Email debe ser mayor a 4 caracteres y debe llevar @ y . no debe incluir caracteres especiales", // el indice para este mensaje es el 1
        "El barrio debe ser mayor a 4 letras", // el indice para este mensaje es el 2
        "El asunto debe ser mayor a 4 letras" // el indice para este mensaje es el 3
    };

    // Constructor
    public FormularioPage(){
        super(driver);
    }

    // Metodo para navegar a la URL indicada
    public void navegarA(){
        navegarUrl("http://64.227.54.255/Softesting/Frontend/Caso1.html");
    }

    // Metodo para llenar los campos de texto del formulario
    public void textoCamposCompleta(){
        escribir(campoNombre, "Toreto Familia");
        escribir(campoBarrio, "Rosario");
        escribir(campoEmail, "toretoCarrera@gmail.com");
        escribir(campoAsunto, "Saludos a Mis Amigos");
        escribir(campoMensaje, "Hola amigos, espero se encuentren muy bien. ¿Qué día va a ser la carrera?");
    }

    //Metodo para hacer que salten las alertas por no ingresar datos al formulario
    public void sinTextoCampos(){
        escribir(campoNombre, "");
        escribir(campoBarrio, "");
        escribir(campoEmail, "");
        escribir(campoAsunto, "");
        escribir(campoMensaje, "");
    }

    //Metodo para ingresar datos menos el nombre
    public void sinTextoNombre(){
        escribir(campoNombre, "");
        escribir(campoBarrio, "Rosario");
        escribir(campoEmail, "toretoCarrera@gmail.com");
        escribir(campoAsunto, "Saludos a Mis Amigos");
        escribir(campoMensaje, "Hola amigos, espero se encuentren muy bien. ¿Qué día va a ser la carrera?");
    } 
    
    //Metodo para ingresar el Correo con datos faltantes
    public void datosFaltanteEmail(){
        escribir(campoNombre, "Toreto Familia");
        escribir(campoBarrio, "Rosario");
        escribir(campoEmail, "toretoCarreragmail.com");
        escribir(campoAsunto, "Saludos a Mis Amigos");
        escribir(campoMensaje, "Hola amigos, espero se encuentren muy bien. ¿Qué día va a ser la carrera?");
    }

    // Metodo para validar que aparece una alerta en nombre
    public void visibiMensaNombre(){
        elementoVisible(alertaNombre, mensaje[0]);
    }

    // Metodo para validar que aparece una alerta en email
    public void visibiMensaEmail(){
        elementoVisible(alertaEmail, mensaje[1]);
    }
    
    // Metodo para validar que aparece una alerta en barrio
    public void visibiMensaBarrio(){
        elementoVisible(alertaBarrio, mensaje[2]);
    }
    
    // Metodo para validar que aparece una alerta en asunto
    public void visibiMensaAsunto(){
        elementoVisible(alertaAsunto, mensaje[3]);
    }

    // Metodo para validar que aparece una alerta en cada campo
    public void alertaTodosCampos(){
        visibiMensaNombre();
        visibiMensaEmail();
        visibiMensaBarrio();
        visibiMensaAsunto();
    }

    // Metodo para validar que No aparece una alerta en nombre
    public void noVisibiMensaNombre(){
        elementoNoVisible(alertaNombre, mensaje[0]);
    }

    // Metodo para validar que No aparece una alerta en email
    public void noVisibiMensaEmail(){
        elementoNoVisible(alertaEmail, mensaje[1]);
    }
    
    // Metodo para validar que No aparece una alerta en barrio
    public void noVisibiMensaBarrio(){
        elementoNoVisible(alertaBarrio, mensaje[2]);
        
    }
    
    // Metodo para validar que No aparece una alerta en asunto
    public void noVisibiMensaAsunto(){
        elementoNoVisible(alertaAsunto, mensaje[3]);
    }

    // Metodo para validar que no aparece ninguna alerta
    public void noAlertas(){
        noPresente(alertaNombre);
        noPresente(alertaEmail);
        noPresente(alertaBarrio);
        noPresente(alertaAsunto);
    }
}