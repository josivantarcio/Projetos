package arcondicionado;

public class ControleRemoto {
    private int temperatura;
    
    public ControleRemoto(){
        this.temperatura = 17;
    }
    
    public int aumentarTemperatura(){
        return this.temperatura++;
    }
    
    public int diminuirTemperatura(){
        return this.temperatura--;
    }
    
    public int visualizar(){
        return this.temperatura;
    }
}
