package apituloteria.apituloteria.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import apituloteria.apituloteria.modelos.Recibo;
import apituloteria.apituloteria.servicios.ReciboService;

@RestController
@RequestMapping("/recibos")
public class ReciboController {
    @Autowired
    private ReciboService reciboService;

    @GetMapping("/")
    public List<Recibo> getAllRecibos() {
        return reciboService.getAllRecibos();
    }

    @GetMapping("/{id}")
    public Recibo getReciboById(@PathVariable("id") Long id) {
        return reciboService.getReciboById(id);
    }

    @PostMapping("/")
    public Recibo createRecibo(@RequestBody Recibo recibo) {
        return reciboService.createRecibo(recibo);
    }

    @PutMapping("/{id}")
    public Recibo updateRecibo(@PathVariable("id") Long id, @RequestBody Recibo recibo) {
        return reciboService.updateRecibo(id, recibo);
    }

    @DeleteMapping("/{id}")
    public void deleteRecibo(@PathVariable("id") Long id) {
        reciboService.deleteRecibo(id);
    }
}
