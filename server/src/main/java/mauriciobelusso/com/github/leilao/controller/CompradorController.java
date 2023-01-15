package mauriciobelusso.com.github.leilao.controller;

import mauriciobelusso.com.github.leilao.entity.Comprador;
import mauriciobelusso.com.github.leilao.entity.CompradorId;
import mauriciobelusso.com.github.leilao.service.CrudService;
import mauriciobelusso.com.github.leilao.service.CompradorService;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{empresa}/{leilao}")
    public Comprador findOne(@PathVariable Integer empresa, @PathVariable Integer leilao) {
        return getService().findOne(new CompradorId(empresa, leilao));
    }

    @Override
    @JsonIgnore
    public Comprador findOne(CompradorId compradorId) {
        return super.findOne(compradorId);
    }
}
