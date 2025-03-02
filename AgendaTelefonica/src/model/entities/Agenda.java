package model.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Contato> contatos = new HashMap<>();

    public void addContatos(String name, Contato contato){
        contatos.put(name, contato);
    }

    public void removeContatos(String nome){
        contatos.remove(nome);
    }

    public void buscarContato(String nome){
        for(Contato c : contatos.values()){
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
        for(Contato c: contatos.values()){
            System.out.println("Nome: " + c.getNome() +
                    "\n Telefone" + c.getTelefone());
        }
    }
}
