package br.com.techhouseassistencia.assistenciatecnica.dto.Response;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.StatusOS;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record OrdemServicoResponseDTO(
       Long ordemServicoId,
       String numero,
       ClienteResponseDTO cliente,
       List<AgendamentoResumoResponseDTO> agendamentos,
       EquipamentoResponseDTO equipamento,
       LocalDateTime dataAbertura,
       LocalDateTime dataFechamento,
       StatusOS statusOS,
       String diagnostico,
       BigDecimal valorCobrado


) {

}
