package Questoes;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);
        Double temp;
        System.out.println("Digite a temperatura em Celcius que deseja ver em Fahrenheigt");
        temp = temperatura.nextDouble();
        System.out.println("A temperatura em Fahrenheigt é: " + transformar(temp) + "°F");
        temperatura.close();
    }
    
    static double transformar(Double x) {
        return (x * 1.8) + 32;
    }
}
