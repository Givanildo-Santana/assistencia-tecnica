package br.com.techhouseassistencia.assistenciatecnica.domain;
import br.com.techhouseassistencia.assistenciatecnica.domain.enums.TipoResidencia;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String rua;
    private String numero;
    private TipoResidencia tipoResidencia;
    private String complemento;
}
