# Desafío 1: Replica Escenario De Prueba Con Selenium Y Cucumber

## Sobre este Proyecto:
En este proyecto se automatizo el formulario suministrado por Softesting, en el cual se realizan una serie de pruebas para encontrar el mayor número de errores. 

Este proyecto está hecho con Selenium Webdriver Y Cucumber, se siguen las buenas prácticas aprendidas en los tutoriales del curso. 

### ¿Qué es Selenium WebDriver?
[Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/) es una colección de APIs que se utilizan para automatizar la interacción con navegadores web. Proporciona una forma de controlar el navegador desde el código, permitiendo simular las acciones de un usuario real, como hacer clic en botones, ingresar texto, navegar entre páginas y más. Es una herramienta fundamental para las pruebas automatizadas de aplicaciones web, asegurando su correcto funcionamiento y la validación de funcionalidades a través de diferentes navegadores.

### ¿Qué es Cucumber?
[Cucumber](https://cucumber.io/docs) es una herramienta de Behavior-Driven Development (BDD) que permite escribir pruebas en un lenguaje sencillo y legible por personas no técnicas, llamado Gherkin. Las pruebas se describen en términos de "características" y "escenarios", utilizando un formato estructurado de "Dado" (Given), "Cuando" (When) y "Entonces" (Then). Cucumber facilita la colaboración entre desarrolladores, testers y stakeholders, ya que las pruebas se convierten en una especificación viva del comportamiento esperado de la aplicación. Luego, estas descripciones se vinculan a código de automatización para su ejecución.

### ¿Qué es Gradle?
[Gradle](https://gradle.org/) es una potente herramienta de automatización de construcciones que gestiona las dependencias del proyecto y facilita la compilación, ejecución y empaquetamiento de la aplicación.

### ¿Qué es una dependencia?
Una dependencia o librería es un programa desarrollado por terceros, que nuestro proyecto utiliza para llevar a cabo ciertas funcionalidades. En lugar de escribir todo el código necesario desde cero, incorporamos estas herramientas externas para simplificar el desarrollo y aprovechar soluciones ya probadas y optimizadas. Muchas de estas dependencias las descargamos desde [MVN Repository](https://mvnrepository.com/).

## Configuración del Proyecto

### Requisitos Previos
Para ejecutar este proyecto se debe tener unas instalaciones previas que son:
- Java Development Kit (JDK) 17
- Gradle

### Instalación de Java Development Kit (JDK) 17
Para instalar el JDK buscamos en el navegador JDK Download, entramos en [Oracle](https://www.oracle.com/co/java/technologies/downloads/),  buscamos un JDK que sea Long-Term Support (LTS), ya que estos tienen un soporte más amplio y son más estables. puede ser el JDK 17 o JDK 21. En este caso utilizamos el JDK 17 que tiene un soporte hasta el año 2029. Luego descarga el instalador del JDK adecuado para tu versión de Windows (32 o 64 bits). Por último, solo debes ejecutarlo y seguir las indicaciones.

Para saber si tenemos instalado Java solo utilizamos el comando java --version en el CMD de nuestro computador.

### Instalación de Gradle
Para instalar Gradle buscamos en el navegador Gradle Download, esto nos lleva a la página de [Gradle](https://gradle.org/install/) y descargamos el instalador. Al descargarlo lo ejecutamos y seguimos las indicaciones.

Para saber si tenemos instalado Gradle solo utilizamos el comando gradle --version en el CMD de nuestro computador. 

### Extensiones de VS Code
Para este proyecto se utilizaron algunas extensiones de VS Code que ayudan a . Las extensiones que vamos a descargar son:
- Extension Pack for Java
- Gradle for Java
- Gradle Language Support
- Cucumber
- Snippets and Syntax Highlight for Gherkin (Cucumber)

### Instalación de Dependencias
Para este proyecto Java con Gradle implementamos algunas dependencias en el archivo buil.gradle que se bajaron de [MVN Repository](https://mvnrepository.com/).
- **Selenium Java**: Se utiliza la versión 4.21.0.
- **TestNG**: Se utiliza la versión 7.11.0.
- **Cucumber JVM: Java**: Se utiliza la versión 7.22.0. Esta versión de be ser la misma que la del Cucumber JVM: JUnit 4.
- **Cucumber JVM: JUnit 4**: Se utiliza la version 7.22.0. Esta versión de be ser la misma que la del Cucumber JVM:Java.
- **WebDriverManager** (Debe ser la de bonigarcia): Se utiliza la versión 5.7.0.


## Estructura del Proyecto

```
RETO_FORMULARIO/
├── src/                          # Código fuente del proyecto.
│   └── test/                     # Código de pruebas automatizadas.
│       └── java/                 
│           ├── pages/                      # Clases que representan las páginas (Page Object Model).
│           │   ├── BasePage.java           # Clase base con métodos reutilizables para las páginas.
│           │   └── FormularioPage.java     # Interacciones y localizadores del formulario a probar.
│           │
│           ├── runner/                     # Clase para ejecutar los tests con Cucumber y JUnit.
│           │   └── RunnerJava.java         # Clase runner principal de Cucumber.
│           │    
│           └── steps/                      # Definición de los pasos de Cucumber.
│               ├── FormularioSteps.java    # Pasos definidos para los escenarios del formulario.
│               └── Hooks.java              # Hooks de configuración y limpieza antes/después de los tests.
│                                               
│       └── resources/                      # Recursos como archivos .feature y propiedades de Cucumber.
│           ├── Formulario.feature          # Escenario BDD para probar el formulario.
│           └── cucumber.properties         # Configuración de ejecución de Cucumber.
│
├── gradle/                       # Scripts de soporte de Gradle Wrapper.
├── .gitattributes                # Configuración de atributos de Git para manejar formatos y codificaciones.
├── .gitignore                    # Archivos y carpetas que Git debe ignorar.
├── build.gradle                  # Script de construcción con dependencias y configuración del proyecto.
├── gradlew                       # Script de Gradle Wrapper para sistemas Unix.
├── gradlew.bat                   # Script de Gradle Wrapper para Windows.
├── README.md                     # Documentación principal del proyecto.
└── settings.gradle               # Archivo que define la configuración de los módulos del proyecto.                 
```

## Ejecución de Pruebas
Para ejecutar la prueba se utiliza el siguiente comando: 
- gradle test

Este comando nos ayuda a ejecutar la prueba desde la cualquier terminal que tengamos disponibles en nuestro equipo (bash, CMD, PowerShell. etc) siempre y cuando estemos en el directorio raiz del proyecto. Tambien podemos ejecutar las pruebas por medio de su tag, al hacerlo solo se va a ejecutar la prueba que nosostros indiquemos por comando.

### Opciones a la Hora de Correr los Tags
En este programa hay un total de 6 test y cada uno tiene un tag. Para ejecutar la prueba ponemos el tagque le pertenece a la prueba, por ejemplo:

- **gradle test -Dcucumber.filter.tags="@FormularioCorrecto"** -> Con este comando ejecutamos la prueba que ingresa los datos correctos al formulario y valida que no haya alertas 

- **gradle test -Dcucumber.filter.tags="@FormularioSinDatos"** -> Con este comando ejecutamos la prueba que no ingresa datos al formulario y valida que no haya alertas

- **gradle test -Dcucumber.filter.tags="@FormularioNombre"** -> Con este comando ejecutamos la prueba que ingresa una serie de nombres y valida si son permitidos

- **gradle test -Dcucumber.filter.tags="@FormularioEmail"** -> Con este comando ejecutamos la prueba que ingresa una serie de emails y valida si son permitidos

- **gradle test -Dcucumber.filter.tags="@FormularioOrtografia"** -> Con este comando ejecutamos la prueba para validar si la ortografia del formulario es correcta

- **gradle test -Dcucumber.filter.tags="@EnviarConDatos"** -> Con este comando ejecutamos la prueba que ingresa los datos correctos al formulario y envia el formulario clicando el boton enviar

- **gradle test -Dcucumber.filter.tags="@EnviarSinDatos"** -> Con este comando ejecutamos la prueba que sin datos y envia el formulario clicando el boton enviar

- **gradle test -Dcucumber.filter.tags="@EnviarFormulario"** -> Con este comando ejecutamos las pruebas que clican el boton enviar


## Reportes 
Los reportes de las pruebas hechas en este proyecto los podemos ver en la página de [Cucumber Reports](https://reports.cucumber.io) que es: https://reports.cucumber.io.
En este lugar si quieres subir tus reportes debes iniciar sesión con una cuenta de GitHub, luego se crea una carpeta que nos va a dar un Token como: 
- CUCUMBER_PUBLISH_TOKEN=some-secret-token

El Token (**some-secret-token**) es único de cada persona, por esta razón no se debe compartir. 
Luego de tener este token vamos a ir a la terminal de Bash para ingresar el comando de esta forma: 
- export CUCUMBER_PUBLISH_TOKEN=some-secret-token (**se debe reemplazar el some-secret-token por el token que les dio Cucumber**)

Al ejecutar las pruebas con el comando "**gradle test**" se subirá automáticamente el reporte a nuestro repositorio. 
Aquí comparto algunas de mis ejecuciones:

- https://reports.cucumber.io/reports/52ee5086-53e0-477d-a9a3-3af3f4de374a -> Reporte de todas las pruebas.

- https://reports.cucumber.io/reports/c8572ef8-68b6-4f79-922c-f15090c9a932 -> Reporte de prueba que valida que no se pueda envió el formulario vacio.

- https://reports.cucumber.io/reports/b462b028-7c12-43cb-bd38-521c32155f04 -> Reporte de prueba que valida emails con errores.

- https://reports.cucumber.io/reports/fe29cb4b-c934-4853-8bf0-14e3357b3e59 -> Reporte de prueba que valida nombres con errores.

## ¿Qué Hace Que Esta Automatización Sea una Solución Óptima?
Esta automatización garantiza una alta cobertura del formulario al validar múltiples escenarios críticos como campos vacíos, datos inválidos, errores ortográficos y el envío exitoso. Además, implementa buenas prácticas como el uso de localizadores robustos y reutilizables, lo cual mejora la estabilidad y mantenibilidad del código. Esto permite detectar tanto errores críticos como problemas menores que podrían afectar la experiencia del usuario.

## Documentación de los Casos de Prueba
Se realizaron un total de 7 casos de prueba en el lenguaje Gherkin. Estos escenarios validan la funcionalidad crítica del formulario web, alineándose con buenas prácticas de automatización y asegurando una cobertura sólida.

### Formulario completado Correctamente
- **Objetivo**: Verificar que al ingresar todos los datos válidos, el formulario no genere ninguna alerta.
- **Precondiciones**: El navegador debe estar abierto en la página del formulario, los campos del formulario deben estar visibles y habilitados.
- **Alcance**: Verificar que el formulario no genere alertas si todos los datos son válidos.
- **Estrategia**: Ingresar un conjunto completo de datos válidos en todos los campos del formulario, usar localizadores estables y un flujo continuo de llenado y verificación.

```gherkin
@FormularioCorrecto
    Scenario: Como un usuario, cuando ingreso todos los datos correctos en el formulario, quiero ver si no salta ninguna alerta
        Given el usuario navega a la pagina del formulario
        When ingresa datos válidos en todos los campos
        Then no debería aparecer ninguna alerta
```

### Formulario Sin Datos
- **Objetivo**: Asegurar que el formulario muestre alertas cuando se envía sin ingresar información.
- **Precondiciones**: El formulario debe estar vacío al cargar la página.
- **Alcance**: Verificar el comportamiento de validación por omisión de datos requeridos.
- **Estrategia**: Simular que el usuario deja los campos vacíos y al clicar cada campo este debe mostrar las alertas.

```gherkin
@FormularioSinDatos
    Scenario: Como un usuario, cuando no ingreso ningun dato en cada campo del formulario, quiero que salten las alertas
        Given el usuario navega a la pagina del formulario
        When no ingresa datos en los campos
        Then debería aparecer una alerta en los campos principales
```

### Validación de Nombre Inválido
- **Objetivo**: Verificar que el sistema detecte nombres no válidos y muestre una alerta.
- **Precondiciones**: El formulario debe estar en su estado inicial (sin datos).
- **Alcance**: Validar que se emita una alerta cuando se ingresan valores no válidos en el campo "nombre".
- **Estrategia**: Usar un Scenario Outline para probar múltiples valores no válidos y verificar que cada valor genere una alerta específica para el campo.

```gherkin
@FormularioNombre
    Scenario Outline: Como un usuario, cuando ingreso un nombre incorrecto, quiero ver si salte una alerta 
        Given el usuario navega a la pagina del formulario
        When ingresa el nombre <Nombre>
        Then debería aparecer una alerta en el campo de nombre

    Examples:
        | Nombre | 
        | QWE    | 
        | @re$   | 
        | 2070   |
```

### Validación de Email no Válido
- **Objetivo**: Comprobar que se generen alertas al ingresar correos con formato incorrecto.
- **Precondiciones**: El campo de email debe estar vacío y listo para recibir entrada.
- **Alcance**: Verificar la validación de formato de correo electrónico.
- **Estrategia**: Probar diferentes correos mal formateados usando Examples y confirmar que se active la validación del formulario en cada caso

```gherkin
@FormularioEmail
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
```

### Ortografía en los Titulos del Formulario
- **Objetivo**: Validar que todos los titulos visibles en el formulario tengan ortografía correcta, reforzando la calidad de la interfaz.
- **Precondiciones**: El formulario debe estar completamente cargado con todos los titulos visibles.
- **Alcance**: Asegurar que todos los titulos visibles tengan una ortografía correcta.
- **Estrategia**: Validar el contenido textual de los titulos.

```gherkin
@FormularioOrtografia
    Scenario: Como un usuario, cuando estoy en el formulario, quiero ver si la ortografia es correcta
        Given el usuario navega a la pagina del formulario
        Then todos los textos del formulario deberian tener la ortografía correcta
```

### Validación de Envio Correcta del Formulario
- **Objetivo**: Verificar que al ingresar todos los datos válidos, se pueda enviar el formulario de forma correcta.
- **Precondiciones**: Los campos del formulario deben estar visibles y habilitados para poder recibir texto.
- **Alcance**: Verificar que el formulario se envia de forma correcta.
- **Estrategia**: Ingresar un conjunto completo de datos válidos en todos los campos del formulario.

```gherkin
@EnviarFormulario @EnviarConDatos
    Scenario: Como un usuario, cuando ingreso todos los datos correctos en el formulario, quiero poder enviar el formulario
        Given el usuario navega a la pagina del formulario
        When ingresa datos válidos en todos los campos
        Then el formulario se debe enviar de forma correcta
```

### Validación de no Envio del Formulario
- **Objetivo**: Validar que al no ingresar datos al formulario, el sistema muestre una alerta.
- **Precondiciones**: El formulario debe estar vacío al clicar el boton enviar.
- **Alcance**: Verificar que el formulario no se envia de forma correcta.
- **Estrategia**: Simular que el usuario deja los campos vacíos y clicar en el botón de envío y verificar que se muestren las alertas esperadas

```gherkin
@EnviarFormulario @EnviarSinDatos
    Scenario: Como un usuario, cuando no ingreso datos en el formulario, quiero que al clicar el boton enviar se pueda ver un error
        Given el usuario navega a la pagina del formulario
        When no ingresa datos en los campos
        Then el formulario debe mostrar una alerta
```
