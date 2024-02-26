# Prueva-S.O.L.I.D-MarcosGB

Repositorio --> https://github.com/MarckosBilbo/Prueva-S.O.L.I.D-MarcosGB


  ## **1. *Creación de una Clase Matriz en Java***
  
### Desarrollo que he hecho en base a lo solicitado en el punto (primero) del proyecto:

##### **[MatricesJava -->(])**

Separamos el programa en tres partes(clases-interfaces) principales que juntas permiten dar forma al ejercicio 1:

Tenemos la clase Matriz que se encarga de representar, como no, una matriz de enteros 2x2 bidimensional y permite crearla gracias a un contructor que recibe un atributo matriz que incluirá los valores-datos que le pidamos al usuario para cada posición. Además, implementa los métodos definidos en la interfaz MatrizInterface, los cuales son "imprimir" y "transpuesta", así como otros propios, siendo este el caso de recogerValores() que recoge-mete en cada posicion de la matriz los "nuevos" valores que eliga el usuario y validarValores que en caso de que le permitiesemos al usuario elegir la posicion en la que va cada valor se encargaría de verificar que la posición que elija sea valida(dentro de los límitas).

Importante también la interfaz MatrizInterface define los métodos esenciales-básicos que que queremos que implemente la clase encargada de representar la matriz. Esta incluye los métodos imprimir y transpuesta previamente mencionados, que se encargan de imprimir la matriz en la consola y calcular su transpuesta (huecos al revés en base a la diagonal principal), respectivamente.

Finalmente está la clase Main que es el "puente" del programa, en esta clase creamos una instancia con los datos metidos (le hemos ido notificando por pantalla para que posicion tiene que meter cada dato) y la usamos para realizar la impresión de la matriz en base a ese mismos datos tal cual están. Después en base a esa mismita instancia calculamos e imprimimos también su transpuesta, dando por finalizado el ejercicio 1 de esta entrega.

Para que nos entendamos, el programa crea una matriz con los valores metidos por el usuario para cada posición (*Ojo* nosotros asignamos en base al orden de ingreso en que posición va cada valor metido) y acto seguido la imprime, como segundo paso calcula su transpuesta y también la imprime. Lo que es más importante, todo ello ha sido diseñado tratando de cumplir los principios SOLID que vimos el otro día en clase (sobretodo el primero "limitando todo lo que podemos cada metodo a desempeñar una y SOLO UNA funcion") 


  ## **2. *Sistema de Gestión de Pedidos de Pizza en Línea***

### Desarrollo que he hecho en base a lo solicitado en el punto (segundo) del proyecto:

##### **[Pizzeria -->(])**

Nuestro programita es básicamente un sistema de gestión de pedidos para un restaurante donde el usuario puede realizar varias acciones, como registrar un nuevo usuario, iniciar sesión, hacer un nuevo pedido, ver pedidos existentes y borrar pedidos existentes.

Arrancamos con un menú principal donde el usuario puede seleccionar entre estas opciones. Cuando registra un nuevo usuario, se solicita información como nombre, dirección y número de teléfono, y se crea un cliente asociado. Al iniciar sesión, se verifica la autenticidad del usuario con un autenticador.

Para poder hacer un pedido, se muestra un menú de pizzas disponibles y se permite al usuario seleccionar las pizzas deseadas. Después de seleccionar las pizzas, se calcula el precio total del pedido y se crea en el sistema. El usuario también puede ver los pedidos existentes y borrarlos si lo desea.

El código está compuesto por clases como Main, Cliente_Implementado, Pedido_Implementado, OrderManager_Implementado, DataBaseManager_Implementado, entre otras, cada una con responsabilidades específicas para gestionar usuarios, pedidos, autenticación, gestión de la base de datos y procesamiento de pagos. El sistema utiliza una estructura de bucles y condicionales para manejar las diferentes opciones del usuario y proporciona mensajes informativos para guiar al usuario a través del proceso.

A resumidas cuentas es un sistema de usuarios al que se las acredita todos los pedidos que han ido haciendo (también en el programa) puiendo mostrar y borrar todos los pedidos del usuario que tenga su sesión iniciada en ese momento. Se puede además cerrar sesión y "apagar" el programa con la opción de salir.
