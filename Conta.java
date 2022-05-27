package br.edu.ifpb;

public class Conta {
    private int número;
    String titular;
    private double saldo;

    public Conta()
    {
        número = 1;
        titular= "--- sem nome ---";
        depositar(1.00);
    }

    public Conta(int num, String nome, double quantia)
    {
        número = num;
        titular = nome;
        depositar( quantia );
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNúmero(int novoNúmero) {
        if(novoNúmero> 0 )
            número = novoNúmero;
    }

    public int getNúmero() {
        return número;
    }

    boolean sacar(double quantia){
        if (quantia> 0 && quantia <= saldo) {
            saldo -= quantia;
            return true;
        }
        return false;
    }
    boolean depositar(double quantia){
        if (quantia<0) return false;
        saldo += quantia;
        return  true;
    }
    @Override
    public String toString(){
        return
                String.format(
                        "Conta #: %d \nTitular: %s \nsaldo: %.2f", número,titular,saldo
                );
    }
}
