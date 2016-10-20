package geral;

public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumero(12345);
        c1.setSenha(666);
        
        if (c1.acessar(12345, 666)){
            System.out.println("Bem-vindo ao Banco Tabuleiro.");
        }else{
            System.out.println("Não foi possível acessar a conta.");
        }
    }
}
