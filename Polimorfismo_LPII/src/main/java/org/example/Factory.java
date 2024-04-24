package org.example;

import org.example.classes.Circulo;
import org.example.classes.Cubo;
import org.example.classes.Quadrado;
import org.example.classes.Retangulo;
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

        }
        return calculable;
    }
}
