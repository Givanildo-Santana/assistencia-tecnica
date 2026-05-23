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

    private MarcaEquipamento marcaEquipamento;
    private TipoEquipamento tipoEquipamento;
    private TensaoEquipamento tensaoEquipamento;
    private String modeloEquipamento;
    private String numeroSerie;

}
