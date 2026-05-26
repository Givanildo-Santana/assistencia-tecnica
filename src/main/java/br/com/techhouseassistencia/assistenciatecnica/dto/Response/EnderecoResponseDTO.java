package br.com.techhouseassistencia.assistenciatecnica.dto.Response;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.TipoResidencia;

public record EnderecoResponseDTO(
        String cep,
        String rua,
        String numero,
        TipoResidencia tipoResidencia,
        String complemento

) {
}
