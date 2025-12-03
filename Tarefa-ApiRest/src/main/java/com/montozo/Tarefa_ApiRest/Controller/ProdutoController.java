package com.montozo.Tarefa_ApiRest.Controller;

import com.montozo.Tarefa_ApiRest.Model.Produto;
import com.montozo.Tarefa_ApiRest.Service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(final ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/produto")
    public ResponseEntity<List<Produto>> listarProdutos(){
        List<Produto> produtos = produtoService.listarProduto();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/produto/{id}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable int id){
        Produto produto = produtoService.buscarProduto(id);
        return ResponseEntity.ok(produto);
    }

    @PostMapping("/produto")
    public ResponseEntity<String> adicionaProduto(@RequestBody Produto produto){
        produtoService.adicionaProduto(produto);
        return ResponseEntity.ok("Produto Adicionado!");
    }

    @PatchMapping("/produto/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Integer id , @RequestBody Produto produtoNovo){
        return ResponseEntity.ok(produtoService.atualizarProduto(id , produtoNovo));
    }

    @DeleteMapping("/produto/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Integer id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }
}
