package mauriciobelusso.com.github.leilao.model;

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
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @EqualsAndHashCode.Include
    private Integer id;
    @Column(name = "razaosocial", length = 64, nullable = false)
    private String razaoSocial;
    @Column(length = 32, nullable = false, unique = true)
    private String cnpj;
    @Column(length = 64)
    private String logradouro;
    @Column(length = 64)
    private String municipio;
    @Column(length = 10)
    private String numero;
    @Column(length = 64)
    private String complemento;
    @Column(length = 64)
    private String bairro;
    @Column(length = 16)
    private String cep;
    @Column(length = 32)
    private String telefone;
    @Column(length = 254, nullable = false)
    private String email;
    @Column(length = 254)
    private String site;
    @Column(length = 20, nullable = false, unique = true)
    private String usuario;
    @Column(length = 128)
    private String senha;
    @Column(name = "createdat", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "updatedat", nullable = false)
    private LocalDateTime updatedAt;
}
