package model;

public class Articulo {
    private String nombreArticulo;
    private String tipoArticulo;
    private String peso;
    private int precio;

    public Articulo(String nombreArticulo, String tipoArticulo, String peso, int precio) {
        this.nombreArticulo = nombreArticulo;
        this.tipoArticulo = tipoArticulo;
        this.peso = peso;
        this.precio = precio;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
