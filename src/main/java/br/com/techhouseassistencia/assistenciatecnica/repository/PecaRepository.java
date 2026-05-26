package br.com.techhouseassistencia.assistenciatecnica.repository;

import br.com.techhouseassistencia.assistenciatecnica.domain.Peca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PecaRepository extends JpaRepository<Peca, Long> {
}
