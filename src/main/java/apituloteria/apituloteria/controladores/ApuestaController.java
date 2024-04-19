
package apituloteria.apituloteria.controladores;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import apituloteria.apituloteria.modelos.Apuesta;
import apituloteria.apituloteria.servicios.ApuestaService;

@RestController
@RequestMapping("/apuestas")
public class ApuestaController {
    private final ApuestaService apuestaService;

    public ApuestaController(ApuestaService apuestaService) {
        this.apuestaService = apuestaService;
    }

    @GetMapping("/")
    public List<Apuesta> getAllApuestas() {
        return apuestaService.getAllApuestas();
    }

    @GetMapping("/{id}")
    public Apuesta getApuestaById(@PathVariable("id") Long id) {
        return apuestaService.getApuestaById(id);
    }

    @PostMapping("/")
    public Apuesta createApuesta(@RequestBody Apuesta apuesta) {
        return apuestaService.createApuesta(apuesta);
    }

    @PutMapping("/{id}")
    public Apuesta updateApuesta(@PathVariable("id") Long id, @RequestBody Apuesta apuesta) {
        return apuestaService.updateApuesta(id, apuesta);
    }

    @DeleteMapping("/{id}")
    public void deleteApuesta(@PathVariable("id") Long id) {
        apuestaService.deleteApuesta(id);
    }
}
