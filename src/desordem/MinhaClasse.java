package desordem;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Samuel";
        String segundoNome = "Carvalho";

        String nomeCompleto = metodoUm(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String metodoUm(String primeiroNome, String segundoNome){
        return primeiroNome + " " + segundoNome;
    }
}
