package mauriciobelusso.com.github.leilao.controller;

import mauriciobelusso.com.github.leilao.model.Lote;
import mauriciobelusso.com.github.leilao.service.CrudService;
import mauriciobelusso.com.github.leilao.service.LoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lote")
public class LoteController extends CrudController<Lote, Integer>{

    private final LoteService loteService;

    public LoteController(LoteService loteService) {
        this.loteService = loteService;
    }

    @Override
    protected CrudService<Lote, Integer> getService() {
        return loteService;
    }
}
