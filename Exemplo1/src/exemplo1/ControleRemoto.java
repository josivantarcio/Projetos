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
public class ControleRemoto {
    private boolean ligado;
    private double temperatura;
    private int velocidade;
    private boolean oscilando;

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean getOscilando() {
        return oscilando;
    }

    public void setOscilando(boolean oscilando) {
        this.oscilando = oscilando;
    }
    
    public void aumentarTemperatura(){
        this.temperatura += 1;
    }
    
    public void diminuirTemperatura(){
        this.temperatura -= 1;
    }
    
}
