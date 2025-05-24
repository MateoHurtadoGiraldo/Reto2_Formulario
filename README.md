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

### Extensiones de VS code
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

### Opciones a la hora de correr tags
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
Aquí comparto algunos de mis ejecuciones:

- https://reports.cucumber.io/reports/7662b34b-fcff-4457-8937-459baa6e16d3

- https://reports.cucumber.io/reports/c8572ef8-68b6-4f79-922c-f15090c9a932

- https://reports.cucumber.io/reports/b462b028-7c12-43cb-bd38-521c32155f04

- https://reports.cucumber.io/reports/fe29cb4b-c934-4853-8bf0-14e3357b3e59
