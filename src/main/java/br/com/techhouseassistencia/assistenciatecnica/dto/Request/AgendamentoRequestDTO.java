package br.com.techhouseassistencia.assistenciatecnica.dto.Request;
import java.time.LocalDateTime;

public record AgendamentoRequestDTO(
        Long ordemServicoId,
        LocalDateTime dataHora,
        String observacoes) {
}
