package apituloteria.apituloteria.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apituloteria.apituloteria.modelos.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   
}
