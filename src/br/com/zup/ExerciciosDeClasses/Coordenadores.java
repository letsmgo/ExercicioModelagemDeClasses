package br.com.zup.ExerciciosDeClasses;

public class Coordenadores extends Funcionarios{
    Professores vetor [] = new Professores[2];

    //Método construtor
    public Coordenadores(String nome, String cpf, double numRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
    }

    //Getters and Setters
    public Professores[] getVetor(){
        return vetor;
    }

    public void setVetor(Professores[] vetor){
        this.vetor = vetor;
    }

    //Método para adicionar professores
    public void addProfesssores(Professores professorAdd){
        if (vetor[1] != null){
            System.out.println("Número máximo de professores já adicionados, não foi possível atender sua solicitação");
        }
        else {
            for (int ref = 0; ref < vetor.length; ref++) {
                if (vetor[ref] == null){
                    vetor[ref] = professorAdd;
                    System.out.println("Professor " + professorAdd.getNome() + " adicionado.");
                    ref = 2;
                }
            }
        }
    }

    //Método para exibir lista de profs
    public void exibirProf(){
        for (int ref = 0; ref < vetor.length; ref++){
            if (vetor[ref] != null) {
                System.out.println(vetor[ref].getNome());
            }
        }
    }


    //Método para aumento de salário
    public double aumentoSalario(){
        double aumento = getSalario() * 0.05;
        return getSalario() + aumento;
    }

    /*Método para adicionar professores
    public void adicionarProfessor(Professores prof){
        profsSupervisionados.add(prof);
    }

    public void exibirProfessores(){
        for (Professores referencia : profsSupervisionados) {
            System.out.println("O nome do professor é : " + referencia.getNome());
        }
    }
     */
}
