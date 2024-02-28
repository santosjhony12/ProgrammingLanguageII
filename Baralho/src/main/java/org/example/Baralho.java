package org.example;

import org.example.enums.Naipe;
import org.example.enums.Nome;

public class Baralho {
    private static final Integer NR_REPETICOES = 100;
    private Carta[] cartas = new Carta[56];

    public Baralho(){
        int i = 0;
        for(Nome nome : Nome.values()){
            if(nome != Nome.CORINGA){
                for(Naipe naipe : Naipe.values()){
                    if(naipe != Naipe.CORINGA){
                        cartas[i] = new Carta(naipe, nome);
                        i +=1;
                    }
                }
            }
        }

        for(int a = 52; a < cartas.length; a++){
            cartas[i] = new Carta(Naipe.CORINGA, Nome.CORINGA);
            i +=1;
        }
    }

    public void embaralhar() {
        for(int i = 0; i < NR_REPETICOES; i++){
            int index1 = ((int)(Math.random() * 56)) - 1;
            int index2 = ((int)(Math.random() * 56)) - 1;
            Carta temp = cartas[index1];
            cartas[index1] = cartas[index2];
            cartas[index2] = temp;
        }
    }


}
