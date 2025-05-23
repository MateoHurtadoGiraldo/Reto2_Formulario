@Formulario
Feature: Probar la funcionalidad del formulario web.

    Scenario: Como un usuario, cuando ingreso todos los datos correctos en el formulario, quiero ver si no salta ninguna alerta
        Given el usuario navega a la pagina del formulario
        When ingresa datos válidos en todos los campos
        Then no debería aparecer ninguna alerta

    # Scenario: Como un usuario, cuando no ingreso ningun dato en cada campo del formulario, quiero que salten las alertas
    #     Given el usuario navega a la pagina del formulario
    #     When no ingresa datos en los campos
    #     Then debería aparecer una alerta en los campos principales

    # Scenario: Como un usuario, cuando no ingreso el dato de nombre, quiero ver si salte una alerta 
    #     Given el usuario navega a la pagina del formulario
    #     When ingresa los datos menos el nombre en los campos
    #     Then debería aparecer una alerta en el campo de nombre

    # Scenario: Como un usuario, cuando no ingreso el @ en email, quiero ver si salte una alerta 
    #     Given el usuario navega a la pagina del formulario
    #     When no ingresa @ en el email
    #     Then debería aparecer una alerta en el campo de email

    # Scenario: Como un usuario, cuando estoy en el formulario, quiero ver si la ortografia es correcta
    #     Given el usuario navega a la pagina del formulario
    # #     When visualiza los textos del formulario
    # #     Then todos los textos del formulario deben tener la ortografía correcta