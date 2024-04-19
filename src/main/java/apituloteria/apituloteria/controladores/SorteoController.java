import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import apituloteria.apituloteria.modelos.Sorteo;
import apituloteria.apituloteria.servicios.SorteoService;

@RestController
@RequestMapping("/sorteos")
public class SorteoController {
    @Autowired
    private SorteoService sorteoService;

    @GetMapping("/")
    public List<Sorteo> getAllSorteos() {
        return sorteoService.getAllSorteos();
    }

    @GetMapping("/{id}")
    public Sorteo getSorteoById(@PathVariable("id") Long id) {
        return sorteoService.getSorteoById(id);
    }

    @PostMapping("/")
    public Sorteo createSorteo(@RequestBody Sorteo sorteo) {
        return sorteoService.createSorteo(sorteo);
    }

    @PutMapping("/{id}")
    public Sorteo updateSorteo(@PathVariable("id") Long id, @RequestBody Sorteo sorteo) {
        return sorteoService.updateSorteo(id, sorteo);
    }

    @DeleteMapping("/{id}")
    public void deleteSorteo(@PathVariable("id") Long id) {
        sorteoService.deleteSorteo(id);
    }
}
