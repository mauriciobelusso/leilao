package mauriciobelusso.com.github.leilao.controller;

import mauriciobelusso.com.github.leilao.entity.Leilao;
import mauriciobelusso.com.github.leilao.service.CrudService;
import mauriciobelusso.com.github.leilao.service.LeilaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("leilao")
public class LeilaoController extends CrudController<Leilao, Integer>{

    private final LeilaoService leilaoService;

    public LeilaoController(LeilaoService leilaoService) {
        this.leilaoService = leilaoService;
    }

    @Override
    protected CrudService<Leilao, Integer> getService() {
        return leilaoService;
    }
}
