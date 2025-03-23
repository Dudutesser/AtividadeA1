import java.util.Scanner;

import Questoes.Questao01;
import Questoes.Questao02;
import Questoes.Questao03;
import Questoes.Questao04;
import Questoes.Questao05;
import Questoes.Questao06;
import Questoes.Questao07;
import Questoes.Questao08;
import Questoes.Questao09;
// import Questoes.Questao10;

public class App {
    public static void main(String[] args) throws Exception {
        int x;
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
        Scanner mudar = new Scanner(System.in);
        do {
            pb.inheritIO().start().waitFor();
            System.out.println("Selecione a pasta que deseja executar: ");
            System.out.println("1. Numero maior;\n2. Retangulo maior;\n3. Transformar temperatura;\n4. Separar alunos;\n5. Preço das frutas;");
            System.out.println("6. Jogo;\n7. Compra na loja;\n8. Modificação do carro;\n9. Conta de água;\n10. Taxa;\n0. Sair.\n");
            x = mudar.nextInt();
            mudar.nextLine();
            switch (x) {
                case 1:
                    pb.inheritIO().start().waitFor();
                    Questao01 q1 = new Questao01();
                    q1.Executar();
                    enter();
                    break;
                case 2:
                    pb.inheritIO().start().waitFor();
                    new Questao02().Executar();
                    enter();
                    break;
                case 3:
                    pb.inheritIO().start().waitFor();
                    new Questao03().Executar();
                    enter();
                    break;
                case 4:
                    pb.inheritIO().start().waitFor();
                    new Questao04().Executar();
                    enter();
                    break;
                case 5:
                    pb.inheritIO().start().waitFor();
                    new Questao05().Executar();
                    enter();
                    break;
                case 6:
                    pb.inheritIO().start().waitFor();
                    new Questao06().Executar();;
                    enter();
                    break;
                case 7:
                    pb.inheritIO().start().waitFor();
                    new Questao07().Executar();
                    enter();
                    break;
                case 8:
                    pb.inheritIO().start().waitFor();
                    new Questao08().Executar();
                    enter();
                    break;
                case 9:
                    pb.inheritIO().start().waitFor();
                    new Questao09().Executar();
                    enter();
                    break;
                // case 10:
                //     pb.inheritIO().start().waitFor();
                //     new Questao10().Executar();
                    // enter();
                    // break;
                case 0:
                    System.out.println("Saindo...");
                        break;
                default:
                    pb.inheritIO().start().waitFor();
                    System.out.println(x + " não é uma opção, escolha uma opção válida!");
                    enter();
                        break;
            }
        } while (x != 0);
        mudar.close();
    }

    static void enter() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Pressione enter para continuar...");
        enter.nextLine();
    }
}
