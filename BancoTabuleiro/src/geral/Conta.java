
package geral;

public class Conta {
    private int numero;
    private int senha;
    private double saldo;
    private Titular titular;

    /**
     * @return Retorna o número da conta.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param atribui o número da conta
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the titular
     */
    public Titular getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    public boolean acessar(int numero, int senha){
        if (this.numero == numero && this.senha == senha){
            return true;
        }else{
            return false;
        }
    }
    
        
}
