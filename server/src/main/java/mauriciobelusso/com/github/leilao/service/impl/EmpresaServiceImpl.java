package mauriciobelusso.com.github.leilao.service.impl;

import mauriciobelusso.com.github.leilao.model.Empresa;
import mauriciobelusso.com.github.leilao.repository.EmpresaRepository;
import mauriciobelusso.com.github.leilao.service.EmpresaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmpresaServiceImpl extends CrudServiceImpl<Empresa, Integer> implements EmpresaService {

    private EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @Override
    protected JpaRepository<Empresa, Integer> getRepository() {
        return empresaRepository;
    }

    private void prepareObject(Empresa entity) {
        if (entity.getId() == null || entity.getId().intValue() == 0) {
            entity.setCreatedAt(LocalDateTime.now());
            entity.setUpdatedAt(LocalDateTime.now());
        } else {
            entity.setUpdatedAt(LocalDateTime.now());
        }
    }

    @Override
    public Empresa saveAndFlush(Empresa entity) {
        prepareObject(entity);
        return super.saveAndFlush(entity);
    }

    @Override
    public Empresa save(Empresa entity) {
        prepareObject(entity);
        return super.save(entity);
    }
}
