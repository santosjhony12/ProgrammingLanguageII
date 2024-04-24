package org.example.classes;

import org.example.interfaces.Calculable;

public class Retangulo implements Calculable {
    private Double ladoMaior;
    private Double ladoMenor;

    public Retangulo(Double ladoMaior, Double ladoMenor) {
        this.ladoMaior = ladoMaior;
        this.ladoMenor = ladoMenor;
    }

    @Override
    public Double calcularArea() {
        return this.ladoMaior*this.ladoMenor;
    }
}
