package br.com.zup.ExerciciosDeClasses;

public class Main {
    public static void main(String[] args) {
        Coordenadores coordenador = new Coordenadores("Maga Alonso", "999", 111, "012", 12000);
        Professores professor = new Professores("André", "888", 100, "011", 16000, "Mestre", "Java", 25, 2);
        Administrativos adm1 = new Administrativos("Eliseu", "777", 99, "099", 14000, "Head", "Sênior");

        //Funcionalidade Aumento de salário Coordenador
        System.out.println("\nCoordenador(a) da área: " + coordenador.getNome());
        System.out.println("Salário atual: R$" + coordenador.getSalario());
        System.out.println("Salário após aumento de 5%: R$" + coordenador.aumentoSalario() + "\n");

        //Funcionalidade Aumento de salario Professor
        System.out.println("Professor: " + professor.getNome() + ", ministra aulas de: " + professor.getDisciplinaMinistrada());
        System.out.println("Salário atual é: R$" + professor.getSalario());
        System.out.println("Salário após aumento de 10% é: R$" + professor.aumentoSalario());

        //Funcionalidade adicionar turma
        System.out.println("Professor André está com: " + professor.getQtdTurmas());
        System.out.println("No novo semestre, terá: " + professor.turmas() + " turmas.\n");

        //Funcionalidade aumento de salario Adm's
        System.out.println("Nome do Administrador: " + adm1.getNome());
        System.out.println("Salário atual é: R$" + adm1.getSalario());
        System.out.println("Salário após o aumento de 10% é: R$" + adm1.aumentoSalario() + "\n");


    }
}
