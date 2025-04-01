package model.entities;

import model.enums.TipoContato;

import java.time.LocalDate;

public class ContatoPessoal extends Contato{
    private String relacao;

    public ContatoPessoal(String nome, String telefone, String email, TipoContato tipoContato, LocalDate dataNascimento, String endereco, String relacao) {
        super(nome, telefone, email, tipoContato, dataNascimento, endereco);
        this.relacao = relacao;
    }

    public String getRelacao() {
        return relacao;
    }

    public void setRelacao(String relacao) {
        this.relacao = relacao;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Tipo do Contato: " + getTipoContato() +  "\n" +
                "Data de Nascimento: " + getDataNascimento() + "\n" +
                "Endereco: " + getEndereco() + "\n" +
                "Relação: " + getRelacao()
                ;
    }
}
