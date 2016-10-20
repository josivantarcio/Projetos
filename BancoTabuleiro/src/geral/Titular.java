
package geral;


public class Titular {
    private int id;
    private String nome;
    private String telefone;
    
    public Titular(){}
    
    public Titular(int id){
        this.id = id;
    }
    
    public Titular(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public Titular(int id, String nome, String telefone){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;        
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
