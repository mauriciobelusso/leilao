package mauriciobelusso.com.github.leilao.repository;

import mauriciobelusso.com.github.leilao.model.Leilao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeilaoRepository extends JpaRepository<Leilao, Integer> {
}