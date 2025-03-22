package Questoes;

import java.util.Scanner;

public class Questao04 extends Exec{
    public static void aluno() {
        Scanner ler = new Scanner(System.in);
        Integer alunos;
        Integer alunas;
        System.out.println("Digite a quantidades de alunos: ");
        alunos = ler.nextInt();
        System.out.println("Digite a quantidade de alunas: ");
        alunas = ler.nextInt();
        maiorsala(alunos, alunas);
    }

    static void maiorsala(Integer x, Integer y) {
        if (x > y) {
            System.out.println("Há " + x + " alunos e " + y + " alunas na sala de aula.");
        } else if (x < y) {
            System.out.println("Há " + y + " alunas e " + x + " alunos na sala de aula.");
        } else {
            System.out.println("A quantidade de alunos e alunas é a mesma, sendo " + x + " de cada.");
        }
    }

    @Override
    public void Executar() {
        aluno();
    }
}
