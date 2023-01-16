package mauriciobelusso.com.github.leilao.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class CompradorId implements Serializable {

    @EqualsAndHashCode.Include
    @Column(name = "empresa", nullable = false, insertable = false, updatable = false)
    private Integer empresa;
    @EqualsAndHashCode.Include
    @Column(name = "leilao", nullable = false, insertable = false, updatable = false)
    private Integer leilao;
}
