package br.com.ldsz.cadastroclientes.repository;

import br.com.ldsz.cadastroclientes.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
}
