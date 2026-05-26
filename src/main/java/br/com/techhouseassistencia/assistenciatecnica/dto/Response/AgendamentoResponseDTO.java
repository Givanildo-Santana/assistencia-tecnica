    package br.com.techhouseassistencia.assistenciatecnica.dto.Response;

    import br.com.techhouseassistencia.assistenciatecnica.domain.enums.StatusAgendamento;

    import java.time.LocalDateTime;

    public record AgendamentoResponseDTO(
            String numeroOrdemServico,
            ClienteResponseDTO cliente,
            String nomeTecnico,
            LocalDateTime agendamentoDataHora,
            StatusAgendamento statusAgendamento,
            String observacoes
    ) {
    }
