package br.com.techhouseassistencia.assistenciatecnica.controller;

import br.com.techhouseassistencia.assistenciatecnica.domain.Cliente;
import br.com.techhouseassistencia.assistenciatecnica.domain.Endereco;
import br.com.techhouseassistencia.assistenciatecnica.dto.Request.ClienteRequestDTO;
import br.com.techhouseassistencia.assistenciatecnica.dto.Response.ClienteResponseDTO;
import br.com.techhouseassistencia.assistenciatecnica.dto.Response.EnderecoResponseDTO;
import br.com.techhouseassistencia.assistenciatecnica.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    private ClienteResponseDTO toResponseDTO(Cliente cliente) {
        return new ClienteResponseDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getTelefone(),
                new EnderecoResponseDTO(
                        cliente.getEndereco().getCep(),
                        cliente.getEndereco().getRua(),
                        cliente.getEndereco().getNumero(),
                        cliente.getEndereco().getTipoResidencia(),
                        cliente.getEndereco().getComplemento()));
    }

    @GetMapping
    public List<ClienteResponseDTO> findAllCliente(){
       List<Cliente> clientes = clienteService.findAllCliente();

       List<ClienteResponseDTO> clientesDTO = clientes.stream().
                map(this::toResponseDTO)
                .toList();
        return clientesDTO;
    }

    @GetMapping("/{id}")
    public ClienteResponseDTO findByClienteId(@PathVariable Long id){
       ClienteResponseDTO clienteResponseDTO = toResponseDTO(clienteService.findByClienteId(id));
        return clienteResponseDTO;
    }

    @PostMapping
    public ClienteResponseDTO saveCliente(@RequestBody ClienteRequestDTO clienteRequestDTO){
        Endereco endereco = new Endereco();
        endereco.setCep(clienteRequestDTO.endereco().cep());
        endereco.setRua(clienteRequestDTO.endereco().rua());
        endereco.setNumero(clienteRequestDTO.endereco().numero());
        endereco.setTipoResidencia(clienteRequestDTO.endereco().tipoResidencia());
        endereco.setComplemento(clienteRequestDTO.endereco().complemento());

        Cliente cliente = new Cliente();

        cliente.setNome(clienteRequestDTO.nome());
        cliente.setTelefone(clienteRequestDTO.telefone());
        cliente.setEndereco(endereco);

        Cliente clienteSalvo = clienteService.saveCliente(cliente);
        return toResponseDTO(clienteSalvo);

    }

    @PutMapping("/{id}")
    public ClienteResponseDTO updateByClienteId(@PathVariable Long id, @RequestBody ClienteRequestDTO clienteRequestDTO){

        Endereco endereco = new Endereco();
        endereco.setCep(clienteRequestDTO.endereco().cep());
        endereco.setRua(clienteRequestDTO.endereco().rua());
        endereco.setNumero(clienteRequestDTO.endereco().numero());
        endereco.setTipoResidencia(clienteRequestDTO.endereco().tipoResidencia());
        endereco.setComplemento(clienteRequestDTO.endereco().complemento());

        Cliente cliente = new Cliente();

        cliente.setId(id);
        cliente.setNome(clienteRequestDTO.nome());
        cliente.setTelefone(clienteRequestDTO.telefone());
        cliente.setEndereco(endereco);

        Cliente clienteAtualizado = clienteService.saveCliente(cliente);
        return toResponseDTO(clienteAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deleteByClienteid(@PathVariable Long id){
        clienteService.deleteByClienteId(id);
    }

}
