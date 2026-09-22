package br.com.techhouseassistencia.assistenciatecnica.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Entity
@Table(name = "agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @ManyToOne
    @JoinColumn(name = "atendimento_id", nullable = false)
    private Atendimento atendimento;

    @Setter
    @Column(nullable = false)
    private LocalDate dataAgendamento;

    @Setter
    @Column(nullable = false)
    private String periodoAgendamento;

    public Agendamento() {}

    public Agendamento(Atendimento atendimento, LocalDate dataAgendamento, String periodoAgendamento) {
        this.atendimento = atendimento;
        this.dataAgendamento = dataAgendamento;
        this.periodoAgendamento = periodoAgendamento;
    }

    @Override
    public String toString() {
        return """
                Atendimento: %s
                Data do agendamento: %s
                Período do agendamento: %s
                """.formatted(
                        getAtendimento(),
                        getDataAgendamento(),
                        getPeriodoAgendamento()
        );
    }
}
