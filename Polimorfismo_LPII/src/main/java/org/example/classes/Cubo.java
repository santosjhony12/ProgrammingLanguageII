package org.example.classes;

import org.example.interfaces.Calculable;

public class Cubo implements Calculable {
    private Double lado;

    public Cubo(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return 6*Math.pow(lado, 2);
    }
}
