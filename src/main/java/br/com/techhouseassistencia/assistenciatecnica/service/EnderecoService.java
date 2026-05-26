package br.com.techhouseassistencia.assistenciatecnica.service;

import br.com.techhouseassistencia.assistenciatecnica.domain.Endereco;
import br.com.techhouseassistencia.assistenciatecnica.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> findAllEndereco(){
        return enderecoRepository.findAll();
    }

    public Endereco findByEnderecoId(Long id){
        return enderecoRepository.findById(id).orElseThrow();
    }

    public Endereco saveEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public Endereco updateEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public void deleteByEnderecoId(Long id){
        enderecoRepository.deleteById(id);
    }
}
