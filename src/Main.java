import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ContaCorrente douglas= new ContaCorrente();
        douglas.ler();
        ContaCorrente julia = new ContaCorrente();
        julia.ler();

        ArrayList<ContaCorrente> banco= new ArrayList<>();

        banco.add(douglas);
        banco.add(0,julia);
        banco.remove(douglas);
        banco.remove(0);
        banco.size();
        banco.contains(julia);
        banco.indexOf(julia);
        banco.isEmpty();
        banco.get(0);

    }
}
