package mauriciobelusso.com.github.leilao.service.impl;

import mauriciobelusso.com.github.leilao.model.Leilao;
import mauriciobelusso.com.github.leilao.repository.LeilaoRepository;
import mauriciobelusso.com.github.leilao.service.LeilaoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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

    private void prepareObject(Leilao entity) {
        if (entity.getId() == null || entity.getId().intValue() == 0) {
            entity.setCreatedAt(LocalDateTime.now());
            entity.setUpdatedAt(LocalDateTime.now());
        } else {
            entity.setUpdatedAt(LocalDateTime.now());
        }
    }

    @Override
    public Leilao saveAndFlush(Leilao entity) {
        prepareObject(entity);
        return super.saveAndFlush(entity);
    }

    @Override
    public Leilao save(Leilao entity) {
        prepareObject(entity);
        return super.save(entity);
    }
}
