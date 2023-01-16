package mauriciobelusso.com.github.leilao.service.impl;

import mauriciobelusso.com.github.leilao.entity.Leilao;
import mauriciobelusso.com.github.leilao.repository.LeilaoRepository;
import mauriciobelusso.com.github.leilao.service.LeilaoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LeilaoServiceImpl extends CrudServiceImpl<Leilao, Integer> implements LeilaoService {

    private LeilaoRepository leilaoRepository;

    public LeilaoServiceImpl(LeilaoRepository leilaoRepository) {
        this.leilaoRepository = leilaoRepository;
    }

    @Override
    protected JpaRepository<Leilao, Integer> getRepository() {
        return leilaoRepository;
    }
}
