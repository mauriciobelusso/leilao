package mauriciobelusso.com.github.leilao.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Leilao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer codigo;
    @Column(length = 60, nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Integer vendedor;
    @Column(nullable = false)
    private LocalDateTime inicioPrevisto;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private LocalDateTime updatedAt;
    @OneToMany
    @JoinColumn(name = "leilao")
    private List<Lote> lotes;
}
