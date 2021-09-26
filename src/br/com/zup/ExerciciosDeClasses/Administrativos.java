package br.com.zup.ExerciciosDeClasses;

public class Administrativos extends Funcionarios {
    private String funcaoAdm;
    private String senioridade;

    //Método construtor
    public Administrativos(String nome, String cpf, double numRegistro, String orgaoLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    //Getters and Setters
    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    //Método aumento de salário
    public double aumentoSalario(){
        double vlrAumento = getSalario() * 0.10;
        return getSalario() + vlrAumento;
    }

}
