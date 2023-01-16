package mauriciobelusso.com.github.leilao.service.impl;

import mauriciobelusso.com.github.leilao.model.Unidade;
import mauriciobelusso.com.github.leilao.repository.UnidadeRepository;
import mauriciobelusso.com.github.leilao.service.UnidadeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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

    private void prepareObject(Unidade entity) {
        if (entity.getId() == null || entity.getId().intValue() == 0) {
            entity.setCreatedAt(LocalDateTime.now());
            entity.setUpdatedAt(LocalDateTime.now());
        } else {
            entity.setUpdatedAt(LocalDateTime.now());
        }
    }

    @Override
    public Unidade saveAndFlush(Unidade entity) {
        prepareObject(entity);
        return super.saveAndFlush(entity);
    }

    @Override
    public Unidade save(Unidade entity) {
        prepareObject(entity);
        return super.save(entity);
    }
}
