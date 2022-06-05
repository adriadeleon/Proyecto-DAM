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

 RF01: Eliminar anuncio.
 
 RF02: Crear anuncio.
 
 RF03: Modificar Anuncio.
 
 RF04: Buscar coche.
 
 RF05: Filtrar coche.
 
 RF06: Contactar con clientes.

### Clientes

 RF01: Comprar coche.
 
 RF02: Solicitar visita.
 
 RF03: Buscar coche.
 
 RF04: Reservar coche.
 
 RF05: Filtrar coche.
 
 RF06: Contactar con el concesionario.

### Administrador

 RF01: Añadir trabajador
 
 RF02: Eliminar trabajador
 
 RF03: Eliminar anuncio
 
 RF04: Crear anuncio
 
 RF05: Modificar Anuncio
 
 RF06: Buscar coche.
 
 RF07: Filtrar coche

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





