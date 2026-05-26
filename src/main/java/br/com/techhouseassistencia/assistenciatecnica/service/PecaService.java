package br.com.techhouseassistencia.assistenciatecnica.service;

import br.com.techhouseassistencia.assistenciatecnica.domain.Peca;
import br.com.techhouseassistencia.assistenciatecnica.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PecaService {

    @Autowired
    private PecaRepository pecaRepository;

    public List<Peca> findAllPeca(){
        return pecaRepository.findAll();
    }

    public Peca findByPecaId(Long id){
        return pecaRepository.findById(id).orElseThrow();
    }

    public Peca savePeca(Peca peca){
        return pecaRepository.save(peca);
    }

    public Peca updatePeca(Peca peca){
        return pecaRepository.save(peca);
    }

    public void deleteByPecaId(Long id){
        pecaRepository.deleteById(id);
    }
}
