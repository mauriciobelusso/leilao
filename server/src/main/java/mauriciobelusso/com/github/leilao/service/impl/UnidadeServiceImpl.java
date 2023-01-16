package mauriciobelusso.com.github.leilao.service.impl;

import mauriciobelusso.com.github.leilao.entity.Unidade;
import mauriciobelusso.com.github.leilao.repository.UnidadeRepository;
import mauriciobelusso.com.github.leilao.service.UnidadeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UnidadeServiceImpl extends CrudServiceImpl<Unidade, Integer> implements UnidadeService {

    private UnidadeRepository unidadeRepository;

    public UnidadeServiceImpl(UnidadeRepository UnidadeRepository) {
        this.unidadeRepository = UnidadeRepository;
    }

    @Override
    protected JpaRepository<Unidade, Integer> getRepository() {
        return unidadeRepository;
    }
}
