import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import apituloteria.apituloteria.modelos.TipoJuego;
import apituloteria.apituloteria.repositorios.TipoJuegoRepository;

@Service
public class TipoJuegoService {
    @Autowired
    private TipoJuegoRepository tipoJuegoRepository;

    public List<TipoJuego> getAllTipoJuegos() {
        return tipoJuegoRepository.findAll();
    }

    public TipoJuego getTipoJuegoById(Long id) {
        return tipoJuegoRepository.findById(id).orElse(null);
    }

    public TipoJuego createTipoJuego(TipoJuego tipoJuego) {
        return tipoJuegoRepository.save(tipoJuego);
    }

    public TipoJuego updateTipoJuego(Long id, TipoJuego tipoJuego) {
        tipoJuego.setId(id);
        return tipoJuegoRepository.save(tipoJuego);
    }

    public void deleteTipoJuego(Long id) {
        tipoJuegoRepository.deleteById(id);
    }
}
