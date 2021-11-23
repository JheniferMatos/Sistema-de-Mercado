package Classes;

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
        return "Nome: " + getNome() + "\n CPF: " + getCpf() + "\n Celular: " + getCelular() + "\n Função: " + this.funcao + "\n Salário: R$" + this.salario;
    }
}
