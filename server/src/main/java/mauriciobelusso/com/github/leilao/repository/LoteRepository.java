package mauriciobelusso.com.github.leilao.repository;

import mauriciobelusso.com.github.leilao.entity.Lote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoteRepository extends JpaRepository<Lote, Integer> {
}