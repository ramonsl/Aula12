import java.util.Objects;
import java.util.Scanner;

public class ContaCorrente {

   private Cliente titular;
    private double Saldo;
    private double limite;
    private int numeroConta;

    public ContaCorrente(){
        System.out.println("Criando Conta");
    }

    public ContaCorrente(Cliente titular){
        System.out.println("Criando Conta");
    }

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o  numero:");
        this.setNumeroConta(tc.nextInt());
        System.out.println("Digite o  saldo inicial:");
        this.setSaldo(tc.nextDouble());
        Cliente titular= new Cliente();
        titular.ler();
        this.setTitular(titular);
        if(this.getTitular().getIdade()>60){
            this.setLimite(300);
        }else{
            this.setLimite(200);
        }

    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente that = (ContaCorrente) o;
        return numeroConta == that.numeroConta &&
                Objects.equals(titular, that.titular);
    }

    public void mostraSaldo(){
        System.out.println("Seu saldo é: "+this.getSaldo());
    }
    public boolean sacar(double valor){
        if(this.getLimite()+this.getSaldo()>valor){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "titular=" + titular +
                ", Saldo=" + Saldo +
                ", limite=" + limite +
                ", numeroConta=" + numeroConta +
                '}';
    }
}
