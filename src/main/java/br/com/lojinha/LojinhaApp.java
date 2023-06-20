package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args){
        Produto meuProduto = new Produto("SONY", Tamanho.MEDIO);

        meuProduto.setNome("> Playstation5");
        meuProduto.setValor(29.90);
        List<String> itensInclusos = new ArrayList<String>();

        // fazer os itens abaixo serem objetos
        
        itensInclusos.add("2 controles");
        itensInclusos.add("3 jogos");
        itensInclusos.add("1 camera");
        meuProduto.setItensInclusos(itensInclusos);


        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getItensInclusos());
 }

}
