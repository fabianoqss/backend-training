package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void addContatos(Contato contato){
        contatos.add(contato);
    }

    public void removeContatos(String nome){
        contatos.remove(nome);
    }

    public void buscarContatos(String nome){
        for(Contato c : contatos){
            if(nome == c.getNome()){
                System.out.println(
                        "Nome: " + c.getNome()
                        + "\n Telefone: " + c.getTelefone()
                        + "\n Email: " + c.getEmail()
                        + "\n Tipo do Contato: " + c.getTipoContato()
                                + "\n Data de Nascimento: " + c.getDataNascimento()
                                + "\n Endereço: " +  c.getEndereco());
            }
        }
    }


    public void listarContato(){
        
    }
}
