import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apituloteria.apituloteria.modelos.Sorteo;

@Repository
public interface SorteoRepository extends JpaRepository<Sorteo, Long> {
   
}
