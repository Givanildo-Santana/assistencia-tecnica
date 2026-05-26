package br.com.techhouseassistencia.assistenciatecnica.dto.Response;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.EspecialidadeTecnico;

import java.util.List;

public record TecnicoResponseDTO(
        Long tecnicoId,
        String nome,
        String telefone,
        List<EspecialidadeTecnico> especialidadeTecnico,
        Boolean ativo
) {

}
