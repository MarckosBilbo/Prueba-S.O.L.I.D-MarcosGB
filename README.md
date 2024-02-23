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

##### **[FrecuenciaCaracteres -->(https://github.com/MarckosBilbo/Tema5-Tablas-MarcosGB/blob/main/src/Ej_2/FrecuenciaCaracteres.java])**


