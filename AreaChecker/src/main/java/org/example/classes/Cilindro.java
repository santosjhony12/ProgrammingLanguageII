package org.example.classes;

import org.example.interfaces.Calculable;

public class Cilindro implements Calculable {
    private Double raio;
    private Double altura;

    public Cilindro(Double raio, Double altura){
        this.altura = altura;
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return 2*Math.PI*this.raio*(this.raio*this.altura);
    }
}
