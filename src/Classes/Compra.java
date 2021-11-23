package Classes;
import java.util.ArrayList;

public class Compra {
    private Funcionario funcionario;
    private Cliente cliente;
    private ArrayList<Produto> produtos = new ArrayList<>();
    //contrutor
    public Compra(Funcionario funcionario, Cliente cliente) {
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    //Método para adicionar produtos na compra
    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void listarCompra() {
        float soma = 0; //variável para somar o valor das compras
        
        System.out.println("Funcionário: " + funcionario.getNome() + "\nCliente: " + cliente.getNome());
        

        for(Produto produto : produtos) {
            System.out.println(produto);
            soma += produto.getValor();
        }

        System.out.printf("Total da compra: %.2f\n", soma);
        
    }
}
