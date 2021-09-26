package br.com.zup.ExerciciosDeClasses;

public class Funcionarios {
    //Atributos
    private String nome;
    private String cpf;
    private double numRegistro;
    private String orgaoLotacao;
    private double salario;

    //Método construtor
    public Funcionarios(){

    }
    public Funcionarios(String nome, String cpf, double numRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(double numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
