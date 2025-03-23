package Questoes;

import java.util.Scanner;

public class Questao01 extends Exec{
    public void numero() {
        Scanner ler = new Scanner(System.in);
        Integer n1;
        Integer n2;
        System.out.println("Digite o primeiro numero:");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = ler.nextInt();
        Integer recebe = maior(n1, n2);
        System.out.println("O maior número é: " + recebe);
    }

    static Integer maior(Integer x, Integer y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    @Override
    public void Executar() {
        numero();
    }
}
