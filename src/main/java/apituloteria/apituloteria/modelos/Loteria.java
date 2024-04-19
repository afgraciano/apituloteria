package apituloteria.apituloteria.modelos;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loteria")
public class Loteria {
   /*  @Id
    @Column(name = "idloteria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_loteria")
    @GenericGenerator(name = "secuencia_loteria", strategy = "increment")
    @Column(name = "idloteria")
    private Long id;


    @Column(name = "nombreLoteria")
    private String nombreLoteria;

    public Loteria() {
    }

    public Loteria(Long id, String nombreLoteria) {
        this.id = id;
        this.nombreLoteria = nombreLoteria;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnombreLoteria() {
        return nombreLoteria;
    }

    public void setnombre(String nombreLoteria) {
        this.nombreLoteria = nombreLoteria;
    }

}
