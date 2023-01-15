package mauriciobelusso.com.github.leilao.controller;

import mauriciobelusso.com.github.leilao.entity.Comprador;
import mauriciobelusso.com.github.leilao.entity.CompradorId;
import mauriciobelusso.com.github.leilao.service.CrudService;
import mauriciobelusso.com.github.leilao.service.CompradorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comprador")
public class CompradorController extends CrudController<Comprador, CompradorId>{

    private final CompradorService compradorService;

    public CompradorController(CompradorService compradorService) {
        this.compradorService = compradorService;
    }

    @Override
    protected CrudService<Comprador, CompradorId> getService() {
        return compradorService;
    }
}
