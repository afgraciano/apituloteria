package apituloteria.apituloteria.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

    @Column(name="idusuario")
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="correo")
    private String email;

    @Column(name="clave")
    private String clave;
    
    
    @Column(name="identificacion")
    private String identificacion;

    /*@Override
    public String toString() {
        return "usuario []";
    }*/
    
}
