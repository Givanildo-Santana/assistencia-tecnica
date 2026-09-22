package br.com.techhouseassistencia.assistenciatecnica.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String marca;

    @Setter
    @Column(nullable = false)
    private String tipo;

    @Setter
    private String modelo;

    @Setter
    private String numeroSerie;

    @Setter
    private String tensaoEletrica;

    public Produto() {}

    public Produto(String marca, String tipo){
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return """
                Marca: %s
                Tipo: %s
                Modelo: %s
                Número de Série: %s
                Tensão Elétrica: %s
                """.formatted(
                        getMarca(),
                        getTipo(),
                        getModelo(),
                        getNumeroSerie(),
                        getTensaoEletrica()
        );
    }

}
