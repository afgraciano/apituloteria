import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import apituloteria.apituloteria.modelos.Recibo;
import apituloteria.apituloteria.repositorios.ReciboRepository;

@Service
public class ReciboService {
    @Autowired
    private ReciboRepository reciboRepository;

    public List<Recibo> getAllRecibos() {
        return reciboRepository.findAll();
    }

    public Recibo getReciboById(Long id) {
        return reciboRepository.findById(id).orElse(null);
    }

    public Recibo createRecibo(Recibo recibo) {
        return reciboRepository.save(recibo);
    }

    public Recibo updateRecibo(Long id, Recibo recibo) {
        recibo.setId(id);
        return reciboRepository.save(recibo);
    }

    public void deleteRecibo(Long id) {
        reciboRepository.deleteById(id);
    }
}
