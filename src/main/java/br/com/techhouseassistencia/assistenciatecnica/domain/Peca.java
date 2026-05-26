package br.com.techhouseassistencia.assistenciatecnica.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name="pecas")
@Data
public class Peca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Column(unique = true)
    private String codigoFabricante;
    private String fornecedor;
    private BigDecimal precoCusto;
}
