package edu.fatec.lp2.exercicio2;

import lombok.*;


@ToString
@Builder
@AllArgsConstructor
public class Produto {
    @Getter
    private String nome;
    private String unidade;
    private String descricao;
    private Double preco;
    private Double descontoMaximo;
    private Supermercado supermercado;

    public Produto(Supermercado s){
        this.supermercado = s;
    }

}
