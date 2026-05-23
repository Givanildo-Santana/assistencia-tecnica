package br.com.techhouseassistencia.assistenciatecnica.domain;

import br.com.techhouseassistencia.assistenciatecnica.domain.enums.FormaPagamento;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "pagamentos")
@Data
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="ordem_servico_id")
    private OrdemServico ordemServico;

    private FormaPagamento formaPagamento;
    private BigDecimal valor;
    private LocalDateTime dataPagamento;
    private Integer parcelas;
}
