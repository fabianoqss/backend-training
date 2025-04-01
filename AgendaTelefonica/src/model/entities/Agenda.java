package model.entities;

import model.enums.TipoContato;

import java.util.*;

import static application.Program.sc;

public class Agenda {
    private Map<String, Contato> contatos = new HashMap<>();

    public void addContatos(String name, Contato contato){
        contatos.put(name.trim().toLowerCase(), contato);
    }

    public void removeContatos(String nome){
        verificaExistencia(nome);
        contatos.remove(nome);
    }

    public void buscarContato(String nome) {
        Contato c = verificaExistencia(nome);

        if (c != null) {
            System.out.println("===========================================");
            System.out.println(c.toString());
            System.out.println("===========================================");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }



    public void listarContato(){
        for(Contato c: contatos.values()){
            System.out.println("Nome: " + c.getNome() + ", Telefone : " + c.getTelefone() +  " \n");
        }
    }

    public void editarContatos(String nome){
        Contato c = verificaExistencia(nome);

        System.out.println("Editar contato: " + c.getNome());
        System.out.println("Digite o novo telefone (ou pressione Enter para manter o atual): ");
        String novoTelefone = sc.nextLine();
        if (!novoTelefone.isEmpty()) {
            c.setTelefone(novoTelefone);
        }

        System.out.println("Digite o novo email (ou pressione Enter para manter o atual): ");
        String novoEmail = sc.nextLine();
        if (!novoEmail.isEmpty()) {
            c.setEmail(novoEmail);
        }

        System.out.println("Contato atualizado com sucesso!");
    }

    public Contato verificaExistencia(String nome){
        Contato contato = contatos.get(nome.trim().toLowerCase());
        if(contato == null){
            throw new NoSuchElementException("Contato não Encontrado ou não existe!");
        }
        return contato;
    }
}
