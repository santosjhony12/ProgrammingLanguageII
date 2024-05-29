package org.example.classes;

import org.example.interfaces.Calculable;

public class Trapezio implements Calculable {
    private Double baseMaior;
    private Double baseMenor;
    private Double altura;

    public Trapezio(Double altura, Double baseMaior, Double baseMenor){
        this.altura = altura;
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
    }

    @Override
    public Double calcularArea() {
        return ((this.baseMenor+this.baseMaior)*this.altura)/2;
    }
}
