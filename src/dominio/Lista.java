package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Lista implements Serializable {
    private ArrayList<Articulo> articulos;

    public Lista(){
         this.articulos = new ArrayList<>();
      
    }

    public void agregarArticulo(Articulo articulo){
        articulos.add(articulo);

    }
    public void eliminarArticulo(String codigo){
        articulos.removeIf(articulo -> articulo.getCodigo()equals(codigo ));

    }

    public void listaArticulos(){
        System.out.println("Catálogo de artículos");
        for (Articulo articulo : articulos){
            System.out.println(articulo);
        }
    }
}