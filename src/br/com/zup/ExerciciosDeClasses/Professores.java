package br.com.zup.ExerciciosDeClasses;

public class Professores extends Funcionarios{
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;

    //Método construtor
    public Professores(){

    }

    public Professores(String nome, String cpf, double numRegistro, String orgaoLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }


}
