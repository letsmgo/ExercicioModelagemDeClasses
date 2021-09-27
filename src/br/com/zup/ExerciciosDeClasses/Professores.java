package br.com.zup.ExerciciosDeClasses;

public class Professores extends Funcionarios {
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;
    public Turma turma;

    //Método construtor
    public Professores(String nome, String cpf, double numRegistro, String orgaoLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    //Getters and Setters
    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    //Getters and Setters da classe turma
    public Turma getTurma(){
        return turma;
    }
    public void setTurma(Turma turma){
        this.turma = turma;
    }

    //Método para aumento de salário
    public double aumentoSalario() {
        double vlrAumento = getSalario() * 0.10;
        return getSalario() + vlrAumento;
    }

    //Método para inclusão de turma
    public int turmas() {
        int novasTurmas = qtdTurmas + 1;
        return novasTurmas;
    }

    //Método para inclusão de alunos na turma
    public void adicionarAlunos(Turma turma){
        qtdAlunos = qtdAlunos + turma.getQtdAlunos();
    }

    public String quantidadeAlunos(){
        return "Quantidade de Alunos: " + qtdAlunos;
    }

    public void addTurma(Turma turmaAdicionada){
        turma = turmaAdicionada;
    }

}
