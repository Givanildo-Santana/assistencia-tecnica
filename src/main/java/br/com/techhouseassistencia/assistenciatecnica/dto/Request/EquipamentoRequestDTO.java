package br.com.techhouseassistencia.assistenciatecnica.dto.Request;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.MarcaEquipamento;
import br.com.techhouseassistencia.assistenciatecnica.domain.enums.TensaoEquipamento;
import br.com.techhouseassistencia.assistenciatecnica.domain.enums.TipoEquipamento;

public record EquipamentoRequestDTO(
        Long ordemServicoId,
        MarcaEquipamento marcaEquipamento,
        TipoEquipamento tipoEquipamento,
        TensaoEquipamento tensaoEquipamento,
        String modeloEquipamento,
        String numeroSerie
) {

}
