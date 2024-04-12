package apituloteria.apituloteria.modelos;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="sorteo")
public class Sorteo {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_sorteo")
    @GenericGenerator(name = "secuencia_sorteo", strategy = "increment")
    
    @Column(name="idsorteo")
    private long id;

    @Column(name="fechaSorteo")
    private Date fechaSorteo;

    @Column(name="numGanador")
    private long numGanador;

    @Column(name="numSorteo")
    private long numSorteo;

    @Column(name="loteria_idloteria")
    private long loteria_idloteria;

    
    
    public Sorteo() {
    }

    public Sorteo(long id, Date fechaSorteo, long numGanador, long numSorteo, long loteria_idloteria) {
        this.id = id;
        this.fechaSorteo = fechaSorteo;
        this.numGanador = numGanador;
        this.numSorteo = numSorteo;
        this.loteria_idloteria = loteria_idloteria;
        
       
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(Date fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public long getNumGanador() {
        return numGanador;
    }

    public void setNumGanador(long numGanador) {
        this.numGanador = numGanador;
    }

    public long getNumSorteo() {
        return numSorteo;
    }

    public void setNumSorteo(long numSorteo) {
        this.numSorteo = numSorteo;
    }

    public long getLoteria_idloteria() {
        return loteria_idloteria;
    }

    public void setLoteria_idloteria(long loteria_idloteria) {
        this.loteria_idloteria = loteria_idloteria;
    }


}
