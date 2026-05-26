package br.com.techhouseassistencia.assistenciatecnica.service;

import br.com.techhouseassistencia.assistenciatecnica.domain.OrdemServico;
import br.com.techhouseassistencia.assistenciatecnica.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    public List<OrdemServico> findAllOrdemServico(){
        return ordemServicoRepository.findAll();
    }

    public OrdemServico findByOrdemServicoId(Long id){
        return ordemServicoRepository.findById(id).orElseThrow();
    }

    public OrdemServico saveOrdemServico(OrdemServico ordemServico){
        return ordemServicoRepository.save(ordemServico);
    }

    public OrdemServico updateOrdemServico(OrdemServico ordemServico){
        return ordemServicoRepository.save(ordemServico);
    }

    public void deleteByOrdemServicoId(Long id){
        ordemServicoRepository.deleteById(id);
    }

}
