package model;

public class Cliente {
    private String nombreCliente;
    private String rut;
    private String correo;

    public Cliente(String nombreCliente, String rut, String correo) {
        this.nombreCliente = nombreCliente;
        this.rut = rut;
        this.correo = correo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
