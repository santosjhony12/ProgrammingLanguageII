package org.example.classes;

import org.example.interfaces.Calculable;

public class Circulo implements Calculable {
    private Double raio;
    public Circulo(Double raio) {
        this.raio = raio;
    }
    @Override
    public Double calcularArea() {
        return Math.pow(Math.PI*this.raio, 2);
    }
}
