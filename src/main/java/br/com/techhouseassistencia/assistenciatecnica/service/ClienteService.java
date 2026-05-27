package br.com.techhouseassistencia.assistenciatecnica.service;

import br.com.techhouseassistencia.assistenciatecnica.domain.Cliente;
import br.com.techhouseassistencia.assistenciatecnica.exception.ClienteJaCadastradoException;
import br.com.techhouseassistencia.assistenciatecnica.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAllCliente(){
        return clienteRepository.findAll();
    }

    public Cliente findByClienteId(Long id){
        return clienteRepository.findById(id).orElseThrow();
    }

    public Cliente saveCliente(Cliente cliente){
       Optional<Cliente> clienteCadastrado = clienteRepository.findByTelefone(cliente.getTelefone());
        if (clienteCadastrado.isPresent()){
            throw new ClienteJaCadastradoException("Cliente já possui cadastro.");
        }
        return clienteRepository.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void deleteByClienteId(Long id){
        clienteRepository.deleteById(id);
    }
}
