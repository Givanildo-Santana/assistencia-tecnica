package br.com.techhouseassistencia.assistenciatecnica.dto.Response;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.FormaPagamento;

import java.math.BigDecimal;

public record PagamentoResponseDTO(
        Long pagamentoId,
        Long ordemServicoId,
        FormaPagamento formaPagamento,
        BigDecimal valor,
        Integer parcelas
) {
}
