package br.com.techhouseassistencia.assistenciatecnica.repository;

import br.com.techhouseassistencia.assistenciatecnica.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
