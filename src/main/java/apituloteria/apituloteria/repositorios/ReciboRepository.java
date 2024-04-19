import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apituloteria.apituloteria.modelos.Recibo;

@Repository
public interface ReciboRepository extends JpaRepository<Recibo, Long> {
  
}
