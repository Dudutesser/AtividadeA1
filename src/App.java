import Questoes.Questao01;
import Questoes.Questao02;
import Questoes.Questao03;
import Questoes.Questao04;



public class App {
    public static void main(String[] args) throws Exception {
        Questao01 numeromaior = new Questao01(1);
        numeromaior.Executar();
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        Questao02 retangulomaior = new Questao02(2);
        retangulomaior.Executar();
        Questao03 temperatura = new Questao03(3);
        temperatura.Executar();
        
    }
}
