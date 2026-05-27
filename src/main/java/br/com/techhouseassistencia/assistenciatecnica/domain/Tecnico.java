package br.com.techhouseassistencia.assistenciatecnica.domain;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.EspecialidadeTecnico;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "tecnicos")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<EspecialidadeTecnico> especialidadeTecnico;
    private boolean ativo;

}
