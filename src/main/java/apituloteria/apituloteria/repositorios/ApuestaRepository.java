package apituloteria.apituloteria.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apituloteria.apituloteria.modelos.Apuesta;

@Repository
public interface ApuestaRepository extends JpaRepository<Apuesta, Long> {
    
}
