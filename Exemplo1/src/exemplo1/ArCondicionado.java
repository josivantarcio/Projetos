/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

/**
 *
 * @author Renato
 */
public class ArCondicionado {
    private boolean ligado;
    private int velocidade;
    private double temperatura;
    private boolean oscilando;
    
    //Método de acesso GETTER/SETTER
    public void setLigado(boolean valor){
        this.ligado = valor;
    }
    
    public boolean getLigado(){
        return this.ligado;
    }
    
    public void setVelocidade(int valor){
        this.velocidade = valor;
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    public void setTemperatura(double valor){
        this.temperatura = valor;
    }
    
    public double getTemperatura(){
        return this.temperatura;
    }
    
    public void setOscilando(boolean valor){
        this.oscilando = valor;
    }
    
    public boolean getOscilando(){
        return this.oscilando;
    }
    
}
