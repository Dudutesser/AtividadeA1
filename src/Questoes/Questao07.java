package Questoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao07 extends Exec{
    public void loja() {
        Scanner ler = new Scanner(System.in);
        Integer opcao = 0;
        Double valor;
        String valorstring = "a";
        System.out.println("Digite o valor total gasto na loja: ");
        valor = ler.nextDouble();
        opcao = menu(ler, valor, opcao);
        if (opcao == 1) {
            valor = avista(valor);
            valorstring = "A vista";
        } else if (opcao == 2) {
            valor = parce2x(valor);
            valorstring = "Parcelado em duas vezes";
        } else if (opcao == 3) {
            valor = parce3x(valor);
            valorstring = "Parcelado em três vezes";
        } else if (opcao == 4) {
            valor = parce4x(valor);
            valorstring = "Parcelado em quatro vezes";
        } else if (opcao == 5) {
            valor = parce5x(valor);
            valorstring = "Parcelado em cinco vezes";
        } else if (opcao == 6) {
            valor = parce6x(valor);
            valorstring = "Parcelado em seis vezes";
        } else if (opcao == 7) {
            valor = parce7x(valor);
            valorstring = "Parcelado em sete vezes";
        } else if (opcao == 8) {
            valor = parce8x(valor);
            valorstring = "Parcelado em oito vezes";
        } else if (opcao == 9) {
            valor = parce9x(valor);
            valorstring = "Parcelado em nove vezes";
        } else if (opcao == 10) {
            valor = parce10x(valor);
            valorstring = "Parcelado em dez vezes";
        }
        DecimalFormat form = new DecimalFormat("00");
        String pagamento = form.format(valor);
        System.out.println("\n" + valorstring + " e o valor total é de: " + pagamento);

    }

    public Integer menu(Scanner ler, Double valor, Integer opcao) {
        System.out.println("\n1. A vista com 10% de desconto;");
        System.out.println("2. Em duas vezes (preço da etiqueta);");
        if (valor >= 100) {
            System.out.println("3. De 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$ 100,00).");
        }
        System.out.println("Selecione a forma de pagamento: ");
        int menu = ler.nextInt();
        switch (menu) {
            case 1:
                opcao = 1;
                break;
            case 2:
                opcao = 2;
                break;
            case 3:
                if (valor >= 100) {
                    Scanner m2 = new Scanner(System.in);
                    System.out.println("\nTodas as opções tem 3X de juros ao mês");
                    System.out.println("1. 3x;\n2. 4x;\n3. 5x;\n4. 6x;\n5. 7x;\n6. 8x;\n7. 9x\n8. 10x");
                    int menu2 = m2.nextInt();
                    switch (menu2) {
                        case 1:
                            opcao = 3;
                            break;
                        case 2:
                            opcao = 4;
                            break;
                        case 3:
                            opcao = 5;
                            break;
                        case 4:
                            opcao = 6;
                            break;
                        case 5:
                            opcao = 7;
                            break;
                        case 6:
                            opcao = 8;
                            break;
                        case 7:
                            opcao = 9;
                            break;
                        case 8:
                            opcao = 10;
                            break;
                        default:
                            System.out.println("Digite uma opção válida.");
                            break;
                    }
                }
                
                break;
            default:
                System.out.println("Digite uma opção válida.");
                break;
        }
        return opcao;
    }

    public Double avista(Double avista) {
        return avista -= (avista * 0.1);
    }

    public Double parce2x(Double x2) {
        return x2;
    }

    public Double parce3x(Double x3) {
        for (int x = 1; x < 4; x++) {
            x3 *= 1.03;
        }
        return x3;
    }

    public Double parce4x(Double x4) {
        for (int x = 1; x < 5; x++) {
            x4 *= 1.03;
        }
        return x4;
    }

    public Double parce5x(Double x5) {
        for (int x = 1; x < 6; x++) {
            x5 *= 1.03;
        }
        return x5;
    }

    public Double parce6x(Double x6) {
        for (int x = 1; x < 7; x++) {
            x6 *= 1.03;
        }
        return x6;
    }

    public Double parce7x(Double x7) {
        for (int x = 1; x < 8; x++) {
            x7 *= 1.03;
        }
        return x7;
    }

    public Double parce8x(Double x8) {
        for (int x = 1; x < 9; x++) {
            x8 *= 1.03;
        }
        return x8;
    }

    public Double parce9x(Double x9) {
        for (int x = 1; x < 10; x++) {
            x9 *= 1.03;
        }
        return x9;
    }

    public Double parce10x(Double x10) {
        for (int x = 1; x < 11; x++) {
            x10 *= 1.03;
        }
        return x10;
    }

    @Override
    public void Executar() {
        loja();
    }
}
