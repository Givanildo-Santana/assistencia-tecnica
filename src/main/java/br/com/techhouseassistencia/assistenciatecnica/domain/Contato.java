package br.com.techhouseassistencia.assistenciatecnica.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "contatos")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String telefone;

    @Setter
    @Column(nullable = false)
    private String descricao;

    @Setter
    @Column(nullable = false)
    private LocalDateTime dataHora;

    @Setter
    @ManyToOne
    @JoinColumn(name = "atendimento_id", nullable = false)
    private Atendimento atendimento;

    public Contato() {}

    public Contato(String telefone, String descricao) {
        this.telefone = telefone;
        this.descricao = descricao;
        this.dataHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return """
                Telefone: %s
                Descrição: %s
                Data do contato: %s
                """.formatted(
                        getTelefone(),
                        getDescricao(),
                        getDataHora()
        );
    }
}
