package br.edu.ifpb;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> lista;

    public Banco() {
        lista = new ArrayList<>();
    }

    public int quantidadeContas() {
        return lista.size();
    }

    public boolean contaExiste(int número) {
        for (Conta c : lista) {
           if (c.getNúmero() == número)
               return true;
        }
        return false;
    }
    public boolean cadastrarConta(int num, String nome, double quantia)
    {
        if(contaExiste(num)) return false;
        Conta nova = new Conta(num, nome, quantia);
        return lista.add(nova);
    }
    public boolean removerConta(int num)
    {
        if( !contaExiste(num)) return false;
        for(Conta c: lista){
            if (c.getNúmero()==num)
                return lista.remove(c);
        }
        return false;
    }
}
