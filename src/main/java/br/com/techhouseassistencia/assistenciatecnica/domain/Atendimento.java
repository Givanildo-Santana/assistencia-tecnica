package br.com.techhouseassistencia.assistenciatecnica.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Entity
@Table(name = "atendimentos")
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @Setter
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @Setter
    @OneToMany(mappedBy = "atendimento")
    private List<Contato> contatos;

    @Setter
    @OneToMany(mappedBy = "atendimento")
    private List<Agendamento> agendamentos;

    public Atendimento() {}

    public Atendimento(Cliente cliente, Produto produto, List<Contato> contatos) {
        this.cliente = cliente;
        this.produto = produto;
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return """
                Cliente: %s
                Produto: %s
                Contatos: %s
                """.formatted(
                        getCliente(),
                        getProduto(),
                        getContatos()
                );
    }
}
