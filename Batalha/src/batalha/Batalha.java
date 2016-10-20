/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Batalha {

    public static Scanner dado;
    public static String[][] tabuleiro;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        int opc_menu = -1;
        dado = new Scanner(System.in);
        while (opc_menu == -1) {
            System.out.println("1 - Jogar");
            System.out.println("2 - Sair");
            opc_menu = dado.nextInt();
            if (opc_menu == 1) {
                escolherTabuleiro();
                mostrarTabuleiro();
            } else {
                System.out.println("Jogo encerrado.");
                opc_menu = 0;
                System.exit(0);
            }
        }
    }

    public static void escolherTabuleiro() {
        int tamTabuleiro = -1;
        dado = new Scanner(System.in);
        while (tamTabuleiro == -1) {
            System.out.println("Informe o tamanho do tabuleiro");
            System.out.println("1 - 5x5");
            System.out.println("2 - 10x10");
            System.out.println("3 - 15x15");
            System.out.println("4 - Sair");
            tamTabuleiro = dado.nextInt();
            switch (tamTabuleiro) {
                case 1: {
                    tabuleiro = new String[5][5];
                    break;
                }
                case 2: {
                    tabuleiro = new String[10][10];
                    break;
                }
                case 3: {
                    tabuleiro = new String[15][15];
                    break;
                }
                case 4: {
                    mostrarMenu();
                    break;
                }
                default: {
                    tamTabuleiro = -1;
                    break;
                }
            }
        }
    }

    public static void mostrarTabuleiro() {
        StringBuilder linha = new StringBuilder();

        for (int x = 0; x < tabuleiro.length; x++) {
            if (x == 0) {
                linha.append("- ");
                linha.append(x + " ");
            } else {
                linha.append(x + " ");
            }
        }
        System.out.println(linha);
        linha = null;
        int novaLinha = -1;
        for (int i = 0; i < tabuleiro.length; i++) {
            if (i != novaLinha){
                novaLinha = i;
                linha.append(novaLinha + " ");
            }
            for (int j = 0; j < tabuleiro.length; j++) {          
                    linha.append("~ ");
            }
            System.out.println(linha);
            linha = null;
        }
    }
}
