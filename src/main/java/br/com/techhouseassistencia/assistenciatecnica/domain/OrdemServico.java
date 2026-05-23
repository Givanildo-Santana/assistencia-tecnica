package br.com.techhouseassistencia.assistenciatecnica.domain;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.StatusOS;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ordens_servico")
@Data
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    @OneToMany(mappedBy = "ordemServico")
    private List<Agendamento> agendamentos;

    @ManyToOne
    @JoinColumn(name="tecnico_id")
    private Tecnico tecnico;

    @OneToOne(mappedBy = "ordemServico")
    private Equipamento equipamento;

    private LocalDateTime dataAbertura;
    private LocalDateTime dataFechamento;

    private StatusOS statusOs;
    private String diagnostico;
    private BigDecimal valorCobrado;
}
