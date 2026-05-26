package br.com.techhouseassistencia.assistenciatecnica.dto.Response;


import java.math.BigDecimal;

public record ItemOSResponseDTO(
         PecaResponseDTO peca,
         Integer quantidade,
         BigDecimal precoCustoUnidade,
         BigDecimal precoVendaUnidade
) {
}
