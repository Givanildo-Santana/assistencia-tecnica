package br.com.techhouseassistencia.assistenciatecnica.domain;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.StatusAgendamento;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    private LocalDateTime agendamentoDataHora;
    private StatusAgendamento statusAgendamento;

    @ManyToOne
    @JoinColumn(name = "ordem_servico_id")
    private OrdemServico ordemServico;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    private String observacoes;

}
