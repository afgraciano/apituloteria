package apituloteria.apituloteria.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apituloteria.apituloteria.modelos.TipoJuego;

@Repository
public interface TipoJuegoRepository extends JpaRepository<TipoJuego, Long> {
    
}
