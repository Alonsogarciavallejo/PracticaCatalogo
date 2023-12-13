package dominio;
import java.io.Serializable;
import java.util.UUID;
public class Articulo implements Serializable {
    private String nombrearticulo;
    private double coste;
    private double talla;
    private String codigo;

    public Articulo(String nombrearticulo, double coste, double talla ){
        this.nombrearticulo = nombrearticulo;
        this.coste = coste;
        this.talla = talla;
        this.codigo = UUID.randomUUID().toString();
        
    }
    public String getNombrearticulo(){
        return nombrearticulo;
    }
   
    public void setNombrearticulo(String nombrearticulo){
        this.nombrearticulo = nombrearticulo;
    }

    public double getCoste(){
        return coste;

    }
    public void setCoste(double coste){
        this.coste = coste;
    }
    public double getTalla(){
        return talla;
    }
    public void setTalla(double talla){
        this.talla = talla;
    }

    public String getCodigo(){
         return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String toString(){
        return "Articulo:" + nombrearticulo + ". Precio:" + coste + "$" + "Talla:" + talla + "codigo del articulo:" + codigo;
    }

}
