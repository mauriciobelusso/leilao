package mauriciobelusso.com.github.leilao.controller;

import mauriciobelusso.com.github.leilao.model.Unidade;
import mauriciobelusso.com.github.leilao.service.CrudService;
import mauriciobelusso.com.github.leilao.service.UnidadeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("unidade")
public class UnidadeController extends CrudController<Unidade, Integer>{

    private final UnidadeService unidadeService;

    public UnidadeController(UnidadeService unidadeService) {
        this.unidadeService = unidadeService;
    }

    @Override
    protected CrudService<Unidade, Integer> getService() {
        return unidadeService;
    }
}
