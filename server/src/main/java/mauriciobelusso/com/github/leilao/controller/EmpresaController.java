package mauriciobelusso.com.github.leilao.controller;

import mauriciobelusso.com.github.leilao.model.Empresa;
import mauriciobelusso.com.github.leilao.service.CrudService;
import mauriciobelusso.com.github.leilao.service.EmpresaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empresa")
public class EmpresaController extends CrudController<Empresa, Integer>{

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @Override
    protected CrudService<Empresa, Integer> getService() {
        return empresaService;
    }
}
