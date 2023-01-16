package mauriciobelusso.com.github.leilao.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

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
    @Column(name = "inicioprevisto", nullable = false)
    private LocalDateTime inicioPrevisto;
    @Column(name = "createdat", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "updatedat", nullable = false)
    private LocalDateTime updatedAt;
    @OneToMany(mappedBy = "leilao")
    @JsonManagedReference
    private Set<Lote> lotes;
}
