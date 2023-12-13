# Sistema de Gestión de Inventario en Java

Este proyecto implementa un simple sistema de gestión de inventario en Java. Permite a los usuarios agregar, eliminar y visualizar artículos en un catálogo. Cada artículo tiene un nombre, un costo, una talla y un código único.

## Estructura del Proyecto

El proyecto consta de las siguientes clases:

### 1. `Articulo`

La clase `Articulo` representa un artículo con atributos como nombre, costo, talla y un código único generado automáticamente mediante UUID.

#### Métodos Principales:

- `Articulo(String nombrearticulo, double coste, double talla)`: Constructor que crea un nuevo artículo con los parámetros dados.
- `getNombrearticulo()`: Método para obtener el nombre del artículo.
- Otros métodos getter y setter.
- `toString()`: Método para obtener una representación en cadena del artículo.

### 2. `Lista`

La clase `Lista` gestiona una lista de artículos, proporcionando métodos para agregar, eliminar, listar y guardar el catálogo en un archivo.

#### Métodos Principales:

- `Lista()`: Constructor que inicializa una lista vacía.
- `agregarArticulo(Articulo articulo)`: Agrega un artículo a la lista y guarda el catálogo.
- `eliminarArticulo(String codigo)`: Elimina un artículo de la lista por código y guarda el catálogo.
- `listaArticulos()`: Imprime la lista de artículos en la consola.
- `guardarCatalogo()`: Guarda la lista de artículos en un archivo.
- `cargarCatalogo()`: Carga el catálogo desde un archivo.

### 3. `Interfaz`

La clase `Interfaz` proporciona una interfaz de línea de comandos para que los usuarios interactúen con el sistema de inventario.

#### Métodos Principales:

- `Interfaz()`: Constructor que inicializa la interfaz y carga datos del catálogo si están disponibles.
- `iniciar()`: Inicia la interfaz y permite a los usuarios realizar acciones en el sistema.

### 4. `Main`

La clase `Main` contiene el método `main` y se utiliza para iniciar la aplicación creando una instancia de `Interfaz` y llamando a su método `iniciar()`.

## Instrucciones de Uso

1. Ejecute la clase `Main` para iniciar la aplicación.
2. Siga las instrucciones en la interfaz de línea de comandos para agregar, eliminar o visualizar artículos.
3. Puede salir del programa seleccionando la opción correspondiente en el menú.

## Uso del Makefile

El proyecto incluye un Makefile para facilitar la compilación, ejecución y generación de documentación Javadoc. Aquí hay algunas metas definidas:

- `make primera`: Para usar la primera vez que se use el programa.
- `make compile`: Compila el código fuente.
- `make jar`: Crea un archivo JAR ejecutable.
- `make clean`: Elimina archivos generados.
- `make javadoc`: Genera la documentación Javadoc.
- `make run`: Ejecuta la aplicación.
- `make completo`: Realiza la compilación, generación de Javadoc y ejecución en un solo paso.

Para utilizar el Makefile, asegúrate de tener el comando `make` instalado y ejecuta los comandos desde la terminal.

## UML
![Diagrama](https://github.com/Alonsogarciavallejo/PracticaCatalogo/assets/119308526/417992e9-77cf-441c-a5cb-bd1f8af2ed03)

Los diagramas UML que visualiza en este programa se generan automáticamente a partir de los archivos .java y no han sido revisados manualmente. Por lo tanto, tenga en cuenta lo siguiente:

1. Los diagramas UML se generan con fines ilustrativos y pueden contener errores, omisiones o representaciones incompletas de la estructura y relaciones del sistema.

2. La precisión de la información en los diagramas UML depende de la exactitud de los datos de entrada y la implementación del programa. Pueden producirse discrepancias entre la realidad y los diagramas generados.

3. Se recomienda utilizar los diagramas UML como una referencia inicial y no como la única fuente de información sobre la arquitectura del sistema.

Estos diagramas UML son proporcionados "tal cual" y no se garantiza su exactitud o idoneidad para ningún propósito específico. El uso de esta información está bajo su propia responsabilidad.
