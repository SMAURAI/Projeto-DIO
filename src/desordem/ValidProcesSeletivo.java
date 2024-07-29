package desordem;
import java.util.concurrent.ThreadLocalRandom;
//Atribui um pacote para a classe
//package candidatura;

public class ValidProcesSeletivo {
    // Um processo seletivo possui um valor base salarial de R$ 2.000,00 e o salário pretendido pelo candidato. Em um controle de fluxo, se o valor base for maior do que o salário pretendido, imprima "Ligar para o candidato"; Se não, se o valor base for igual ao salário base pretendido, imprima "Ligar para o candidato com contra proposta"; Se não, imprima "Aguardando resultado demais candidatos".

    public static void main(String[] args){
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidatos + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
     
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado demais candidatos");
        }
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }

        //Forma abreviada de iteração for each
        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
}