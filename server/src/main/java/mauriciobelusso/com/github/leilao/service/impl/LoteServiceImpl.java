package mauriciobelusso.com.github.leilao.service.impl;

import mauriciobelusso.com.github.leilao.entity.Lote;
import mauriciobelusso.com.github.leilao.repository.LoteRepository;
import mauriciobelusso.com.github.leilao.service.LoteService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LoteServiceImpl extends CrudServiceImpl<Lote, Integer> implements LoteService {

    private LoteRepository loteRepository;

    public LoteServiceImpl(LoteRepository LoteRepository) {
        this.loteRepository = LoteRepository;
    }

    @Override
    protected JpaRepository<Lote, Integer> getRepository() {
        return loteRepository;
    }
}
