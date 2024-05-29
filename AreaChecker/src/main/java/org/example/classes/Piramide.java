package org.example.classes;

import org.example.interfaces.Calculable;

public class Piramide implements Calculable {
    private Double lado;
    private Double altura;

    public Piramide(Double lado, Double altura){
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return Math.pow(this.lado, 2)+2*this.lado*this.altura;
    }
}
