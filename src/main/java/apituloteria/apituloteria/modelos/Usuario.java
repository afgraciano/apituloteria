package apituloteria.apituloteria.modelos;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_usuario")
    @GenericGenerator(name = "secuencia_usuario", strategy = "increment")
    @Column(name = "idusuario")
    private long id;

    @Column(name = "nombre", length = 100, unique = true)
    private String nombre;

    @Column(name = "correo")
    private String email;

    @Column(name = "clave", length = 100)
    private String clave;

    @Column(name = "identificacion")
    private String identificacion;

    public Usuario() {
    }

    public Usuario(long id, String nombre, String email, String clave, String identificacion) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.identificacion = identificacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

}
