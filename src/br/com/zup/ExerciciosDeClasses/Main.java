package br.com.zup.ExerciciosDeClasses;

public class Main {
    public static void main(String[] args) {
        Coordenadores coordenador = new Coordenadores("Maga Alonso", "999", 111, "012", 12000);
        Professores professor1 = new Professores("André", "888", 100, "011", 16000, "Mestre", "Java", 25, 2);
        Professores professor2 = new Professores("Vinicius","666",98,"098",16000,"Mestre","JavaScript",25,2);
        Administrativos adm1 = new Administrativos("Eliseu", "777", 99, "099", 14000, "Head", "Sênior");
        Turma turma1 = new Turma(25,"Primeiro semestre");
        Turma turma2 = new Turma(25,"Segundo semestre");


        //Funcionalidade Aumento de salário Coordenador
        System.out.println("\nCoordenador(a) da área: " + coordenador.getNome());
        System.out.println("Salário atual: R$" + coordenador.getSalario());
        System.out.println("Salário após aumento de 5%: R$" + coordenador.aumentoSalario() + "\n");

        //Funcionalidade adicionando professores
        coordenador.adicionarProfessor(professor1);
        coordenador.adicionarProfessor(professor2);
        coordenador.exibirProfessores();


        //Funcionalidade Aumento de salario Professor
        System.out.println("Professor " + professor1.getNome() + ", ministra aulas de " + professor1.getDisciplinaMinistrada());
        System.out.println("Salário atual é: R$" + professor1.getSalario());
        System.out.println("Salário após aumento de 10% é: R$" + professor1.aumentoSalario());

        //Funcionalidade adicionar turma
        System.out.println("O professor André está com " + professor1.getQtdTurmas() + " turmas.");
        System.out.println("No novo semestre, terá " + professor1.turmas() + " turmas.\n");

        System.out.println("O professor " + professor2.getNome() + ", ministra aula de " + professor2.getDisciplinaMinistrada());
        System.out.println("Salário atual é: R$" + professor2.getSalario());
        System.out.println("Salário após o aumento de 10% é: R$" + professor2.aumentoSalario());
        System.out.println("Ele está com " + professor2.getQtdTurmas() + " turmas.");
        System.out.println("No novo semestre, terá " + professor2.turmas() + " turmas.\n");

        //Funcionalidade aumento de salario Adm's
        System.out.println("Nome do Administrador: " + adm1.getNome());
        System.out.println("Salário atual é: R$" + adm1.getSalario());
        System.out.println("Salário após o aumento de 10% é: R$" + adm1.aumentoSalario() + "\n");

        //Testando funcionalidades da classe turma como característica da classe professores

        professor1.addTurma(turma1);
        professor1.adicionarAlunos(turma1);
        System.out.println(professor1.quantidadeAlunos());
        System.out.println(turma1.getQtdAlunos());
        System.out.println(turma1.getSemestre() + "\n");

        professor2.addTurma(turma2);
        professor2.adicionarAlunos(turma2);
        System.out.println(professor2.quantidadeAlunos());
        System.out.println(turma2.getQtdAlunos());
        System.out.println(turma2.getSemestre());

    }
}
