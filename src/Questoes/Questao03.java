package Questoes;

import java.util.Scanner;

public class Questao03 extends BaseIdentificador{
    public static void temperatura() {
        Scanner ler = new Scanner(System.in);
        Double temp;
        System.out.println("Digite a temperatura em Celcius que deseja ver em Fahrenheigt");
        temp = ler.nextDouble();
        System.out.println("A temperatura em Fahrenheigt é: " + transformar(temp) + "°F");
        ler.close();
    }
    
    static double transformar(Double x) {
        return (x * 1.8) + 32;
    }

    public Questao03(int codigo) {
        super(codigo);
    }

    @Override
    public void Executar() {
        temperatura();
    }
}
