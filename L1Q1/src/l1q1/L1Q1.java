package l1q1;

import java.util.Scanner;

/**
 *
 * @author Renato
 * Faça um programa que recebe dois números,
 * calcule e mostre a subtração do primeiro número
 * pelo segundo
 */
public class L1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int a = 0, b = 0, resultado = 0;
        System.out.println("Informe um número inteiro: ");
        a = dado.nextInt();
        System.out.println("Informe um número inteiro: ");
        b = dado.nextInt();
        resultado = a - b;
        System.out.println("Resultado: " + resultado);
                
    }
    
}
