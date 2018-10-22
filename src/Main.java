public class Main {

    public static void main(String[] args) {
        ContaCorrente douglas= new ContaCorrente();
        douglas.ler();
        ContaCorrente julia = new ContaCorrente();
        julia.ler();

        if(douglas.sacar(1000)){
            douglas.mostraSaldo();
        }else{
            System.out.println("Opa, pegue um emprestimo na FACTA");
        }

       if (julia.sacar(500)){
           System.out.println(julia.toString());
       }else{
           System.out.println("OPS");
       }

    }
}
