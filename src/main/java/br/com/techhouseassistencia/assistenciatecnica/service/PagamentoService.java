package br.com.techhouseassistencia.assistenciatecnica.service;

import br.com.techhouseassistencia.assistenciatecnica.domain.Pagamento;
import br.com.techhouseassistencia.assistenciatecnica.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    public List<Pagamento> findAllPagamento(){
        return pagamentoRepository.findAll();
    }

    public Pagamento findByPagamentoId(Long id){
        return pagamentoRepository.findById(id).orElseThrow();
    }

    public Pagamento savePagamento(Pagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }

    public Pagamento updatePagamento(Pagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }

    public void deleteByPagamentoId(Long id){
        pagamentoRepository.deleteById(id);
    }
}
