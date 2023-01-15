package mauriciobelusso.com.github.leilao.service.impl;

import mauriciobelusso.com.github.leilao.entity.Empresa;
import mauriciobelusso.com.github.leilao.repository.EmpresaRepository;
import mauriciobelusso.com.github.leilao.service.EmpresaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

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
}
