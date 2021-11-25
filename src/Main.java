
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        //float valorProd = .0f, salario = .0f;

        /*
         * //trata a exceção de entrada incorreta try {
         * System.out.println("Digite o valor do produto: "); valorProd =
         * sc.nextFloat(); } catch (InputMismatchException e) {
         * System.err.println("Valor de entrada incorreto!"); } }
         */
        //6 endereços
        Endereco endereco1 = new Endereco("Avenida Martin Afonso de Souza", 122, "Monte Líbano", "Rondonópolis", "78710370");
        Endereco endereco2 = new Endereco("Rua H", 1034, "Jardim Residencial São José", "Rondonópolis", "78730818");
        Endereco endereco3 = new Endereco("Rua Diogo Podesta Albres", 134, "Morada do Paraty", "Rondonópolis", "78705435");
        Endereco endereco4 = new Endereco("Rua Leôncio da Silva Moraes", 87, "Residencial Vila Mineira", "Rondonópolis", "78721538");
        Endereco endereco5 = new Endereco("Avenida Padre Anchieta", 98, "Vila Aurora II", "Rondonópolis", "78740106");
        Endereco endereco6 = new Endereco("Rua D", 2874, "Residencial João Antônio Fagundes", "Rondonópolis", "78736144");
        
        //2 funcionários
        Funcionario funcionario1 = new Funcionario("Jhenifer Matos", "36590883076", endereco1, "(16)99859-5144", 1100, "Caixa");
        Funcionario funcionario2 = new Funcionario("Mariana Rodrigues", "84939466051", endereco2, "(41)96603-1164", 1500, "Estoquista");
        //2 clientes
        Cliente cliente1 = new Cliente("João Silva", "46991044016", endereco3, "(87)95951-5828");
        Cliente cliente2 = new Cliente("Pedro Pereira", "59294311082", endereco4, "(19)90075-3994");
        //2 Fornecedor
        Fornecedor fornecedor1 = new Fornecedor("Megafort Atacadista e Distribuidora", "MegaFort", "20544994000114", endereco5, "(80)90247-4874");
        Fornecedor fornecedor2 = new Fornecedor("Distribuidora Medeiros", "Medeiros", "88614865000199", endereco6, "(49)96745-3417");

        //10 Produtos
        Produto produto1 = new Produto("Arroz", 20, fornecedor1);
        Produto produto2 = new Produto("Feijão",8.4f, fornecedor1);
        Produto produto3 = new Produto("Ameixa", 7, fornecedor2);
        Produto produto4 = new Produto("Batata Inglesa", 3.78f, fornecedor2);
        Produto produto5 = new Produto("Arroz", 20, fornecedor1);
        Produto produto6 = new Produto("Calabresa", 27, fornecedor1);
        Produto produto7 = new Produto("Picanha", 55, fornecedor1);
        Produto produto8 = new Produto("Achocolatado", 3.5f, fornecedor1);
        Produto produto9 = new Produto("Melão", 7.90f, fornecedor2);
        Produto produto10 = new Produto("Abóbora", 10.7f, fornecedor1);

        //2 compras com 5 produtos
        Compra compra1 = new Compra(funcionario1, cliente1);
        Compra compra2 = new Compra(funcionario2, cliente2);
        //compra 1
        compra1.adicionaProduto(produto1);
        compra1.adicionaProduto(produto2);
        compra1.adicionaProduto(produto3);
        compra1.adicionaProduto(produto4);
        compra1.adicionaProduto(produto5);
        //compra 2
        compra2.adicionaProduto(produto6);
        compra2.adicionaProduto(produto7);
        compra2.adicionaProduto(produto8);
        compra2.adicionaProduto(produto9);
        compra2.adicionaProduto(produto10);

        //Imprimir compras
        compra1.listarCompra();

        

        
        sc.close();
        
    }
}
