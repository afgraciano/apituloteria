package apituloteria.apituloteria.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import apituloteria.apituloteria.modelos.Loteria;
import apituloteria.apituloteria.servicios.LoteriaService;

@RestController
@RequestMapping("/loterias")
public class LoteriaController {
    @Autowired
    private LoteriaService loteriaService;

    @GetMapping("/")
    public List<Loteria> getAllLoterias() {
        return loteriaService.getAllLoterias();
    }

    @GetMapping("/{id}")
    public Loteria getLoteriaById(@PathVariable("id") Long id) {
        return loteriaService.getLoteriaById(id);
    }

    @PostMapping("/")
    public Loteria createLoteria(@RequestBody Loteria loteria) {
        return loteriaService.createLoteria(loteria);
    }

    @PutMapping("/{id}")
    public Loteria updateLoteria(@PathVariable("id") Long id, @RequestBody Loteria loteria) {
        return loteriaService.updateLoteria(id, loteria);
    }

    @DeleteMapping("/{id}")
    public void deleteLoteria(@PathVariable("id") Long id) {
        loteriaService.deleteLoteria(id);
    }
}
