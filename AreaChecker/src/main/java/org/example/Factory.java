package org.example;

import org.example.classes.*;
import org.example.enums.FigureType;
import org.example.interfaces.Calculable;

public class Factory {
    public static Calculable create(FigureType figureType, Double ... elemento){
        Calculable calculable = null;
        switch (figureType){
            case RETANGULO -> calculable = new Retangulo(elemento[0], elemento[1]);
            case QUADRADO -> calculable = new Quadrado(elemento[0]);
            case CIRCULO -> calculable = new Circulo(elemento[0]);
            case CUBO -> calculable = new Cubo(elemento[0]);
            case HEXAGONO -> calculable = new Hexagono(elemento[0]);
            case LOSANGULO -> calculable = new Losangulo(elemento[0], elemento[1]);
            case PARALELOGRAMA -> calculable = new Paralelograma(elemento[0], elemento[1]);
            case TRAPEZIO -> calculable = new Trapezio(elemento[0], elemento[1], elemento[2]);
            case TRIANGULO -> calculable = new Triangulo(elemento[0], elemento[1]);
            case PIRAMIDE -> calculable = new Piramide(elemento[0], elemento[1]);
            case PRISMA -> calculable = new Prisma(elemento[0], elemento[1], elemento[2]);
            case CILINDRO -> calculable = new Cilindro(elemento[0], elemento[1]);
            case ESFERA -> calculable = new Esfera(elemento[0]);

        }
        return calculable;
    }
}
