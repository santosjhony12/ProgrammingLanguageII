package edu.fatec.lp2.exercicio2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemCompra implements Calculavel{
    private Integer quantidade;
    private Produto produto;
    private Double desconto;
    public ItemCompra(Produto produto, Double desconto){
        this.produto = produto;
        this.desconto = desconto;
    }

    @Override
    public Double calcularPreco(){
        if(desconto > produto.getDescontoMaximo()){
            desconto = produto.getDescontoMaximo();
        }
        return (produto.getPreco()-(produto.getPreco()*desconto)) * quantidade;
    }
}
