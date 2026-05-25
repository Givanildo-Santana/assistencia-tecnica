package br.com.techhouseassistencia.assistenciatecnica.repository;

import br.com.techhouseassistencia.assistenciatecnica.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
