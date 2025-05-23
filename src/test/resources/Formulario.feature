@Formulario
Feature: Probar la funcionalidad del formulario web.

    Scenario: Como un usuario, cuando ingreso todos los datos correctos en el formulario, quiero ver si no salta ninguna alerta
        Given el usuario navega a la pagina del formulario
        When ingresa datos válidos en todos los campos
        Then no debería aparecer ninguna alerta

    Scenario: Como un usuario, cuando no ingreso ningun dato en cada campo del formulario, quiero que salten las alertas
        Given el usuario navega a la pagina del formulario
        When no ingresa datos en los campos
        Then debería aparecer una alerta en los campos principales

    Scenario: Como un usuario, cuando ingreso un nombre de 3 letras, quiero ver si salte una alerta 
        Given el usuario navega a la pagina del formulario
        When ingresa el nombre con 3 letras
        Then debería aparecer una alerta en el campo de nombre

    Scenario Outline: Como usuario, quiero ver una alerta cuando ingreso un email no válido 
        Given el usuario navega a la pagina del formulario
        When ingresa el email <Correo>
        Then debería aparecer una alerta en el campo de email
        
    Examples:
        | Correo                        | 
        | toretoCarrera@gmail           | 
        | toretoCarreragmail.com        | 
        | toreto!#$&&Carrera@gmail.com  | 
        | toreto Carrera @gmail .com    | 

    Scenario: Como un usuario, cuando estoy en el formulario, quiero ver si la ortografia es correcta
        Given el usuario navega a la pagina del formulario
        Then todos los textos del formulario deberian tener la ortografía correcta