package mauriciobelusso.com.github.leilao.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Unidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @EqualsAndHashCode.Include
    private Integer id;
    @Column(length = 128, nullable = false)
    private String nome;
    @Column(name = "createdat", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "updatedat", nullable = false)
    private LocalDateTime updatedAt;
}
