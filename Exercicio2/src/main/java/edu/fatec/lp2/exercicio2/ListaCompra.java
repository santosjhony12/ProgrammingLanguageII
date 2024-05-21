package edu.fatec.lp2.exercicio2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListaCompra implements Calculavel{
    private List<ItemCompra> itensCompras;
    private Integer qtdeMax;

    public ListaCompra(Integer qtdeMax){
        this.qtdeMax = qtdeMax;
    }

    public void incluir(ItemCompra item){
        if(itensCompras.size() == qtdeMax){
            System.out.println("Não é possivel mais adicionar itens.");
        }else{
            itensCompras.add(item);
        }
    }

    @Override
    public Double calcularPreco() {
        Double valorTotal = 0.0;
        for(ItemCompra item: itensCompras){
            valorTotal+= item.calcularPreco();
        }
        return valorTotal;
    }



}
