package Questoes;

import java.io.IOException;
import java.util.Scanner;

public class Questao05 extends Exec{
    public void frutas() throws InterruptedException, IOException {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
        Scanner ler = new Scanner(System.in);
        Float morango;
        Float maca;
        Float kg;
        Double valortotal;
        pb.inheritIO().start().waitFor();
        System.out.println("Digite a quantidade em Kg:");
        System.out.println(" ________________________________________");
        System.out.println("|                                        |");
        System.out.println("|  Frutas:  Até 5Kg        Acima de 5Kg  |");
        System.out.println("|  Morango: R$7,50 p/Kg  |  R$5,30 p/Kg  |");
        System.out.println("|  Maçã:    R$3,50 p/Kg  |  R$2,80 p/Kg  |");
        System.out.println("|________________________________________|\n");
        System.out.println("Morangos:");
        morango = ler.nextFloat();
        System.out.println("Maçãs:");
        maca = ler.nextFloat();
        kg = morango + maca;
        valortotal = morango * 7.50 + maca * 3.50;
        if (kg < 5 && valortotal > 19) {
            System.out.println("Parabéns, você ganhou um desconto de 8%!");
            valortotal -= 0.08;
        }
        System.out.printf("Você pegou %.2fkg de morango e %.2fkg de maça, totalizando %.2fKg.\n", morango, maca, morango + maca);
        System.out.printf("O total a pagar é de: R$%.2f\n", valortotal);
    }

    @Override
    public void Executar() throws InterruptedException, IOException {
        frutas();
    }
}
