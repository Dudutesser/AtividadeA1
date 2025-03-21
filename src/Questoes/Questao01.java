package Questoes;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Integer n1;
        Integer n2;
        System.out.println("Digite o primeiro numero: ");
        n1 = num1.nextInt();
        n2 = num2.nextInt();
        System.out.println("O maior número é: " + maior(n1, n2));
        num1.close();
        num2.close();
    }

    static Integer maior(Integer x, Integer y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
