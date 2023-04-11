package org.logica;

public class Ronda {
    private String nro;
    private Partido[] partidos;

    public Ronda(String nro, Partido[] partidos) {
        this.nro = nro;
        this.partidos = new Partido[4];  //por ej partidos por ronda
    }

    public int puntos(){
        return 0;
    }
}
