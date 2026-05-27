package br.com.techhouseassistencia.assistenciatecnica.repository;

import br.com.techhouseassistencia.assistenciatecnica.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Optional<Cliente> findByTelefone(String telfone);
}
