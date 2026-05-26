package br.com.techhouseassistencia.assistenciatecnica.dto.Response;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.StatusAgendamento;

import java.time.LocalDateTime;

public record AgendamentoResumoResponseDTO(
       LocalDateTime dataHora,
       String nomeTecnico,
       StatusAgendamento statusAgendamento,
       String observacoes
) {
}
