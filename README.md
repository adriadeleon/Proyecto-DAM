# Proyecto-DAM
___
- Introducción.
___

Nuestro proyecto se basa de un software dedicado para el parking de un vehículo en zona de O.R.A, en nuestro caso, la aplicación la hemos desarrollado en la ciudad de Palma de Mallorca, con lo cual la zona de estacionamiento del centro ha de ser de pago y por ello hemos creado la aplicación.

A continuación vamos a exponer los problemas y la propuesta que presentamos frente a nuestro proyecto:
**Problema**

Podemos ver que en el mercado los diferentes software que hemos encontrado son demasiado anticuados para lo que tiene que ser un buen software preparado para poder filtrar información a través de tantos usuarios y que esté todo bien controlado, para ello abajo proponemos un cambio respecto a estas aplicaciones.
___
- **Propuesta**
___
Investigando sobre algunas ideas que hemos tenido, sería correcto crear un software que se dedique a escoger tickets de la O.R.A para poder aparcar en zona azúl, como puede ser el centro de una ciudad, para ello vamos a elaborar dicho software enfocado a la estancia de nuestros clientes con sus respectivos vehículos, registramos su lugar, hora de aparcado, también vamos a registrar sus vehículos y sus datos personales para saber que usuario tiene que coche.

![image](https://user-images.githubusercontent.com/98842240/168495116-65a5aa17-30ac-45d2-aa1c-da7afacfa3a1.png)


___
- Diagrama del funcionamiento de nuestro Software.
___
Para la implementación del programa hemos decidido crear el siguiente diagrama, para ver como funcionará nuestro programa y tener de forma visual el funcionamiento del mismo para poder ir trabajando en el parte por parte.

![image](https://user-images.githubusercontent.com/98842240/168483019-11758022-7045-4a52-8960-8aa013fee88f.png)

___
- Interfaz de usuario.
___
En la interfaz de usuario hemos usado imagenes para tenerlo todo mejor organizado, iremos actualizando con imagenes de las diferentes páginas que iremos implementando.

![image](https://user-images.githubusercontent.com/98842240/168483128-bed177d4-c0db-4dbd-9fda-0c39e9a1aaee.png)


(ir actualizando)

___
- Metodologias.
___
4 - Metodologías 
4.1 Conclusión

Para desarrollar el software de este proyecto se ha elegido la metodología scrum, se usará esta debido al poco tiempo que tenemos para desarrollar ya que es bastante amigable y fomenta lo que es el trabajo  en equipo en todo momento, con la finalidad de conseguir los objetivos de  una forma rápida. 



Esta imágen es una representación más gráfica de cómo funciona la metodología scrum y se ve más visualmente el porque es muy útil para trabajar en equipo, con poco tiempo y buscando la mayor calidad posible, viendo la imagen vemos que definitivamente es la metodología que más se puede adaptar al proyecto.

___
- Requisitos Funcionales.
___

## Requisitos funcionales

### Trabajadores

### Usuario 

- RF01: Añadir tarjeta.
- RF02: Eliminar tarjeta.
- RF03: Añadir coche.
- RF04: Iniciar ticket.
- RF05: Detener ticket.
- RF06: Modificar datos.
- RF07: Solicitar soporte.
- RF08: Ver configuración.


### Administrador 

- RF01: Añadir tarjeta.
- RF02: Eliminar tarjeta.
- RF03: Añadir coche.
- RF04: Iniciar ticket.
- RF05: Detener ticket.
- RF06: Modificar datos.
- RF07: Solicitar soporte.
- RF08: Ver configuración.
- RF09: Modificar usuario.


#### 2.2 Requisitos no funcionales
 RnF01: Que sea escalable
 
 RnF02: Que sea funcional
 
 RnF03: Que tenga una buena durabilidad

#### 2.3 Requisitos de sistema
 RnF01: Disponibilidad 24/7
 
 RnF02: Uso de filtros

___
- Base de Datos
___
Para empezar con la base de datos debemos tener los diagramas de entidad-relación.

Un boceto que he creado:
![image](https://user-images.githubusercontent.com/98842240/168651700-9fd8765b-7a6c-4423-a16e-d5cd21062431.png)

Para la base de datos, hemos elegido crearla con MySQL debido a que la conectividad con la misma se nos hará más amena a la hora de conectarla con los servidores externos como XAMPP o TOMCAT.

___
- Conclusión de nuestro programa.
___
Para desarrollar el software de este proyecto se ha elegido la metodología scrum, se usará esta debido al poco tiempo que tenemos para desarrollar ya que es bastante amigable y fomenta lo que es el trabajo  en equipo en todo momento, con la finalidad de conseguir los objetivos de  una forma rápida. 

![image](https://user-images.githubusercontent.com/98842240/172053260-0e0aeebe-292e-45c8-82d7-215bad5cfe67.png)

Esta imágen es una representación más gráfica de cómo funciona la metodología scrum y se ve más visualmente el porque es muy útil para trabajar en equipo, con poco tiempo y buscando la mayor calidad posible, viendo la imagen vemos que definitivamente es la metodología que más se puede adaptar al proyecto.


___
- Partes interesadas.
___

Las partes interesadas que tenemos en nuestro programa son:

- User.
- Admin.

___
- Diagrama de caso de uso.
___

En el Lenguaje de Modelado Unificado, un diagrama de casos de uso es una forma de diagrama de comportamiento UML mejorado. El Lenguaje de Modelado Unificado, define una notación gráfica para representar casos de uso llamada modelo de casos de uso.

![image](https://user-images.githubusercontent.com/98842240/172053436-c480c301-ef34-4049-b0aa-d4b66c019db7.png)


___
- Tomcat y diversos.
___

Tomcat: Sirve para poder compilar y ejecutar aplicaciones web realizadas en Java. Esto lo iniciaremos en Docker.

Nginx: Es un servidor web en el cual subiremos nuestra página web que la iniciaremos en Docker.

Docker: Es un proyecto de código abierto que automatiza el despliegue de aplicaciones dentro de contenedores de software, proporcionando una capa adicional de abstracción y automatización de virtualización de aplicaciones en múltiples sistemas operativos.​ Utilizamos esta tecnología gracias a su simplicidad y a su poco uso de recursos a la hora de crear máquinas virtualizadas.

Java: Es un lenguaje de programación muy utilizado en el campo, nos hemos decantado por esta tecnología ya que todos los participantes del grupo tenemos un buen conocimiento sobre lo que pueda requerir el proyecto en cuanto a esta tecnología.

HTML: Es un lenguaje de marcas el cual usaremos para realizar la página web con la que la complementaremos con CSS que sirve para ordenar la web de una manera que deseemos, también usaremos JavaScript se usa para añadir características interactivas a la web. Cuando usemos HTML se entiende que usaremos CSS y JS también.

MySql: Es un sistema de gestión de base de datos relacional, usaremos esta ya que se nos hace más fácil y nos gusta más.


___
- Modelo Entidad Relación.
___

El diseño del modelo entidad-relación, como hemos visto, corresponde a la segunda fase de la creación de una base de datos, que se realiza una vez hemos recopilado toda la información por parte del cliente. Los elementos básicos de un modelo entidad-relación son las entidades, las relaciones, los atributos y las cardinalidades.

![image](https://user-images.githubusercontent.com/98842240/172053965-793ceccf-eb65-4956-82d0-2bbc60a44f5a.png)


___
- Modelo Conceptual.
___

Un modelo conceptual es una representación de un sistema, hecho de la composición de conceptos que se utilizan para ayudar a las personas a conocer, comprender o simular un tema que representa el modelo, incluye las entidades importantes y las relaciones entre ellos. También es un conjunto de conceptos. Algunos modelos son objetos físicos; por ejemplo, un modelo de juguete que se puede ensamblar y se puede hacer que funcione como el objeto que representa.

El término modelo conceptual puede usarse para referirse a modelos que se forman después de un proceso de conceptualización o generalización. Los modelos conceptuales son a menudo abstracciones de cosas en el mundo real, ya sean físicas o sociales. Los estudios semánticos son relevantes para varias etapas de la formación de conceptos. La semántica se trata básicamente de conceptos, el significado que los seres pensantes dan a varios elementos de su experiencia.

![image](https://user-images.githubusercontent.com/98842240/172054005-f0db096c-d419-404c-abec-e5b5f585c598.png)


___
- Diagrama de Clases.
___

El Lenguaje Unificado de Modelado (UML, por sus siglas en inglés) puede ayudarte a modelar sistemas de diversas formas. Uno de los tipos más populares en el UML es el diagrama de clases. Popular entre los ingenieros de software para documentar arquitectura de software, los diagramas de clases son un tipo de diagrama de estructura porque describen lo que debe estar presente en el sistema que se está modelando. Sin importar tu nivel de familiaridad con diagramas UML o diagramas de clases, nuestro software UML está diseñado para ser simple y fácil de usar.

El UML se estableció como un modelo estandarizado para describir un enfoque de programación orientada a objetos (POO). Como las clases son los componentes básicos de los objetos, los diagramas de clases son los componentes básicos del UML. Los diversos componentes en un diagrama de clases pueden representar las clases que se programarán en realidad, los objetos principales o la interacción entre clases y objetos. 

![image](https://user-images.githubusercontent.com/98842240/172054043-5ef41543-4fdf-4de6-b734-fa3c4bac27a8.png)


___
- Diagerama de secuencia.
___

Los diagramas de secuencia son una solución de modelado dinámico popular en UML porque se centran específicamente en líneas de vida o en los procesos y objetos que coexisten simultáneamente, y los mensajes intercambiados entre ellos para ejecutar una función antes de que la línea de vida termine.


![image](https://user-images.githubusercontent.com/98842240/172054079-d0a03271-dd97-4dea-b6a3-9c97faadaab3.png)


___
- Modelo Relacional.
___

El modelo relacional, para el modelado y la gestión de bases de datos, es un modelo de datos basado en la lógica de predicados y en la teoría de conjuntos.

![image](https://user-images.githubusercontent.com/98842240/172054105-4bf761cd-0184-4787-b683-0cdea7c16fdb.png)


___
- Diseño de la Web.
___

Empezamos creando corquis de la página web con el creador de objetos de Drive:

![image](https://user-images.githubusercontent.com/98842240/172054251-565e4669-d454-4811-8837-e1713f658cd5.png)

![image](https://user-images.githubusercontent.com/98842240/172054261-6954141f-34c1-4229-bdf1-986625ad15c1.png)


Croquis para registrarse:

![image](https://user-images.githubusercontent.com/98842240/172054283-39b365f4-4137-45c5-bbb4-dfd51de53bbd.png)

![image](https://user-images.githubusercontent.com/98842240/172054294-fb2b8f94-ef32-438d-bbe0-c6f31476b247.png)

Croquis de la página principal:

![image](https://user-images.githubusercontent.com/98842240/172054320-be48f371-8189-4c13-aefd-6a0f64e73cd5.png)

![image](https://user-images.githubusercontent.com/98842240/172054332-64fc150b-449a-4970-b1e8-f06abca0c23d.png)

Parte de preguntas:

![image](https://user-images.githubusercontent.com/98842240/172054357-165b05a4-fa24-4e7a-a456-07f0f5ac272e.png)

___
- Diagrama de Gantt.
___

El diagrama de Gantt es una herramienta de gestión de proyectos en la que se recoge la planificación de un proyecto. Normalmente tiene dos secciones: en la parte izquierda se incluye una lista de tareas y, en la derecha, un cronograma con barras que representan el trabajo.
 
![image](https://user-images.githubusercontent.com/98842240/172054396-3630f8c4-137d-457b-9e87-b18c59ffcbdc.png)

![image](https://user-images.githubusercontent.com/98842240/172054414-fe995eb7-fa5d-444d-9031-1069c5337840.png)

___
- Herramientas o Tecnologias
___

Nosotros hemos usado git para poder subir los commits a nuestro GitHub. También usamos MarkDown para realizar una breve documentación y hemos creado un GitFlow para el FrontEnd y BackEnd con su respectivo versionado semántico.

El versionado semántico está muy brevemente explicado en el GitFlow, por ejemplo la del FrontEnd en la rama Master la versión 1.0.0 es en la que hemos realizado el Login y register de la página web, luego modificamos cosas y añadimos cosas como la página de inicio en la otra rama.

- GitFlow:
Gitflow es un modelo alternativo de creación de ramas en Git en el que se utilizan ramas de función y varias ramas principales. Esto lo que enseña es un poco generalizado ya que realizando algunas pruebas hemos tenido que crear alguna que otra versión más y alguna rama más también.

![image](https://user-images.githubusercontent.com/98842240/172054463-4fd118db-5500-43c6-b784-84ce19354ea8.png)


___
- Clockify
___

Es una aplicación la cual se usa para poder registrar los tiempos de cualquier tarea. Para poder llevar un seguimiento del tiempo usado en una misma tarea y así poder ir organizando mejor a lo largo del proyecto y poder calcular un tiempo de horas en las que has estado trabajando en el proyecto.


____
