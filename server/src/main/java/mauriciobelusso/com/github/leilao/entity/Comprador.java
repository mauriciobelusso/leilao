package mauriciobelusso.com.github.leilao.entity;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comprador implements Serializable {

    @EmbeddedId
    private CompradorId id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "empresa", insertable = false, updatable = false)
    private Empresa empresa;
    @ManyToOne(optional = false)
    @JoinColumn(name = "leilao", insertable = false, updatable = false)
    private Leilao leilao;
}
