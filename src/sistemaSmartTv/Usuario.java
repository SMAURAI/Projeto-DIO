package sistemaSmartTv;
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Está em que canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        
    }
}
