package org.example.classes;

import org.example.interfaces.Calculable;

public class Losangulo implements Calculable {
    private Double diagonalMaior;
    private Double diagonalMenor;

    public Losangulo(Double diagonalMaior, Double diagonalMenor){
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }
    @Override
    public Double calcularArea() {
        return (this.diagonalMenor*this.diagonalMaior)/2;
    }
}
