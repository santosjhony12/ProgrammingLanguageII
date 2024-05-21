package edu.fatec.lp2.exercicio1.mensagens;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MsgFoto extends Mensagem {
    private int tamanho;
    @Override
    public MsgFoto sendMensagem(String conteudo) {
        return new MsgFoto();
    }
}
