package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.mensagens.Mensagem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp(List<Contatinho> contatos, List<Mensagem> mensagens){
        this.contatos = contatos;
        this.mensagens = mensagens;
    }
    public void listarContatos(){
        for(Contatinho contatinho : contatos){
            System.out.println(contatinho);
        }
    }
    public void listarMensagens(){
        for(Mensagem mensagem : mensagens){
            System.out.println(mensagem);
        }
    }
}
