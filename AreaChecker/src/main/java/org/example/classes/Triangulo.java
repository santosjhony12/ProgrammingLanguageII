package org.example.classes;

import org.example.interfaces.Calculable;

public class Triangulo implements Calculable {
    private Double altura;
    private Double base;

    public Triangulo(Double altura, Double base){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public Double calcularArea() {
        return (this.base*this.altura)/2;
    }
}
