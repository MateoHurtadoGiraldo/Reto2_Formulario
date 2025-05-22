package steps;

import io.cucumber.java.en.*;
import pages.FormularioPage;

public class FormularioSteps {
    
    private FormularioPage formulario = new FormularioPage();

    @Given("^el usuario navega a la pagina del formulario$")
    public void navegarFormulario(){
        formulario.navegarA();
    }
}
