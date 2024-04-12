package apituloteria.apituloteria.modelos;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loteria")
public class Loteria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_loteria")
    @GenericGenerator(name = "secuencia_loteria", strategy = "increment")
    
    @Column(name="idloteria")
    private long id;

    @Column(name="nombreLoteria")
    private String nombreLoteria;



    public Loteria() {
    }

    public Loteria(long id, String nombreLoteria) {
        this.id = id;
        this.nombreLoteria = nombreLoteria;
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getnombreLoteria() {
        return nombreLoteria;
    }

    public void setnombre(String nombreLoteria) {
        this.nombreLoteria = nombreLoteria;
    }

   
    
}
