package mauriciobelusso.com.github.leilao.repository;

import mauriciobelusso.com.github.leilao.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}