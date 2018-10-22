import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    private String CPF;
    private String nome;
    private int idade;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(CPF, cliente.CPF);
    }



    public void ler(){
        Scanner tc =new Scanner(System.in) ;
        System.out.println("Digite CPF");
        this.setCPF(tc.next()  );
        System.out.println("Digite NOME");
        this.setNome(tc.next());
        System.out.println("Digite IDADE");
        this.setIdade(tc.nextInt());

    }
    public void mostrar(){
        System.out.println(this.nome);
        System.out.println(this.CPF);
        System.out.println(this.idade);
    }

    @Override
    public String toString() {
        return "Cliente -" +
                "CPF='" + CPF + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '-';
    }
}
