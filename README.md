# Ejercicio IOET
La empresa ACME ofrece a sus empleados la flexibilidad de trabajar las horas que deseen. Pero debido a algunas circunstancias externas, necesitan saber qué empleados han estado en la oficina en el mismo período de tiempo.

El objetivo del ejercicio es generar una tabla que contenga pares de empleados y la frecuencia con la que han coincidido en la oficina

***Entrada:** nombre de un empleado y el horario que trabajó, indicando el tiempo y las horas. Este debe ser un archivo .txt con al menos cinco conjuntos de datos. Puede incluir los datos de ejemplo presentes a continuación:*

## Ejemplo 1:

**ENTRADA:**

RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
ANDRES=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00

**SALIDA:**

ASTRID-RENE: 2
ASTRID-ANDRES: 3
RENE-ANDRES: 2

## Ejemplo 2:

**ENTRADA:**

RENE=MO10:15-12:00,TU10:00-12:00,TH13:00-13:15,SA14:00-18:00,SU20:00-21:00
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00

**SALIDA:**

RENE-ASTRID: 3

>## Requisitos
>* Contar con la instalación de java JDK versión 17.0.1
>* El IDE de Apache NetBeans Versión 13

>## Instalación de la solución
>* Con el [link de repositorio](https://github.com/diego40g/ioet-exercise-ACME) lo clonamos dentro de un directorio local. <br> <p align="center">
![Copiar Repositorio](https://i.ibb.co/t2q8rGB/git-Download.jpg)
>* Creamos una carpeta para almacenar los archivos del repositorio y lo clonamos con el comando *git clone*. Luego lo podemos copiar dentro de nuestro directorio favorito.<br> <p align="center">
![Directorio Archivo](https://i.ibb.co/JzFZFww/gitClone.jpg)
![Mover Directorio](https://i.ibb.co/0KmSGhx/mover-Carpeta.jpg)
>* Abrimos Apache NetBeans 13. <br> <p align="center">
![Abrir Netbeans](https://i.ibb.co/t2FwM48/abrir-Netbeans.jpg)
>* Abrimos nuestro proyecto *File->Open Project* y luego seleccionamos el proyecto de Java Ant con nombre *solucionACME*. <br><p align="center">
![Abrir projecto](https://i.ibb.co/vXf0KB9/open-Project.jpg)
![Abrir solucion](https://i.ibb.co/WsWLwRg/open-Project2.jpg)
>* Esperamos a que termine de cargar el proyecto viéndose como la siguiente imagen. <br><p align="center">
![imagenEstructuraProyecto](https://i.ibb.co/qFJRhv5/view-Open-Project.jpg)
>* Damos clic en *Build Clean* para montar el proyecto y si hay dependencias por las pruebas unitarias agregarlas. Esperamos unos minutos hasta obtener la salida satisfactoria. <br><p align="center">
![imagenBtnBuild](https://i.ibb.co/b5vnMYx/build-Clean-Project.jpg)
![imgSuccessBuild](https://i.ibb.co/YBKsgPr/successful-Build.jpg)
## Ejecución de la Solución
>* Ejecutados el proyecto con el botón *Run* hasta que se despliegue la ventana de bienvenida para abrir archivo .txt. <br> <p align="center">
![imgRun](https://i.ibb.co/vcktp4Q/run-Project.jpg)
![imgBienvenida](https://i.ibb.co/s9NLGJr/insert-Data.jpg)
>* Buscamos dentro de los directorios el archivo que deseamos usar *con formato txt*.<br> <p align="center">
![imgArchivo](https://i.ibb.co/tB08VHJ/subir-Archivo.jpg)
>* Si el archivo tiene menos de 5 usuarios se pide el ingreso de la cantidad de usuarios mínima este sea seleccionando un nuevo archivo o agregando nuevos usuarios. <br> <p align="center">
![imgValidacion](https://i.ibb.co/xFW2vSj/user-Validation.jpg)
![ingresoUsuario](https://i.ibb.co/3TszPp6/add-New-User.jpg)
>* Al cumplir con la condición y las validaciones de la cadena se logra visualizar la salida esperada de coincidencias en pares de empleados
![tablaREsultado](https://i.ibb.co/xDQzFMX/results.jpg)
>* Cerramos el programa
![cerrarAplicacion](https://i.ibb.co/HqS2LXJ/ex.jpg)

## Descripción de la Solución
La solución partió con una la implementación de una ***Programación Estructurada*** realizo funciones dentro del archivo principal. Luego se comenzó a seccionar en programación orientada a objetos dentro creamos los modelos dentro del paquete principal teniendo ***Users y Workday***, se desarrolló casi todas las funcionalidades y validaciones con ayuda de los testUnitarios que se implementaron. Para implementar el diseño de la arquitectura de software al tener todo con interfaz CLI (Línea de Comando) se buscaba una forma intuitiva para el usuario por eso se eligió el patrón de diseño ***Modelo Vista Controlador (MVC)*** se dividió el proyecto en los paquetes correspondientes y las clases que se tenían se las paso al modelo, con eso se realizó una interfaz gráfica ***UserW*** y el controlador ***UserC*** que se encargaría de hacer el intermediario entre el modelo y la vista.
Para concluir se agregó un ***scroll bar*** por si se cuente con una gran cantidad de datos dentro del resultado y se validó el ingreso mínimo de los datos
## Arquitectura de software utilizada
***Modelo Vista Controlador (MVC):***
Al ser un patrón de diseño de software donde se implementa interfaces de usuario, datos y una lógica de control permite mostrar un gran abanico de habilidades y al tener una previa experiencia dentro y fuera de la universidad fue una de las opciones por la cual me inclinaba más a solucionar el ejercicio teniendo un respaldo por si me estancaba en la solución. De la misma forma permite mostrar las habilidades en casi todo los ámbitos de un programador con habilidades fullStack, al tener que diseñar una interfaz de usuario, modelar los datos y programar un intermediario que lleve de la mano la vista y modelo. A continuación, adjuntamos imagen con lo que se encarga cada parte del patrón arquitectónico MVC
![imgMVC](https://media.prod.mdn.mozit.cloud/attachments/2018/06/08/16042/090bb2d2be010d2d547684a2d9ee41aa/model-view-controller-light-blue.png)
## Explicación del enfoque
El enfoque que se dio es el más parecido a lo que se podría realizar dentro del desarrollo web donde se divide la vista HTML, los modelos data access object (DAO) o las conexiones a bases de datos con el lenguaje de programación que se domina y el controlador que permite enlazar la vista y el modelo, con la diferencia de que es una aplicación local y que no cuenta con un gestor para almacenar datos centralizados.

## Metodología usada
Para este ejercicio utilice programación extrema ***XP*** al tener un periodo corto para el desarrollo y donde la fase de requisitos fue enviada:
* Se planifico primero terminar la funcionalidad del programa para luego aplicar un patrón de arquitectura
* Se tomo como diseño las entradas y salidas proporcionadas en el correo.
* Se codifico hasta lograr algo similar a lo que se tenía en formato texto
* Se aplicaron las pruebas unitarias con la librería JUnit dentro de las clases
* Al pasarlas se tuvo que volver a planificar como pasar lo que se tiene en CLI a un patrón de arquitectura en este caso MVC
* Se diseño la interfaz gráfica para insertar el archivo txt, nuevos usuarios y otro archivo por si se lo quería sustituir 
* Se segmento en paquetes y las funciones respectivas el controlador se encargaría de ser el vínculo entre la vista y el modelo
* Se realizo las pruebas agregando nuevos archivos .txt y ultimas validaciones pasando al lanzamiento final del software.