/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoacme;

import br.com.bancoacme.modelo.Conta;
import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Principal {

    private static Conta contaJoao;
    private static Scanner teclado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conta do João Bacamarte Silva
        contaJoao = new Conta("1234-5",
                "João Bacamarte Silva", "******",
                0.00, 100.00);

        //Mostrar tela de acesso
        login();
    }

    public static void login() {
        boolean liberaAcesso = false;
        teclado = new Scanner(System.in);
        String numConta = null, senhaConta = null;
        while (!liberaAcesso) {
            System.out.println("====== Banco Acme ======");
            System.out.println("========================");
            System.out.print("Informe o nº da conta: ");
            numConta = teclado.next();
            System.out.print("Informe a senha: ");
            senhaConta = teclado.next();
            liberaAcesso = contaJoao.acessar(numConta, senhaConta);
            if (!liberaAcesso) {
                System.out.println("Número da conta ou senha incorreta.");
            }
        }
        mostrarMenu();
    }

    public static void mostrarMenu() {
        teclado = new Scanner(System.in);
        int opcao = -1;
        while (opcao == -1 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
            System.out.println("====== Banco Acme ======");
            System.out.println("==== Menu Principal ====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();
        }
        selecionarMenu(opcao);
    }

    public static void selecionarMenu(int opcao) {
        teclado = new Scanner(System.in);
        switch (opcao) {
            case 1: {
                System.out.print("Informe o valor do depósito: ");
                contaJoao.depositar(teclado.nextDouble());
                System.out.println("Depósito realizado com sucesso!");
                System.out.println("========================");
                System.out.println("Seu novo saldo é " + contaJoao.verSaldo());
                System.out.println("");
                System.out.println("");
                mostrarMenu();
            }
            case 2: {
                System.out.print("Informe o valor do saque: ");
                if (contaJoao.sacar(teclado.nextDouble())) {
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("========================");
                    System.out.println("Seu novo saldo é " + contaJoao.verSaldo());
                    System.out.println("");
                    System.out.println("");
                    mostrarMenu();
                }else{
                    System.out.println("Saldo indisponível!");
                    mostrarMenu();
                }
            }
            case 3:{
                System.out.println("========================");
                System.out.println("O seu saldo atual é " + contaJoao.verSaldo());
                System.out.println("");
                System.out.println("");
                mostrarMenu();
            }
            case 4:{
                login();
            }
        }
    }

}
