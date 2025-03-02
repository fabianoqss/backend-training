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
            if(contatos.containsKey(nome)){
                Contato c = contatos.get(nome);
                System.out.println(
                        "Nome: " + c.getNome()
                        + "\n Telefone: " + c.getTelefone()
                        + "\n Email: " + c.getEmail()
                        + "\n Tipo do Contato: " + c.getTipoContato()
                                + "\n Data de Nascimento: " + c.getDataNascimento()
                                + "\n Endereço: " +  c.getEndereco());
            }else {
                System.out.println("Contato não encontrado!");
            }

    }


    public void listarContato(){
        for(Contato c: contatos.values()){
            System.out.println("Nome: " + c.getNome() +
                    "\n Telefone" + c.getTelefone());
        }
    }

    public void editarContatos(String nome){

    }

}
