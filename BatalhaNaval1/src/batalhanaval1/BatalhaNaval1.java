/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval1;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class BatalhaNaval1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] tabuleiro = new String[5][5];
        int cont = 1, linha = 0, coluna = 0;
        int tentativas = 5, acertos = 0;
        long posEmbarcacao = -1;
        boolean addEmbarcacao = false;
        Scanner dado;
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                tabuleiro[i][j] = String.valueOf(cont);
                cont++;                
            }
        }
        
        for (int i = 0; i < 5; i++){
            posEmbarcacao = Math.round(Math.random()*25);
            addEmbarcacao = false;
            for (int j = 0; j < tabuleiro.length;j++){
                for (int x = 0; x < tabuleiro.length; x++){
                    if (tabuleiro[j][x].equals(String.valueOf(posEmbarcacao))){
                        tabuleiro[j][x] = "*";
                        addEmbarcacao = true;
                        break;
                    }
                }
                if (addEmbarcacao){
                    break;
                }
            }
        }
        
        for (int i = 0; i < tentativas; i++){
            dado = new Scanner(System.in);                 
            System.out.print("Linha: ");
            linha = dado.nextInt();
            System.out.print("Coluna: ");
            coluna = dado.nextInt();
            if (tabuleiro[linha][coluna].equals("*")){
                acertos++;
                System.out.println("Fogo!");
            }else{
                System.out.println("Água!");
            }
        }
        
        System.out.println("Número de acertos: " + acertos);
    }
    
}
