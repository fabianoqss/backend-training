package model.entities;

import model.enums.TipoContato;

import java.time.LocalDate;

public abstract class Contato  implements Comparable<Contato>{
    private String nome;
    private String telefone;
    private String email;
    private TipoContato tipoContato;
    private LocalDate dataNascimento;
    private String endereco;

    public Contato() {
    }

    public Contato(String nome, String telefone, String email, TipoContato tipoContato, LocalDate dataNascimento, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipoContato = tipoContato;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public int compareTo(Contato other){
        return nome.compareTo(other.getNome());
    }

}
