package br.com.techhouseassistencia.assistenciatecnica.dto.Request;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.TipoResidencia;

public record EnderecoRequestDTO(
        String cep,
        String rua,
        String numero,
        TipoResidencia tipoResidencia,
        String complemento

) {
}
