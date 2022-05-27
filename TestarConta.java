package br.edu.ifpb;

public class TestarConta {
    public static void main(String[] args){
        //Banco
        Banco b = new Banco();
        System.out.println("b.quantidadeContas = " + b.quantidadeContas());

        boolean existe = b.contaExiste(995);
        System.out.println("Conta existe? = " + existe ) ;

        b.cadastrarConta(995, "Ana", 123.45);
        b.cadastrarConta(400, "Pedro", 1200.53);
        b.cadastrarConta(400, "Pedro", 1200.53);
        b.cadastrarConta(100, "Carlos", 458.85);

        System.out.println("b.quantidadeConta() = " + b.quantidadeContas());

        System.out.println("Conta 100 existe? = " + b.contaExiste(100));
        b.removerConta(100);
        System.out.println("Conta 100 existe? = " + b.contaExiste(100) ) ;


        /*
        Conta cAna = new Conta();
        //cAna.número = 223;
        cAna.setNúmero(223);
        cAna.setNúmero(-9);//proteger
        cAna.titular = "Ana Silva";

        cAna.depositar(123.99);
        cAna.sacar(100.0);
        System.out.println(cAna);

        Conta cPedro = new Conta();
        cPedro.titular = "Pedro Maia";
        //cPedro.número = 995;
        cPedro.setNúmero(995);

        cPedro.depositar(5000);
        System.out.println(cPedro);
         */


    }
}
