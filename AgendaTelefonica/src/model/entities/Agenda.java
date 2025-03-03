package model.entities;

import java.util.*;

public class Agenda {
    private Map<String, Contato> contatos = new HashMap<>();

    public void addContatos(String name, Contato contato){
        contatos.put(name, contato);
    }

    public void removeContatos(String nome){
        verificaExistencia(nome);
        contatos.remove(nome);
    }

    public void buscarContato(String nome){
        Contato c = verificaExistencia(nome);
        System.out.println(
                "Nome: " + c.getNome()
                        + "\n Telefone: " + c.getTelefone()
                        + "\n Email: " + c.getEmail()
                        + "\n Tipo do Contato: " + c.getTipoContato()
                        + "\n Data de Nascimento: " + c.getDataNascimento()
                        + "\n Endereço: " +  c.getEndereco());
    }


    public void listarContato(){
        for(Contato c: contatos.values()){
            System.out.println("Nome: " + c.getNome() + ", Telefone : " + c.getTelefone() +  " \n");
        }
    }

    public void editarContatos(String nome){
        Contato c = verificaExistencia(nome);
    }

    public Contato verificaExistencia(String nome){
        Contato contato = contatos.get(nome);
        if(contato == null){
            throw new NoSuchElementException("Contato não Encontrado ou não existe!");
        }
        return contato;
    }
}
