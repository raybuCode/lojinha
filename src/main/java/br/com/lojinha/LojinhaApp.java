package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ItemIncluso;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args){
        Produto meuProduto = new Produto("SONY", Tamanho.MEDIO);

        meuProduto.setNome("Playstation5");
        meuProduto.setValor(29.90);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle",2);
        itensInclusos.add(primeiroItemIncluso);//0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Games",3);
        itensInclusos.add(segundoItemIncluso);//1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de Energia", 1);
        itensInclusos.add(segundoItemIncluso);//2

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos().get(0).getNome());

        System.out.println("itens");

        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
        System.out.println("Acabaram os itens");
 }

}
