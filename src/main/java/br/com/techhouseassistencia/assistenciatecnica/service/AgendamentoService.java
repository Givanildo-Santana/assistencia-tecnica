package br.com.techhouseassistencia.assistenciatecnica.service;

import br.com.techhouseassistencia.assistenciatecnica.domain.Agendamento;
import br.com.techhouseassistencia.assistenciatecnica.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public List<Agendamento> findAllAgendamento(){
        return agendamentoRepository.findAll();
    }

    public Agendamento findByAgendamentoId(Long id){
        return agendamentoRepository.findById(id).orElseThrow();
    }

    public Agendamento saveAgendamento(Agendamento agendamento){
        return agendamentoRepository.save(agendamento);
    }

    public Agendamento updateAgendamento(Agendamento agendamento){
        return agendamentoRepository.save(agendamento);
    }

    public void deleteByAgendamentoId(Long id){
        agendamentoRepository.deleteById(id);
    }
}
