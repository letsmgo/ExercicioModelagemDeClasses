package br.com.zup.ExerciciosDeClasses;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios{
    private List<Professores> profsSupervisionados = new ArrayList<>();

    //Método construtor
    public Coordenadores(String nome, String cpf, double numRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
    }

    //Método para aumento de salário
    public double aumentoSalario(){
        double aumento = getSalario() * 0.05;
        return getSalario() + aumento;
    }

    //Método para adicionar professores
    public void adicionarProfessor(Professores prof){
        profsSupervisionados.add(prof);
    }

    public void exibirProfessores(){
        for (Professores referencia : profsSupervisionados) {
            System.out.println("O nome do professor é : " + referencia.getNome());
        }
    }


}
