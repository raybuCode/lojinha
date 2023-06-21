package br.com.lojinha.pojo;
// CLASSE DO ITEM ADICIONAL
public class ItemIncluso {
    private String nome;
    private int quantidade;

    public ItemIncluso(String nomeInicial, int quantidadeInicial){
        this.nome = nomeInicial;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}// CLASSE DO ITEM INCLUSO

