package mauriciobelusso.com.github.leilao.entity;

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
    private Integer numeroLote;
    @Column(length = 60, nullable = false)
    private String descricao;
    @Column(nullable = false)
    private BigDecimal quantidade;
    private BigDecimal valorInicial;
    @Column(length = 128, nullable = false)
    private String unidade;
    @ManyToOne
    @JoinColumn(name = "leilao")
    private Leilao leilao;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
