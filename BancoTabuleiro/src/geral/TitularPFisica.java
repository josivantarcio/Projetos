package geral;

public class TitularPFisica extends Titular{
    private String cpf;
    
    public TitularPFisica(){}
    
    public TitularPFisica(int id){
        super.setId(id);
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
}
