package br.com.techhouseassistencia.assistenciatecnica.dto.Request;


public record ClienteRequestDTO(
        String nome,
        String telefone,
        EnderecoRequestDTO endereco) {
}
