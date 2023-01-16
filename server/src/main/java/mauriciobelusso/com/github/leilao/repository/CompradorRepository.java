package mauriciobelusso.com.github.leilao.repository;

import mauriciobelusso.com.github.leilao.model.Comprador;
import mauriciobelusso.com.github.leilao.model.CompradorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompradorRepository extends JpaRepository<Comprador, CompradorId> {
}