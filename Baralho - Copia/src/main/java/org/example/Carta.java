package org.example;

import org.example.enums.Naipe;
import org.example.enums.Value;

public class Carta {
    private Naipe naipe;
    private Value value;
    public Carta(Naipe naipe, Value value){
        this.naipe = naipe;
        this.value = value;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Value getValue() {
        return value;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return String.format("%s, %s", this.naipe, this.value);
    }
}
