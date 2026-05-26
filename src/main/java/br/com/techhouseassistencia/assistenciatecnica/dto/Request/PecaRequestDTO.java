package br.com.techhouseassistencia.assistenciatecnica.dto.Request;

import java.math.BigDecimal;

public record PecaRequestDTO(
        String nome,
        String codigoFabricante,
        String fornecedor,
        BigDecimal precoCusto
) {
}
