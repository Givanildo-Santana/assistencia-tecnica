package br.com.techhouseassistencia.assistenciatecnica.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String nome;

    @Setter
    @Column(nullable = false)
    private String telefone;

    @Setter
    @Column(unique = true)
    private String email;

    @Setter
    @Column(nullable = false)
    private String endereco;

    @OneToMany(mappedBy = "cliente")
    private List<Atendimento> atendimentos;


    public Cliente(){
    }

    public Cliente (String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Telefone: %s
                Email: %s
                Endereço: %s
                """.formatted(getNome(),getTelefone(),getEmail(),getEndereco());
    }

}
