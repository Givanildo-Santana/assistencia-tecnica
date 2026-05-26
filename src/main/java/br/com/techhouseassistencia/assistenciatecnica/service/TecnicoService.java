package br.com.techhouseassistencia.assistenciatecnica.service;

import br.com.techhouseassistencia.assistenciatecnica.domain.Tecnico;
import br.com.techhouseassistencia.assistenciatecnica.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    public List<Tecnico> findAllTecnico(){
      return tecnicoRepository.findAll();
    }

    public Tecnico findByTecnicoId(Long id){
        return tecnicoRepository.findById(id).orElseThrow();
    }

    public Tecnico saveTecnico(Tecnico tecnico){
        return tecnicoRepository.save(tecnico);
    }

    public Tecnico updateTecnico(Tecnico tecnico){
        return tecnicoRepository.save(tecnico);
    }

    public void deleteByTecnicoId(Long id){
        tecnicoRepository.deleteById(id);
    }
}
