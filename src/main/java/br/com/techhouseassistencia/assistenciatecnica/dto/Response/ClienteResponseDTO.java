package br.com.techhouseassistencia.assistenciatecnica.dto.Response;


public record ClienteResponseDTO(
        Long clienteId,
        String nome,
        String telefone,
        EnderecoResponseDTO endereco) {
}
