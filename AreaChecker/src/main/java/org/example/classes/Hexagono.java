package org.example.classes;

import org.example.interfaces.Calculable;

public class Hexagono implements Calculable {
    private Double lado;

    public Hexagono(Double lado){this.lado = lado;}

    @Override
    public Double calcularArea() {
        return (Math.pow(this.lado, 2)*3*Math.sqrt(3))/2;
    }
}
