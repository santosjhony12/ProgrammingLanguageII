package org.example;

import org.example.enums.Naipe;
import org.example.enums.Nome;

public class Carta {
    private Naipe naipe;
    private Nome value;
    public Carta(Naipe naipe, Nome nome){
        this.naipe = naipe;
        this.value = nome;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Nome getValue() {
        return value;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public void setValue(Nome value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return String.format("%s, %s", this.naipe, this.value);
    }
}
