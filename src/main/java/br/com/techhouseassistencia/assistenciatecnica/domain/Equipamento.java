package br.com.techhouseassistencia.assistenciatecnica.domain;
import br.com.techhouseassistencia.assistenciatecnica.domain.enums.MarcaEquipamento;
import br.com.techhouseassistencia.assistenciatecnica.domain.enums.TensaoEquipamento;
import br.com.techhouseassistencia.assistenciatecnica.domain.enums.TipoEquipamento;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name= "equipamentos")
@Data
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="ordem_servico_id")
    private OrdemServico ordemServico;

    @Enumerated(EnumType.STRING)
    private MarcaEquipamento marcaEquipamento;
    @Enumerated(EnumType.STRING)
    private TipoEquipamento tipoEquipamento;
    @Enumerated(EnumType.STRING)
    private TensaoEquipamento tensaoEquipamento;
    private String modeloEquipamento;
    private String numeroSerie;

}
