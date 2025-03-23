package Questoes;

import java.io.IOException;
import java.util.Scanner;

public class Questao09 extends Exec{
    public void contaagua() throws InterruptedException, IOException {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
        Scanner ler = new Scanner(System.in);
        Double m3;
        Integer tipoconsumidor;
        Double conta = 0.00;
        String consumidor = "";
        System.out.println("--------------------------------------SANEAGO--------------------------------------");
        System.out.println("Selecione o tipo da sua conta:\n");
        System.out.println("1. Residencial: R$5,00 de taxa mais R$0,05 por m3 gastos;");
        System.out.println("2. Comercial: R$500,00 para os primeiros 80 m3 gastos mais R$0,25 por m3 gastos;");
        System.out.println("3. Industrial: R$800,00 para os primeiros 100 m3 gastos mais R$0,04 por m3 gastos;");
        System.out.println("-----------------------------------------------------------------------------------");
        tipoconsumidor = ler.nextInt();
        System.out.println("Digite o consumo de água em metros cúbicos:");
        m3 = ler.nextDouble();
        if (tipoconsumidor == 1) {
            conta += (5 + (0.05 * m3));
            consumidor = "residencial";
        } else if (tipoconsumidor == 2) {
            conta += 500;
            if (m3 > 80) {
                conta += (m3 * 0.25);
            }
            consumidor = "comercial";
        } else  if (tipoconsumidor == 3) {
            conta += 800;
            if (m3 > 100) {
                conta += (m3 * 0.04);
            }
            consumidor = "industrial";
        }
        pb.inheritIO().start().waitFor();
        System.out.printf("\nO seu tipo de conta é " + consumidor + " e o valor total a ser pago é de: R$%.2f\n", conta);
    }

    @Override
    public void Executar() throws InterruptedException, IOException {
        contaagua();
    }
}
