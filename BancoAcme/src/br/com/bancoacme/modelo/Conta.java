/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancoacme.modelo;

/**
 *
 * @author Renato
 */
public class Conta {
    private String numero;
    private String nome_titular;
    private String senha;
    private Double saldo;
    private Double limite;

    public Conta() {
    }

    public Conta(String numero, String nome_titular, String senha, Double saldo, Double limite) {
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.senha = senha;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }
    
    public boolean sacar(Double valor){
        if ((this.saldo+this.limite)>=valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
    public Double verSaldo(){
        return this.saldo + this.limite;
    }
    
    public boolean acessar(String numero, String senha){
        if (this.numero.equals(numero) && 
                this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }
}
