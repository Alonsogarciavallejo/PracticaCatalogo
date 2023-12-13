package interfaz;
import java.util.Scanner;
import dominio.*;

public class Interfaz {
    Scanner scanner = new Scanner(System.in);
    Lista listadoArticulos = new Lista();
    
    public Interfaz(){
        this.scanner = new Scanner(System.in);
        this.listadoArticulos = new Lista();

    }
    
    public void iniciar(){
        while ( true ){
            try{
                System.out.println("Eliga una opcion");
                System.out.println("1. Agregar un articulo");
                System.out.println("2. Eliminar el articulo por codigo");
                System.out.println("3. Ir a ver el catalogo de articulos");
                System.out.println("4. Salir ");

                int opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion){
                    case 1:
                    System.out.print("Agrege el nombre del articulo: ");
                    String nombrearticulo = scanner.nextLine();
                    System.out.print("Ingrese el coste del articulo: ");
                    double coste = scanner.nextDouble();
                    System.out.print("Ingrese la talla del articulo");
                    double talla = scanner.nextDouble();

                    Articulo nuevoArticulo = new Articulo(nombrearticulo, coste, talla);
                    listadoArticulos.agregarArticulo(nuevoArticulo);
                    System.out.println("Articulo agregado a la lista");
                    break;
                    
                    case 2:
                    System.out.print("Introduce el codigo del articulo a eliminar");
                    String codigoEliminar = scanner.next();
                    listadoArticulos.eliminarArticulo(codigoEliminar);
                    System.out.println("Articulo eliminado de la lista");
                    break;

                    case 3:
                    listadoArticulos.listaArticulos();
                    break;

                    case 4:
                    System.out.println("Saliendo del catalogo");
                    scanner.close();
                    System.exit(0);
                    break;
                    default:
                    System.out.println("No valido, seleccione correctamente una opcion");



                }
             } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada no correcta. Ingrese una opcion correcta");
                scanner.nextLine();
              }


            }
        }
    }

