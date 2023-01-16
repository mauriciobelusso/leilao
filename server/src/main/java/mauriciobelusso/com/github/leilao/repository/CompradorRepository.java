package mauriciobelusso.com.github.leilao.repository;

import mauriciobelusso.com.github.leilao.entity.Comprador;
import mauriciobelusso.com.github.leilao.entity.CompradorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompradorRepository extends JpaRepository<Comprador, CompradorId> {
}