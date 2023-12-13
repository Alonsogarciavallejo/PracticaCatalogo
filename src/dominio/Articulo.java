package dominio;

import java.io.Serializable;
import java.util.UUID;

/**
 * Representa un artículo con un nombre, costo, talla y un código único.
 */
public class Articulo implements Serializable {
    private String nombrearticulo;
    private double coste;
    private double talla;
    private String codigo;

    /**
     * Construye un objeto Articulo con los parámetros dados.
     *
     * @param nombrearticulo El nombre del artículo.
     * @param coste          El costo del artículo (debe ser no negativo).
     * @param talla          El tamaño del artículo (debe ser no negativo).
     */
    public Articulo(String nombrearticulo, double coste, double talla) {
        this.nombrearticulo = nombrearticulo;
        this.coste = validarValorNoNegativo(coste, "Coste");
        this.talla = validarValorNoNegativo(talla, "Talla");
        this.codigo = UUID.randomUUID().toString();
    }

    /**
     * Obtiene el nombre del artículo.
     *
     * @return El nombre del artículo.
     */
    public String getNombrearticulo() {
        return nombrearticulo;
    }

    public void setNombrearticulo(String nombrearticulo) {
        this.nombrearticulo = nombrearticulo;
    }

    /**
     * Obtiene el coste del artículo.
     *
     * @return El coste del artículo.
     */
    public double getCoste() {
        return coste;

    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
    /**
     * Obtiene la tala del artículo.
     *
     * @return La talla del artículo.
     */
    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

     /**
     * Obtiene el codigo UUID del artículo.
     *
     * @return El Codigo UUID del artículo.
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Convierte el objeto Articulo a una cadena de texto.
     *
     * @return Representación en cadena del objeto Articulo.
     */
    public String toString() {
        return "Articulo:" + nombrearticulo + ". Precio:" + coste + "$" + "Talla:" + talla + "codigo del articulo:"
                + codigo;
    }
    
    /**
     * Valida que el valor dado sea no negativo.
     *
     * @param valor  El valor a validar.
     * @param nombre El nombre del valor para mensajes de error.
     * @return El valor validado.
     * @throws IllegalArgumentException Si el valor es negativo.
     */
    private double validarValorNoNegativo(double valor, String nombre) {
        if (valor < 0) {
            throw new IllegalArgumentException(nombre + " debe ser no negativo.");
        }
        return valor;
    }
}
