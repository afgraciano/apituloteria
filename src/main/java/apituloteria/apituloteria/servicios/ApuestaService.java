import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import apituloteria.apituloteria.modelos.Apuesta;
import apituloteria.apituloteria.repositorios.ApuestaRepository;

@Service
public class ApuestaService {
    @Autowired
    private ApuestaRepository apuestaRepository;

    public List<Apuesta> getAllApuestas() {
        return apuestaRepository.findAll();
    }

    public Apuesta getApuestaById(Long id) {
        return apuestaRepository.findById(id).orElse(null);
    }

    public Apuesta createApuesta(Apuesta apuesta) {
        return apuestaRepository.save(apuesta);
    }

    public Apuesta updateApuesta(Long id, Apuesta apuesta) {
        apuesta.setId(id);
        return apuestaRepository.save(apuesta);
    }

    public void deleteApuesta(Long id) {
        apuestaRepository.deleteById(id);
    }
}
