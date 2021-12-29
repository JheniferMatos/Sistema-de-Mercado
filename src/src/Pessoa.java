

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Pessoa implements Valida {
    //Atributos
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String celular;

    //scanner
    Scanner sc = new Scanner(System.in);
    //Construtor
    public Pessoa(String nome, String cpf, Endereco endereco, String celular){
        this.nome = nome;
        this.endereco = endereco;
        this.celular = celular;
        while(validar(cpf) == false) {
            solicitarNovo();
            //System.err.println("O CPF está incorreto, digite um CPF válido: ");
            //cpf = sc.nextLine();
            validar(cpf);
        }
        this.cpf = cpf;
    }
    
   
    @Override
    public boolean validar(String cpf) {
        cpf = cpf.replace("-", "");
        cpf = cpf.replace(".", "");
        if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
        cpf.equals("22222222222") || cpf.equals("33333333333") ||
        cpf.equals("44444444444") || cpf.equals("55555555555") ||
        cpf.equals("66666666666") || cpf.equals("77777777777") ||
        cpf.equals("88888888888") || cpf.equals("99999999999") ||
        cpf.equals("12345678910") || (cpf.length() != 11))
        return false; 

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            // Calculo do 1o. Digito Verificador
                sm = 0;
                peso = 10;
                for (i=0; i<9; i++) {
            // converte o i-esimo caractere do CPF em um numero:
            // por exemplo, transforma o caractere '0' no inteiro 0
            // (48 eh a posicao de '0' na tabela ASCII)
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
                }
    
                r = 11 - (sm % 11);
                if ((r == 10) || (r == 11))
                    dig10 = '0';
                else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
    
            // Calculo do 2o. Digito Verificador
                sm = 0;
                peso = 11;
                for(i=0; i<10; i++) {
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
                }

                r = 11 - (sm % 11);
                if ((r == 10) || (r == 11))
                 dig11 = '0';
                else dig11 = (char)(r + 48);

            // Verifica se os digitos calculados conferem com os digitos informados.
                if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                    return(true);
                else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        
    }

    //Validar cpf
    @Override
    public void solicitarNovo() {
        System.err.println("Digite um CPF válido");
        this.cpf = sc.nextLine();
        //validar(cpf);
    }

    //Getters e setters
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return Endereco return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return String return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

}
