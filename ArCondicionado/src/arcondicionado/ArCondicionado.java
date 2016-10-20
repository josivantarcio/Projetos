package arcondicionado;

public class ArCondicionado {
    private int temperatura;
    
    public ArCondicionado(){
        this.temperatura = 17;
    }
    
    public String aumentarTemperatura(int novaTemperatura){
        this.temperatura = novaTemperatura;
        return "Beep";
    }
    
    public String diminuirTemperatura(int novaTemperatura){
        this.temperatura = novaTemperatura;
        return "Beep Beep";
    }
    
    public int visualizar(){
        return this.temperatura;
    }
}
