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

}
