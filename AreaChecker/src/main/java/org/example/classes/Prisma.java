package org.example.classes;

import org.example.interfaces.Calculable;


public class Prisma implements Calculable {
    private Double base;
    private Double altura;
    private Double numeroFaces;

    public Prisma(Double base, Double altura, Double numeroFaces){
        this.base = base;
        this.altura = altura;
        this.numeroFaces = numeroFaces;
    }
    @Override
    public Double calcularArea() {
        return this.base*this.altura*this.numeroFaces;
    }
}
