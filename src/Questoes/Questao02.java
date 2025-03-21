package Questoes;

import java.util.Scanner;

public class Questao02 extends BaseIdentificador{
    public static void retangulo() {
        Scanner ler = new Scanner(System.in);
        Integer b1;
        Integer a1;
        Integer b2;
        Integer a2;
        Integer retanguloa;
        Integer retangulob;
        System.out.println("Digite o valor em centímetros.");
        System.out.println("Digite a base do primeiro reângulo: ");
        b1 = ler.nextInt();
        System.out.println("Digite a altura do primeiro reângulo: ");
        a1 = ler.nextInt();
        System.out.println("Digite a base do segundo reângulo: ");
        b2 = ler.nextInt();
        System.out.println("Digite a altura do segundo reângulo: ");
        a2 = ler.nextInt();
        retanguloa = calcular(b1, a1);
        retangulob = calcular(b2, a2);
        maior(retanguloa, retangulob);
        ler.close();
    }
    
    static Integer calcular(Integer x, Integer y) {
        return x * y;
    }

    static void maior(Integer a, Integer b) {
        if(a > b) {
            System.out.println("O primeiro retângulo possui a área maior, com uma área de: " + a + "cm");
        } else if (a == b) {
            System.out.println("Os dois retângulos possuem a mesma área, os dois com área de: " + a + "cm");
        } else {
            System.out.println("O segundo retângulo possui a área maior, com uma área de: " + b + "cm");
        }
    }

    public Questao02(int codigo) {
        super(codigo);
    }

    @Override
    public void Executar() {
        retangulo();
    }
}
