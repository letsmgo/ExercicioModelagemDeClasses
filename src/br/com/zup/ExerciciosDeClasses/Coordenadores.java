package br.com.zup.ExerciciosDeClasses;

public class Coordenadores extends Funcionarios{
    private String profsSupervisionados;

    //Método construtor
    public Coordenadores (){

    }

    public Coordenadores(String nome, String cpf, double numRegistro, String orgaoLotacao, double salario, String profsSupervisionados) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.profsSupervisionados = profsSupervisionados;
    }



}
