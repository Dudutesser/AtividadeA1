package Questoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao10 extends Exec{
    public void taxa() {
        Scanner ler = new Scanner(System.in);
        Double salfun = 0.00;
        Double salmin = 0.00;
        Double dependentes = 0.00;
        Double taxanormal = 0.00;
        Double ir = 0.00;
        Double taxamais = 0.00;
        Double totalimposto = 0.00;
        System.out.println("Digite o valor do seu salário bruto:");
        salfun = ler.nextDouble();
        System.out.println("Digite qual o valor do salário mínimo:");
        salmin = ler.nextDouble();
        System.out.println("Digite a quantidade de dependentes que você possui:");
        dependentes = ler.nextDouble();
        System.out.println("Digite quanto já foi descontado do seu salário:");
        taxanormal = ler.nextDouble();
        dependentes *= 189.59;
        salfun -= dependentes;
        ir = ir(salfun, salmin);
        taxamais = taxamais(ir);
        totalimposto = ir + taxamais - taxanormal;
        DecimalFormat form = new DecimalFormat("0.00");
        String irrf = form.format(ir);
        String taxam = form.format(taxamais);
        String totalimp = form.format(totalimposto);
        System.out.println("O imposto bruto é de: R$" + irrf);
        System.out.println("A taxa adicional é de: R$" + taxam);
        System.out.println("E o imposto  a pagar é de: R$" + totalimp);
    }

    public Double ir(Double salfun, Double salmin) {
        if (salfun > salmin * 12) {
            return salfun * 0.2;
        } else if (salfun > salmin * 5) {
            return salfun * 0.08;
        } else {
            return 0.00;
        }
    }

    public Double taxamais(Double ir) {
        return ir * 0.04;
    }

    @Override
    public void Executar() {
        taxa();
    }
}
