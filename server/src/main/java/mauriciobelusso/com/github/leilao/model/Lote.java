package mauriciobelusso.com.github.leilao.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Lote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @EqualsAndHashCode.Include
    private Integer id;
    @Column(name = "numerolote")
    private Integer numeroLote;
    @Column(length = 60, nullable = false)
    private String descricao;
    @Column(nullable = false)
    private BigDecimal quantidade;
    @Column(name = "valorinicial")
    private BigDecimal valorInicial;
    @Column(length = 128, nullable = false)
    private String unidade;
    @ManyToOne
    @JsonBackReference
    private Leilao leilao;
    @Column(name = "createdat", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "updatedat", nullable = false)
    private LocalDateTime updatedAt;
}
