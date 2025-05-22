@Formulario
Feature: Probar la funcionalidad del formulario web.

    Scenario: Como un usuario, cuando ingreso todos los datos correctos en el formulario, quiero ver si no salta ninguna alerta
        Given el usuario navega a la pagina del formulario
    #     When el usuario ingresa datos válidos en todos los campos
    #     And el usuario hace clic en el botón de enviar
    #     Then no debería aparecer ninguna alerta en los campos

    # Scenario: Como un usuario, cuando no ingreso ningun dato en cada campo del formulario, quiero que salten las alertas
    #     Given el usuario navega a la pagina del formulario
    #     When el usuario no ingresa datos en los campos
    #     Then debería aparecer alerta en los campos

    # Scenario: Como un usuario, cuando no ingreso el dato de nombre, quiero ver si salte una alerta 
    #     Given el usuario navega a la pagina del formulario
    #     When el usuario ingresa los datos menos el nombre en los campos
    #     Then debería aparecer una alerta en el campo de nombre

    # Scenario: Como un usuario, cuando no ingreso el @ en email, quiero ver si salte una alerta 
    #     Given el usuario navega a la pagina del formulario
    #     When el usuario no ingresa @ en el email
    #     Then debería aparecer una alerta en el campo de nombre

    # Scenario: Como un usuario, cuando estoy en el formulario, quiero ver si la ortografia es correcta
    #     Given el usuario navega a la pagina del formulario
    #     When el usuario visualiza los textos del formulario
    #     Then todos los textos del formulario deben tener la ortografía correcta