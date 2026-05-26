package br.com.techhouseassistencia.assistenciatecnica.dto.Response;

import java.math.BigDecimal;

public record PecaResponseDTO(
        Long pecaId,
        String nome,
        String codigoFabricante,
        String fornecedor,
        BigDecimal precoCusto
) {
}
