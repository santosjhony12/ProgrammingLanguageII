package org.example;

import org.example.enums.Naipe;
import org.example.enums.Value;

public class Baralho {
    private static final Integer NR_REPETICOES = 100;
    private Carta[] cartas = new Carta[56];

    public Baralho(){
        int i = 0;
        for(Value value : Value.values()){
            if(value != Value.CORINGA){
                for(Naipe naipe : Naipe.values()){
                    if(naipe != Naipe.CORINGA){
                        cartas[i] = new Carta(naipe, value);
                        i +=1;
                    }
                }
            }
        }

        for(int a = 52; a < cartas.length; a++){
            cartas[i] = new Carta(Naipe.CORINGA, Value.CORINGA);
            i +=1;
        }
    }

    public void embaralhar() {
        for(int i = 0; i < NR_REPETICOES; i++){
            int index1 = ((int)(Math.random() * 55));
            int index2 = ((int)(Math.random() * 55));
            Carta temp = cartas[index1];
            cartas[index1] = cartas[index2];
            cartas[index2] = temp;
        }
    }

    public Carta distribuirCarta(){
        for(int i = cartas.length - 1; i >= 0; i--){
            if(cartas[i] != null){
                Carta temp = cartas[i];
                cartas[i] = null;
                return temp;
            }
        }
        return null;
    }

    public boolean hasCarta(){
        for(Carta carta : cartas){
            if(carta != null)
                return true;
        }
        return false;
    }

    public void imprimirBaralho(){
        for(Carta carta : cartas){
            System.out.println(String.format("%s, %s", carta.getNaipe(), carta.getValue()));
        }
    }

}
