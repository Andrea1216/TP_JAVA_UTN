package org.logica;

public class Apostador {
    private int doc;
    private String nombre;
    private String apellido;
    private Pronostico pronostico;

    public Apostador(int doc, String nombre, String apellido, Pronostico pronostico) {
        this.doc = doc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pronostico = pronostico;
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

    public Pronostico getPronostico() {
        return pronostico;
    }

    @Override
    public String toString() {
        return "Apostador{" +
                "doc=" + doc +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pronostico=" + pronostico +
                '}';
    }
}
