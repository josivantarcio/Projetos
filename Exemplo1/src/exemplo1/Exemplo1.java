/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ArCondicionado ar2 = new ArCondicionado();
        ControleRemoto cr = new ControleRemoto();
        
        cr.setLigado(true);
        cr.setTemperatura(17.0);
        cr.setVelocidade(100);
        cr.setOscilando(true);
        System.out.println("Ligando o Ar1");
        ar.setLigado(cr.getLigado());
        ar.setTemperatura(cr.getTemperatura());
        ar.setVelocidade(cr.getVelocidade());
        ar.setOscilando(cr.getOscilando());
        System.out.println("Ligando o Ar2");
        ar2.setLigado(cr.getLigado());
        ar2.setTemperatura(cr.getTemperatura());
        ar2.setVelocidade(cr.getVelocidade());
        ar2.setOscilando(cr.getOscilando());
        
        if (ar.getLigado()){
            System.out.println("Ar1");
            System.out.println("Beep, beep");
            System.out.println("Temperatura: " +
                    ar.getTemperatura());
            System.out.println("Velocidade: " +
                    ar.getVelocidade());
            System.out.println("Oscilando: " +
                    ar.getOscilando());
        }else{
            System.out.println("Beep");
        }  
        if (ar2.getLigado()){
            System.out.println("Ar2");
            System.out.println("Beep, beep");
            System.out.println("Temperatura: " +
                    ar2.getTemperatura());
            System.out.println("Velocidade: " +
                    ar2.getVelocidade());
            System.out.println("Oscilando: " +
                    ar2.getOscilando());
        }else{
            System.out.println("Beep");
        } 
        System.out.println("Aumentar temperatura do Ar1");
        cr.aumentarTemperatura();
        System.out.println("Resgatar a nova temperatura do Ar1");
        ar.setTemperatura(cr.getTemperatura());
        System.out.println("Nova temperatura do Ar1: " + ar.getTemperatura());
        
        System.out.println("Diminuir temperatura do Ar2");
        cr.diminuirTemperatura();
        System.out.println("Resgatar a nova temperatura do Ar2");
        ar2.setTemperatura(cr.getTemperatura());
        System.out.println("Nova temperatura do Ar2: " + ar2.getTemperatura());
    }
    
}
