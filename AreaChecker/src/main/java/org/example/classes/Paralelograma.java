package org.example.classes;

import org.example.interfaces.Calculable;

public class Paralelograma implements Calculable {
    private Double altura;
    private Double base;

    public Paralelograma(Double base, Double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return this.altura*this.base;
    }
}
