

public class Produto {
    private String nomeProduto;
    private float valor;
    private Fornecedor fornecedor;

    public Produto(String nomeProduto, float valor, Fornecedor fornecedor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public int compareTo(Produto prod) {
        return (int) (this.getValor() - prod.getValor());
    }

    @Override
    public String toString() {
        return "Nome: " + this.nomeProduto + "\n Preço: R$" + this.valor;
    }

    /**
     * @return String return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return float return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return Fornecedor return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
