package br.com.aula.cliente.service;

import br.com.aula.cliente.repository.ClienteRepository;
import br.com.aula.cliente.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public List<Cliente> listarCliente(){
        return clienteRepository.findAll();
    }
    public Optional<Cliente> buscaPorId (Long id){
        return clienteRepository.findById(id);
    }

    public void removerPorId(Long id){
        clienteRepository.deleteById(id);
    }
}
