package steps;

import io.cucumber.java.en.*;
import pages.FormularioPage;

public class FormularioSteps {
    
    private FormularioPage formulario = new FormularioPage();

    @Given("^el usuario navega a la pagina del formulario$")
    public void navegarFormulario(){
        formulario.navegarA();
    }

    @When("^el usuario ingresa datos válidos en todos los campos$")
    public void ingresarDatosCompletos(){
        formulario.textoCamposCompleta();
    }

    @When("^el usuario no ingresa datos en los campos$")
    public void noIngresaDatos(){
        formulario.sinTextoCampos();
    }

    @When("^el usuario ingresa los datos menos el nombre en los campos$")
    public void datoFaltanteNombre(){
        formulario.sinTextoNombre();
    }

    @When("^el usuario no ingresa @ en el email$")
    public void datoFaltanteEmail(){
        formulario.datosFaltanteEmail();
    }
}
