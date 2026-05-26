package br.com.techhouseassistencia.assistenciatecnica.dto.Request;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.EspecialidadeTecnico;

import java.util.List;

public record TecnicoRequestDTO(
        String nome,
        String telefone,
        List<EspecialidadeTecnico> especialidadeTecnico
) {
}
