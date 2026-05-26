package br.com.techhouseassistencia.assistenciatecnica.dto.Request;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.FormaPagamento;

import java.math.BigDecimal;

public record PagamentoRequestDTO(
        Long ordemServicoId,
        FormaPagamento formaPagamento,
        BigDecimal valor,
        Integer parcelas) {
}
