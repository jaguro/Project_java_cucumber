# Java & cucumber project

Proyecto de QA en Java y Selenium webDriver, con Cucumber y 
Gherkin y últimos conceptos y buenas prácticas.



## Índice

1. [Introducción](#introducción)
2. [Recursos](#Recursos)
3. [Instalación](#instalación)
4. [Uso](#uso)
5. [Estructura del Proyecto](#estructura-del-proyecto)
6. [Contribución](#contribución)
7. [Herramientas](#licencia)

## Introducción

Proyecto de pruebas de software desarrollado en java, gradle y cucumber.
Este proyecto es open source y con fines didácticos, para la mejora de conceptos
y habilidades técnicas.

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





## Instalación

Lista de las versiones usadas para este proyecto

- java 17.0.10
- Gradle  3.0.17 (opción Groovy)
- Cucumber-java 7.17.0

Todas las dependencias están documentadas en el archivo del 'proyectobuild.gradle'.
Ejecutando el comando en terminal =>'gradle build' instala las dependencias faltantes o necesarias
agregandolas al directorio 'build' del proyecto.

```bash
# Instalar dependencias con Gradle
./gradlew build

```

## Conceptos varios:

- Diferencias entre 'testImplementation' e 'implementation'.

  Distintas formas de instalar librerias, la primera opcion solo será valida en el directorio 'test',
  mientras que la segunda opción solo será accesible en el directorio de 'main'.