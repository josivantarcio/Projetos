/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadedados;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner dado;
        dado = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        numero = dado.nextInt();
        System.out.println("Você digitou o número: " + numero);
    }
    
}
