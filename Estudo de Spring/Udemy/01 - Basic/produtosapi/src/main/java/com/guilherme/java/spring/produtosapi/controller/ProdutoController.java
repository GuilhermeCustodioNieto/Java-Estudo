package com.guilherme.java.spring.produtosapi.controller;

import com.guilherme.java.spring.produtosapi.model.Produto;
import com.guilherme.java.spring.produtosapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto encontrado: " + produto);

        produto.setId(UUID.randomUUID().toString());

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null);
    }

    @GetMapping("/")
    public List<Produto> produtos(){
        return produtoRepository.findAll();
    }

    @GetMapping
    public List<Produto> buscarComParametro(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Produto update(@RequestBody Produto produtoExterno, @PathVariable("id") String id){
        Produto produtoAntigo = produtoRepository.findById(id).orElseThrow();

        produtoAntigo.setNome(produtoExterno.getNome());
        produtoAntigo.setDescricao(produtoExterno.getDescricao());
        produtoAntigo.setPreco(produtoExterno.getPreco());

        return produtoRepository.save(produtoAntigo);

    }
}
