package desordem;
//https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int entrada1 = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int entrada2 = terminal.nextInt();

        try {
            contar(entrada1, entrada2);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
        terminal.close();
    }
    static void contar(int entradaA, int entradaB) throws ParametrosInvalidosException {
        if (entradaA > entradaB) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }


        int contagem = entradaA + entradaB;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
