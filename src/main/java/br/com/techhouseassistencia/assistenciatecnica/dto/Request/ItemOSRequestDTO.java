package br.com.techhouseassistencia.assistenciatecnica.dto.Request;

import java.math.BigDecimal;

public record ItemOSRequestDTO(
        Long ordemServicoId,
        Long pecaId,
        Integer quantidade,
        BigDecimal precoCustoUnidade,
        BigDecimal precoVendaUnidade
) {
}
