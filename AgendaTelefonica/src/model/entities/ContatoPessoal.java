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
}
