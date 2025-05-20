package com.guilherme.java.spring.produtosapi.controller;

import com.guilherme.java.spring.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto encontrado: " + produto);
        return produto;
    }
}
