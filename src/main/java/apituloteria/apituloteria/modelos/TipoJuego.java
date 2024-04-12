package apituloteria.apituloteria.modelos;


import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipoJuego")
public class TipoJuego {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_tipoJuego")
    @GenericGenerator(name = "secuencia_tipoJuego", strategy = "increment")
    
    @Column(name="idTipoJuego")
    private long id;

    @Column(name="nombreJuego")
    private String nombreJuego;



    public TipoJuego() {
    }

    public TipoJuego(long id, String nombreJuego) {
        this.id = id;
        this.nombreJuego = nombreJuego;
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

   

   
    
}
