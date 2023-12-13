package dominio;

import java.io.*;
import java.util.ArrayList;

/**
 * Gestiona una lista de artículos.
 */
public class Lista implements Serializable {
    private static final String CATALOG_FILE = "catalogo.ser";
    private ArrayList<Articulo> articulos;

    /**
     * Construye un objeto Lista vacío.
     */
    public Lista() {
        this.articulos = new ArrayList<>();
    }

    /**
     * Agrega un artículo a la lista y guarda el catálogo.
     *
     * @param articulo El artículo a agregar.
     */
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
        guardarCatalogo();
    }

    /**
     * Elimina un artículo de la lista por código y guarda el catálogo.
     *
     * @param codigo El código del artículo a eliminar.
     */
    public void eliminarArticulo(String codigo) {
        articulos.removeIf(articulo -> articulo.getCodigo().equals(codigo));
        guardarCatalogo();
    }

    /**
     * Imprime la lista de artículos en consola.
     */
    public void listaArticulos() {
        System.out.println("Catálogo de artículos");
        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }
    }

    /**
     * Guarda la lista de artículos en un archivo.
     */
    public void guardarCatalogo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(CATALOG_FILE))) {
            out.writeObject(articulos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Carga el catálogo desde un archivo y maneja las excepciones.
     */
    @SuppressWarnings("unchecked")
    public void cargarCatalogo() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(CATALOG_FILE))) {
            Object obj = in.readObject();
            if (obj instanceof ArrayList) {
                articulos = (ArrayList<Articulo>) obj;
            } else {
                System.out.println("Error: Formato de datos no valido en " + CATALOG_FILE);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo de catalogo no encontrado. Iniciando con un catalogo vacio.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
