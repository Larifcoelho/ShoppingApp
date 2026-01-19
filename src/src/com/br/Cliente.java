package src.com.br;

public class Cliente {
    private String nome;
    private String cpf;
    private String numeroDeCartao;

    public Cliente (String nome, String cpf, String numeroDeCartao){
        this.nome = nome;
        this.cpf= cpf;
        this.numeroDeCartao = numeroDeCartao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumeroDeCartao() {
        return numeroDeCartao;
    }
}
