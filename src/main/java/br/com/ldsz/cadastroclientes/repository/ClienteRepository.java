package br.com.ldsz.cadastroclientes.repository;

import br.com.ldsz.cadastroclientes.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}
