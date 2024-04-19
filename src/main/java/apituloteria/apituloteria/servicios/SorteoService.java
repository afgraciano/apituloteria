package apituloteria.apituloteria.servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import apituloteria.apituloteria.modelos.Sorteo;
import apituloteria.apituloteria.repositorios.SorteoRepository;

@Service
public class SorteoService {
    @Autowired
    private SorteoRepository sorteoRepository;

    public List<Sorteo> getAllSorteos() {
        return sorteoRepository.findAll();
    }

    public Sorteo getSorteoById(Long id) {
        return sorteoRepository.findById(id).orElse(null);
    }

    public Sorteo createSorteo(Sorteo sorteo) {
        return sorteoRepository.save(sorteo);
    }

    public Sorteo updateSorteo(Long id, Sorteo sorteo) {
        sorteo.setId(id);
        return sorteoRepository.save(sorteo);
    }

    public void deleteSorteo(Long id) {
        sorteoRepository.deleteById(id);
    }
}
