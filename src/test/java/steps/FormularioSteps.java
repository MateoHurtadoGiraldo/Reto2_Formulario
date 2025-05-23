package steps;

import io.cucumber.java.en.*;
import pages.FormularioPage;

public class FormularioSteps {
    
    private FormularioPage formulario = new FormularioPage();

    @Given("^el usuario navega a la pagina del formulario$")
    public void navegarFormulario(){
        formulario.navegarA();
    }

    @When("^ingresa datos válidos en todos los campos$")
    public void ingresarDatosCompletos(){
        formulario.textoCamposCompleta();
    }

    @When("^no ingresa datos en los campos$")
    public void noIngresaDatos(){
        formulario.sinTextoCampos();
    }

    @When("^ingresa los datos menos el nombre en los campos$")
    public void datoFaltanteNombre(){
        formulario.sinTextoNombre();
    }

    @When("^no ingresa @ en el email$")
    public void datoFaltanteEmail(){
        formulario.datosFaltanteEmail();
    }

    // @When("^visualiza los textos del formulario$")
    // public void obtenerTexto(){
        
    // }

    @Then("^no debería aparecer ninguna alerta$")
    public void validacionNoAlertas(){
        formulario.noAlertas();
    }

    @Then("^debería aparecer una alerta en los campos principales$")
    public void validarAlertas(){
        formulario.alertaTodosCampos();
    }
    
    @Then("^debería aparecer una alerta en el campo de nombre$")
    public void validarAlertaNombre(){
        formulario.visibiMensaNombre();
    }

    @Then("^debería aparecer una alerta en el campo de email$")
    public void validarAlertaEmail(){
        formulario.visibiMensaEmail();
    }
}