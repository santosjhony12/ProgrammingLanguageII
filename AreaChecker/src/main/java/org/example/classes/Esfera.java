package org.example.classes;

import org.example.interfaces.Calculable;

public class Esfera implements Calculable {
    private Double raio;

    public Esfera(Double raio){
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return 4*Math.PI*Math.pow(this.raio, 2);
    }
}
