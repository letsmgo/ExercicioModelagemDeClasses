package br.com.zup.ExerciciosDeClasses;

public class Turma {
    private int qtdAlunos;
    private String semestre;

    //Método construtor
    public Turma(int qtdAlunos, String semestre) {
        this.qtdAlunos = qtdAlunos;
        this.semestre = semestre;
    }

    //Getters and Setters
    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

}
