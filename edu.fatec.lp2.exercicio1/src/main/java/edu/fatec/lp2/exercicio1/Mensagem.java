package edu.fatec.lp2.exercicio1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    abstract Mensagem sendMensagem(String conteudo);
}
