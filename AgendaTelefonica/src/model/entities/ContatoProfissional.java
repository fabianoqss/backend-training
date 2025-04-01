package model.entities;

import model.enums.TipoContato;

import java.time.LocalDate;

public class ContatoProfissional extends Contato{
    private String empresa;
    private String cargo;
    private String departamento;

    public ContatoProfissional(String nome, String telefone, String email, TipoContato tipoContato, LocalDate dataNascimento, String endereco, String empresa, String cargo, String departamento) {
        super(nome, telefone, email, tipoContato, dataNascimento, endereco);
        this.empresa = empresa;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Email: " + getEmail() + "\n " +
                "Tipo do Contato: " + getTipoContato() +  "\n " +
                "Data de Nascimento: " + getDataNascimento() + "\n " +
                "Endereco: " + getEndereco() + "\n " +
                "Empresa: " + getEmpresa() + "\n " +
                "Cargo: " + getCargo() + "\n " +
                "Departamento: " + getDepartamento()
                ;
    }

}
