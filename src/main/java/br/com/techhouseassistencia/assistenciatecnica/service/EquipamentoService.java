package br.com.techhouseassistencia.assistenciatecnica.service;

import br.com.techhouseassistencia.assistenciatecnica.domain.Equipamento;
import br.com.techhouseassistencia.assistenciatecnica.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipamentoService {

    @Autowired
    private EquipamentoRepository equipamentoRepository;

    public List<Equipamento> findAllEquipamento(){
        return equipamentoRepository.findAll();
    }

    public Equipamento findByEquipamentoId(Long id){
        return equipamentoRepository.findById(id).orElseThrow();
    }

    public Equipamento saveEquipamento(Equipamento equipamento){
        return equipamentoRepository.save(equipamento);
    }

    public Equipamento updateEquipamento(Equipamento equipamento){
        return equipamentoRepository.save(equipamento);
    }

    public void deleteByEquipamentoId(Long id){
        equipamentoRepository.deleteById(id);
    }

}
