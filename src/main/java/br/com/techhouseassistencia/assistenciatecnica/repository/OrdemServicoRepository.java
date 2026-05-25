package br.com.techhouseassistencia.assistenciatecnica.repository;

import br.com.techhouseassistencia.assistenciatecnica.domain.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
}
