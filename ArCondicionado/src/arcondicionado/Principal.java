package arcondicionado;

public class Principal {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ControleRemoto controle = new ControleRemoto();
        
        System.out.println("Temp. do Controle: " + controle.visualizar());
        System.out.println("Temp. do Ar Condicionado: " + ar.visualizar());
        controle.aumentarTemperatura();
        System.out.println(controle.visualizar());
        ar.aumentarTemperatura(controle.visualizar());
        System.out.println(ar.visualizar());
    }
}
