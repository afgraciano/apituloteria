package apituloteria.apituloteria.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import apituloteria.apituloteria.modelos.TipoJuego;
import apituloteria.apituloteria.servicios.TipoJuegoService;

@RestController
@RequestMapping("/tipojuegos")
public class TipoJuegoController {
    @Autowired
    private TipoJuegoService tipoJuegoService;

    @GetMapping("/")
    public List<TipoJuego> getAllTipoJuegos() {
        return tipoJuegoService.getAllTipoJuegos();
    }

    @GetMapping("/{id}")
    public TipoJuego getTipoJuegoById(@PathVariable("id") Long id) {
        return tipoJuegoService.getTipoJuegoById(id);
    }

    @PostMapping("/")
    public TipoJuego createTipoJuego(@RequestBody TipoJuego tipoJuego) {
        return tipoJuegoService.createTipoJuego(tipoJuego);
    }

    @PutMapping("/{id}")
    public TipoJuego updateTipoJuego(@PathVariable("id") Long id, @RequestBody TipoJuego tipoJuego) {
        return tipoJuegoService.updateTipoJuego(id, tipoJuego);
    }

    @DeleteMapping("/{id}")
    public void deleteTipoJuego(@PathVariable("id") Long id) {
        tipoJuegoService.deleteTipoJuego(id);
    }
}
