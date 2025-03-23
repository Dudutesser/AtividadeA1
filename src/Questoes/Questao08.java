package Questoes;

import java.util.Scanner;

public class Questao08 extends Exec{
    public void carro() {
        Scanner ler = new Scanner(System.in);
        Double carro;
        Integer opcao;
        System.out.println("Digite o valor de fábrica do carro:");
        carro = ler.nextDouble();
        System.out.println("Escolha as opcões uma de cada vez e sem repetir:");
        System.out.println("1. Ar-condicionado: R$ 1750,00\n2. Pintura Metálica: R$ 800,00\n3. Vidro Elétrico: R$ 1200,00\n4. Direção Hidráulica: R$ 2000,00\n0. Sair.");
        do {
            opcao = ler.nextInt();
            if (opcao == 1) {
                carro += 1750;
                System.out.println("Valor total: " + carro);
            } else if (opcao == 2) {
                carro += 800;
                System.out.println("Valor total: " + carro);
            } else if (opcao == 3) {
                carro += 1200;
                System.out.println("Valor total: " + carro);
            } else if (opcao == 4) {
                carro += 2000;
                System.out.println("Valor total: " + carro);
            }
    } while (opcao != 0);
    System.out.println("O valor total do carro é de: " + carro);
    }

    @Override
    public void Executar() {
        carro();
    }
}
