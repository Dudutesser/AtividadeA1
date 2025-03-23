package Questoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao06 extends Exec{
    public void jogo() {
        Scanner ler = new Scanner(System.in);
        Integer h1, m1, h2, m2, tudomin1, tudomin2, jogo, hjogo, minjogo;
        System.out.println("Digite a hora de ínicio do jogo: ");
        System.out.println("Horas: ");
        h1 = ler.nextInt();
        System.out.println("Minutos: ");
        m1 = ler.nextInt();
        System.out.println("Horas: ");
        h2 = ler.nextInt();
        System.out.println("Minutos: ");
        m2 = ler.nextInt();
        tudomin1 = (h1 * 60) + m1;
        tudomin2 = (h2 * 60) + m2;
        if (tudomin1 >= tudomin2) {
            tudomin2 += 1440;
        }
        jogo = tudomin2 - tudomin1;
        hjogo = jogo / 60;
        minjogo = jogo % 60;
        DecimalFormat form = new DecimalFormat("00");
        String numeroantes1 = form.format(hjogo);
        String numeroantes2 = form.format(minjogo);
        System.out.printf("O jogo durou " + numeroantes1 + ":" + numeroantes2 + "h.\n");
    }
    @Override
    public void Executar() {
        jogo();
    }
}
