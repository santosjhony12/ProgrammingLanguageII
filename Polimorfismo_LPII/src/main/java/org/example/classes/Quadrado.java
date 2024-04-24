package org.example.classes;

import org.example.interfaces.Calculable;

public class Quadrado implements Calculable {
    private Double lado;
    public Quadrado(Double lado){this.lado = lado;}

    @Override
    public Double calcularArea() {
        return Math.pow(this.lado, 2);
    }


}
