package br.com.ldsz.cadastroclientes.service;

import br.com.ldsz.cadastroclientes.entity.Produto;
import br.com.ldsz.cadastroclientes.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> listaProduto(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id){
        return produtoRepository.findById(id);
    }

    public void removerPorId(Long id){
        produtoRepository.deleteById(id);
    }
}
