package br.com.techhouseassistencia.assistenciatecnica.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name="itens_os")
@Data
public class ItemOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_servico_id")
    private OrdemServico ordemServico;

    @ManyToOne
    @JoinColumn(name = "peca_id")
    private Peca peca;

    private Integer quantidade;
    private BigDecimal precoCustoUnidade;
    private BigDecimal precoVendaUnidade;
}
