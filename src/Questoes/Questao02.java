package Questoes;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner base1 = new Scanner(System.in);
        Scanner altura1 = new Scanner(System.in);
        Scanner base2 = new Scanner(System.in);
        Scanner altura2 = new Scanner(System.in);
        Integer b1;
        Integer a1;
        Integer b2;
        Integer a2;
        Integer retanguloa;
        Integer retangulob;
        System.out.println("Digite o valor em centímetros.");
        System.out.println("Digite a base do primeiro reângulo: ");
        b1 = base1.nextInt();
        System.out.println("Digite a altura do primeiro reângulo: ");
        a1 = altura1.nextInt();
        System.out.println("Digite a base do segundo reângulo: ");
        b2 = base2.nextInt();
        System.out.println("Digite a altura do segundo reângulo: ");
        a2 = altura2.nextInt();
        retanguloa = calcular(b1, a1);
        retangulob = calcular(b2, a2);
        funcao(retanguloa, retangulob);
        base1.close();
        altura1.close();
        base2.close();
        altura2.close();
    }
    
    static Integer calcular(Integer x, Integer y) {
        return x * y;
    }

    static void funcao(Integer a, Integer b) {
        if(a > b) {
            System.out.println("O primeiro retângulo possui a maior área, com uma área de: " + a + "cm");
        } else {
            System.out.println("O segundo retângulo possui a maior área, com uma área de: " + b + "cm");
        }
    }
}
