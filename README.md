# Proyecto de QA en Java con Selenium WebDriver, Cucumber y Gherkin

Este proyecto está diseñado para demostrar cómo implementar pruebas 
automatizadas de calidad (QA) utilizando Java como 
lenguaje de programación principal. Se utiliza Selenium 
WebDriver para la interacción con los elementos web y se 
integra con Cucumber y Gherkin para la automatización de 
pruebas basada en comportamientos (BDD).


## Índice

1. [Introducción](#introducción)
2. [Recursos](#Recursos)
3. [Instalación](#instalación)
4. [Usos prácticos](#Usos prácticos)
5. [Estructura del Proyecto](#estructura-del-proyecto)
6. [Contribución](#contribución)
7. [Herramientas](#licencia)

## Introducción

Bienvenido al Proyecto de Pruebas de Software desarrollado con Java, 
Gradle y Cucumber. Este proyecto es una iniciativa open 
source diseñada con fines didácticos, con el objetivo 
principal de fortalecer y mejorar tus conocimientos en 
pruebas de software y habilidades técnicas en automatización.

### Objetivos del proyecto

- Proporcionar una plataforma educativa para aprender y practicar pruebas de 
software utilizando tecnologías modernas y herramientas populares.
- Fomentar las buenas prácticas de desarrollo de software, la organización del código y la implementación de pruebas automatizadas eficientes.
- Ofrecer un ejemplo práctico y realista de cómo crear y mantener un proyecto de automatización de pruebas desde cero hasta su implementación.

## Recursos

### ¿Qué es Cucumber y Gherkin?

Cucumber es una herramienta es utilizada para implementar metodologías como BDD 
(Behaviour Driven Development). Con ella se puede ejecutar descripciones funcionales 
que han sido escritas en texto plano como pruebas de software automatizadas. En resumen, 
se describen los procesos de nuestro producto en lenguaje entendible para usuarios menos 
técnicos como el «Product Owner», el cliente (negocio) o para la incorporación 
de nuevo personal. Y con este modelo de colaboración se ejecutarán de forma 
automatizada cada una de esos casos de pruebas descritos, 
tras un proceso de generación de casos.

Gherkin es un lenguaje que se utiliza tanto para realizar la documentación del desarrollo, 
como para desarrollar las pruebas automatizadas 
(¡ojo! Cucumber y Gherkin NO automatizan nada, para eso existe 
selenium). Uno de sus objetivos principales es proporcionar una 
fuente única sobre el desarrollo del software. Gracias a Gherkin 
conoceremos el comportamiento esperado de nuestro proyecto con 
un lenguaje formado.

Las descripciones se almacenan en un archivo con extensión «.feature». 
Este archivo está compuesto por un conjunto de escenarios
(casos a probar) y por un background (pasos previos, si fueran 
necesarios).
Gracias a Gherkin tenemos un lenguaje fácil de gestionar y 
aprender para preparar nuestros planes de pruebas, junto con la ventaja 
de tener documentado desde el principio todos los procesos de 
nuestro producto.

Caso práctico:

    Feature: Búsqueda en Google.
             Como usuario en google, quiero poder realizar una búsqueda para responder a mis preguntas.

    Scenario: Búsqueda simple en Google
        Given  un nevagador web
        When  se introduce la palabra de búsqueda 'BDD'
        Then  se muestra el resultado de 'BDD'


### ¿Qué es BDD?

Behavior Driven Development ,es una metodología de software ágil que busca la 
colaboración y entendimiento entre desarrolladores, gestores de 
proyecto y equipo de negocio. Es decir, es el camino previo 
antes de la fase de testing de un proyecto.

De hecho, tiene relación directa con el testing, pues el BDD surge 
directamente del TDD o desarrollo guiado por pruebas. 
Pero a diferencia del TDD, el BDD define las pruebas centradas 
en el usuario y el comportamiento del sistema y no en las 
funcionalidades de este. En otras palabras, el BDD describe 
las pruebas en un lenguaje natural que entienden todos los 
equipos de un proyecto, y no únicamente los programadores.

El desarrollo guiado por comportamiento es perfecto para 
comunicarse con todos los equipos durante el desarrollo de 
productos multifuncionales. Un equipo de desarrolladores y 
analistas QA trabaja en el código mediante un lenguaje de 
programación específico que en muchas ocasiones el cliente o 
cualquier otro equipo del proyecto no es capaz de leer.

El BDD permite a todos los implicados entender el proceso 
desarrollado y el contenido del código fuente. De hecho, 
este desarrollo le indica al código qué tiene que hacer y lo 
hace en un lenguaje natural entendido por todo el mundo.


### ¿Diferencia entre Maven y Gradle?

Maven y Gradle son dos herramientas populares de gestión de proyectos 
y construcción de aplicaciones en el ecosistema de 
desarrollo de Java. Ambas herramientas tienen como 
objetivo simplificar y automatizar el proceso de 
construcción, prueba y despliegue de aplicaciones Java, 
pero tienen diferencias en términos de características, 
flexibilidad y enfoque.

#### Maven
Maven es una herramienta de gestión de proyectos y automatización 
de construcción que se basa en convenciones y configuraciones 
predefinidas. Utiliza un archivo de configuración llamado pom.xml 
(Project Object Model) para definir las dependencias del proyecto, 
las fases del ciclo de vida del proyecto y los plugins necesarios.

Características de Maven.
- **Convención sobre Configuración**. Utiliza convenciones predefinidas para la estructura del proyecto y la configuración de las tareas de construcción.
- **Centralización de Dependencias**. Centraliza la gestión de dependencias utilizando un repositorio central llamado Maven Central.
- **Ciclo de Vida del Proyecto**. Define un ciclo de vida del proyecto con fases como compile, test, package, install, deploy, entre otras.
- **Plugins**. Extensible a través de plugins para realizar tareas adicionales como compilación, prueba, empaquetado, entre otros.

#### Gradle
Gradle es una herramienta de construcción de proyectos que ofrece flexibilidad y un alto grado de personalización. Utiliza un DSL (Domain Specific Language) 
basado en Groovy o Kotlin para definir la estructura del 
proyecto y las tareas de construcción.

Características de Gradle.
- Flexibilidad. Ofrece una gran flexibilidad y permite definir una estructura de proyecto y tareas de construcción personalizadas.
- Eficiencia. Utiliza un sistema de dependencias basado en grafo que optimiza la resolución de dependencias y la construcción incremental.
- Integración con Groovy y Kotlin. Permite utilizar Groovy o Kotlin para escribir scripts de construcción, lo que proporciona una mayor expresividad y capacidad de personalización.
- Reutilización de Código. Permite la reutilización de scripts de construcción y la compartición de lógica de construcción entre proyectos.

### Diferencias entre testImplementation y implementation
En el proceso de gestión de dependencias con Gradle, es posible que te encuentres con diferentes configuraciones para incluir bibliotecas en tu proyecto. Dos de las configuraciones más 
comunes son testImplementation y implementation. Aunque ambas se utilizan para 
agregar dependencias, tienen diferencias fundamentales en cuanto a su 
alcance y uso en el proyecto. Para hacernos una idea más comparativa podríamos 
realizar una similitud con las **dependencies** y las **devDependencies** en 
proyectos JavaScript y Node.

#### TestImplementation
La configuración testImplementation se utiliza para agregar dependencias que son necesarias 
exclusivamente para las pruebas unitarias y de integración de tu proyecto. 
Estas dependencias no se incluirán en el código fuente principal del proyecto, 
es decir, no estarán disponibles para el código de producción en el directorio src/main.

Características principales.
- Alcance Limitado. Las dependencias agregadas con testImplementation solo están disponibles en el directorio src/test.
- Uso en Pruebas. Estas dependencias se utilizan específicamente para las pruebas y no afectan al código principal del proyecto.

#### Implementation
Por otro lado, la configuración implementation se utiliza para agregar dependencias que son necesarias tanto 
para el código fuente principal como para las pruebas. 
Estas dependencias estarán disponibles para todo el 
proyecto, incluyendo el código de producción en el 
directorio src/main y las pruebas en el directorio src/test.

Características principales.
- Alcance Amplio. Las dependencias agregadas con implementation están disponibles para todo el proyecto, incluyendo el código principal y las pruebas.
- Uso General. Estas dependencias se utilizan tanto en el código de producción como en las pruebas, proporcionando funcionalidades y recursos necesarios para la ejecución y funcionamiento del proyecto en su totalidad.

## Instalación

Lista de las versiones usadas para este proyecto

- java 17.0.10
- Gradle  7.6.4 (opción Groovy)
- Cucumber-java 7.15.0
- TestNG 7.9.0
- WebDriverManager 5.7.0

Todas las dependencias están documentadas en el archivo del 'build.gradle'.
Ejecutando el comando en terminal =>'gradle build' instala las dependencias faltantes o necesarias
agregandolas al directorio 'build' del proyecto.

```bash
# Instalar dependencias con Gradle
./gradle clean
./gradlew build

# Ejecutar test con Gradle
./gradle test
```
