package mauriciobelusso.com.github.leilao.service.impl;

import mauriciobelusso.com.github.leilao.model.Lote;
import mauriciobelusso.com.github.leilao.repository.LoteRepository;
import mauriciobelusso.com.github.leilao.service.LoteService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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

    private void prepareObject(Lote entity) {
        if (entity.getId() == null || entity.getId().intValue() == 0) {
            entity.setCreatedAt(LocalDateTime.now());
            entity.setUpdatedAt(LocalDateTime.now());
        } else {
            entity.setUpdatedAt(LocalDateTime.now());
        }
    }

    @Override
    public Lote saveAndFlush(Lote entity) {
        prepareObject(entity);
        return super.saveAndFlush(entity);
    }

    @Override
    public Lote save(Lote entity) {
        prepareObject(entity);
        return super.save(entity);
    }
}
