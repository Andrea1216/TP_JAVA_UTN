package org.logica;

public class Apostador {
    private int doc;
    private String nombre;
    private String apellido;
    private String apuesta;

    public Apostador(int doc, String nombre, String apellido, String apuesta) {
        this.doc = doc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apuesta = apuesta;
    }

    public int getDoc() {
        return doc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getApuesta() {
        return apuesta;
    }

    @Override
    public String toString() {
        return "Apostador{" + "doc=" + doc +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", apuesta='" + apuesta + '\'' +
                '}';
    }
}
