package Questoes;

import java.util.Scanner;

public class Questao01 extends BaseIdentificador{
    public static void numero() {
        Scanner ler = new Scanner(System.in);
        Integer n1;
        Integer n2;
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();
        Integer recebe = maior(n1, n2);
        System.out.println("O maior número é: " + recebe);
        ler.close();
    }

    static Integer maior(Integer x, Integer y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public Questao01(int codigo) {
        super(codigo);
    }

    @Override
    public void Executar() {
        numero();
    }
}
