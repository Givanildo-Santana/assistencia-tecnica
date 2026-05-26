package br.com.techhouseassistencia.assistenciatecnica.dto.Request;

public record OrdemServicoRequestDTO(
        Long clienteId,
        Long agendamentoId,
        Long tecnicoId,
        Long equipamentoId
) {
}
