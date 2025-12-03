package com.montozo.Tarefa_ApiRest.Service;

import com.montozo.Tarefa_ApiRest.Model.Produto;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    List<Produto> listaProdutos = new ArrayList<>();

    public List<Produto> listarProduto(){
        return listaProdutos;
    }

    public Produto buscarProduto(int id){
        return listarProduto().stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionaProduto(Produto produto){
         listaProdutos.add(new Produto(produto.getId(), produto.getPreco(), produto.getNome()));
    }

    public Produto atualizarProduto(int id, Produto novoProduto){
        Produto produtoAntigo = buscarProduto(id);
        produtoAntigo.setNome(novoProduto.getNome());
        produtoAntigo.setPreco(novoProduto.getPreco());
        return produtoAntigo;
    }

    public void deletarProduto(int id) {
        listaProdutos.removeIf(c -> c.getId() == id);
    }
}
