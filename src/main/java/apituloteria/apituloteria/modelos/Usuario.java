package apituloteria.apituloteria.modelos;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_usuario")
    @GenericGenerator(name = "secuencia_usuario", strategy = "increment")
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

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getclave() {
        return clave;
    }

    public void setclave(String clave) {
        this.clave = clave;
    }




    
}
