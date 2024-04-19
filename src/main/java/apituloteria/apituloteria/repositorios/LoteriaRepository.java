package apituloteria.apituloteria.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apituloteria.apituloteria.modelos.Loteria;

@Repository
public interface LoteriaRepository extends JpaRepository<Loteria, Long> {
  
}
