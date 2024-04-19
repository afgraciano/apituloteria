import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import apituloteria.apituloteria.modelos.Loteria;
import apituloteria.apituloteria.repositorios.LoteriaRepository;

@Service
public class LoteriaService {
    @Autowired
    private LoteriaRepository loteriaRepository;

    public List<Loteria> getAllLoterias() {
        return loteriaRepository.findAll();
    }

    public Loteria getLoteriaById(Long id) {
        return loteriaRepository.findById(id).orElse(null);
    }

    public Loteria createLoteria(Loteria loteria) {
        return loteriaRepository.save(loteria);
    }

    public Loteria updateLoteria(Long id, Loteria loteria) {
        loteria.setId(id);
        return loteriaRepository.save(loteria);
    }

    public void deleteLoteria(Long id) {
        loteriaRepository.deleteById(id);
    }
}
