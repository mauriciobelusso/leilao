package mauriciobelusso.com.github.leilao.service.impl;

import mauriciobelusso.com.github.leilao.entity.Comprador;
import mauriciobelusso.com.github.leilao.entity.CompradorId;
import mauriciobelusso.com.github.leilao.repository.CompradorRepository;
import mauriciobelusso.com.github.leilao.service.CompradorService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CompradorServiceImpl extends CrudServiceImpl<Comprador, CompradorId> implements CompradorService {

    private CompradorRepository compradorRepository;

    public CompradorServiceImpl(CompradorRepository compradorRepository) {
        this.compradorRepository = compradorRepository;
    }

    @Override
    protected JpaRepository<Comprador, CompradorId> getRepository() {
        return compradorRepository;
    }
}
