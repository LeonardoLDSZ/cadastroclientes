package br.com.ldsz.cadastroclientes.service;

import br.com.ldsz.cadastroclientes.entity.Cliente;
import br.com.ldsz.cadastroclientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    //Salvar/Alterar clientes
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    //Listar clientes
    public List<Cliente> listaCliente() {
        return clienteRepository.findAll();
    }

    //Buscar cliente
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    //Deletar cliente
    public void removerPorId(Long id) {
        clienteRepository.deleteById(id);
    }
}

