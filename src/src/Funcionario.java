

public class Funcionario extends Pessoa {
    private float salario;
    private String funcao;

    public Funcionario(String nome, String cpf, Endereco endereco, String celular, float salario, String funcao) {
        super(nome, cpf, endereco, celular);
        this.salario = salario;
        this.funcao = funcao;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nCelular: " + getCelular() + "\nFunção: " + this.funcao + "\nSalário: R$" + this.salario;
    }
}
