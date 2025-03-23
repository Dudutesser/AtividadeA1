package Questoes;

import java.util.Scanner;

public class Questao03 extends Exec{
    public void temperatura() {
        Scanner ler = new Scanner(System.in);
        Double temp;
        System.out.println("Digite a temperatura em Celcius que deseja ver em Fahrenheigt: ");
        temp = ler.nextDouble();
        System.out.println("A temperatura em Fahrenheigt é: " + transformar(temp) + "°F");
    }
    
    static double transformar(Double x) {
        return (x * 1.8) + 32;
    }

    @Override
    public void Executar() {
        temperatura();
    }
}
