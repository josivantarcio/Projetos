package game;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner teclado;                // Scanner
        String[][] tabuleiro;           // Tabuleiro
        Random gerador = new Random();  // Gerador randômico

        int
            tamanho,        // Tamanho do tabuleiro
            qtEmbarcacoes,  // Quantidade total de embarcações
            xA,             // X (Linha) Aleatória
            yA,             // Y (Coluna) Aleatória
            x,              // X (Linha) Digitado pelo usuário
            y;              // Y (Coluna) Digitado pelo usuário

        boolean haEmbarcacoes = true; // Há embarcações a serem atiradas?

        // Tamanhos permitidos (5, 10 e 15)
        ArrayList<Integer> tamanhos = new ArrayList<>(Arrays.asList(5, 10, 15));

        // Título
        System.out.println("=================================================");
        System.out.println("================= BATALHA NAVAL =================");
        System.out.println("=================================================\n");

        // Faça...
        do{
            // Instancia um novo Scanner
            teclado = new Scanner(System.in);

            // Pede o tamanho do Tabuleiro
            System.out.print("TAMANHO DO TABULEIRO ( ");

            // Informa os tamanhos disponiveis
            for(int t:tamanhos){
                System.out.print(t+" ");
            }

            System.out.print("): ");

            // Lê o teclado
            tamanho = teclado.nextInt();
        }while(tamanhos.indexOf(tamanho) == -1); // ...Enquanto o valor digitado não for permitido

        // Cria um tabuleiro de dimensões <tamanho> x <tamanho>
        tabuleiro = new String[tamanho][tamanho];

        // Define a quantidade de embarcações. (O mesmo que o tamanho)
        qtEmbarcacoes = tamanho;

        // Enquanto houver embarcações...
        while(qtEmbarcacoes > 0){
            xA = gerador.nextInt(tamanho - 1);  // X Aleatório
            yA = gerador.nextInt(tamanho - 1);  // Y Aleatório

            // Se esta coordenada estiver vazia...
            if(tabuleiro[xA][yA] == null){
                tabuleiro[xA][yA] = "o";    // Grava uma embarcação
                qtEmbarcacoes--;            // Remove uma embarcação
            }
        }

        // Faça...
        do{

            System.out.print("=================================================\n\t");

            // Imprime o Tabuleiro com as coordenadas fechadas, abertas e com embarcações.
            for(int h = 0; h < tabuleiro.length; h++){
                System.out.print(h+"\t");
            }

            for(int i = 0; i < tabuleiro.length; i++){
                if(i == 0){
                    System.out.print("\n "+i+"\t");

                }else{
                    System.out.print(" "+i+"\t");
                }

                for(int j = 0; j < tabuleiro.length; j++){
                    if(Objects.equals(tabuleiro[i][j], "O") || Objects.equals(tabuleiro[i][j], "X")){
                        System.out.print(tabuleiro[i][j]+" \t");
                    }else{
                        System.out.print("~\t");
                    }

                    if(j == tabuleiro.length - 1){
                        System.out.print("\n");
                    }
                }
            }   // Fim impressão

            // Lê a linha
            System.out.print("\nDigite a linha: ");
            x = teclado.nextInt();

            // Lê a coluna
            System.out.print("Digite a coluna: ");
            y = teclado.nextInt();

            // Se as cordenadas forem válidas...
            if(x >= 0 && x < tabuleiro.length && y >= 0 && y < tabuleiro.length){
                // Se a coordenada estiver vazia...
                if(null == tabuleiro[x][y]){
                    tabuleiro[x][y] = "X";  // Tiro na água.
                }else{ // Se não
                    // Se houver uma embarcação...
                    if(tabuleiro[x][y] == "o"){
                        tabuleiro[x][y] = "O"; // Mostra a embarcação.
                        qtEmbarcacoes++;       // Adiciona uma embarcação. (Reutilizando a variável)
                    }else{ // Se não...
                        System.out.println("Você já jogou aqui.");
                    } // Fim Se

                    // Se todas as embarcações forem encontradas...
                    if(qtEmbarcacoes == tamanho){
                        // Sai do Loop e acaba o jogo.
                        haEmbarcacoes = false;
                    }
                } // Fim Se
            }else{ // Se não...
                System.out.println("Coordenadas inválidas!");
            }// Fim Se

            System.out.print("\n");
        }while(haEmbarcacoes); // Enquanto houver embarcações escondidas

        // Acaba o Jogo
        System.out.println("=================================================");
        System.out.println("Todas as embarcações foram encontradas.");
        System.out.println("\t\t\t Fim de Jogo!");
    }
}
