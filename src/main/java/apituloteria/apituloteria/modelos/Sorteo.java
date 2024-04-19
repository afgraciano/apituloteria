package apituloteria.apituloteria.modelos;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = "sorteo")
public class Sorteo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_sorteo")
    @GenericGenerator(name = "secuencia_sorteo", strategy = "increment")
    @Column(name = "idsorteo")
    private long id;

    /*
     * se hace referencia al forend key desde sorteo hacia loteria y se pone de
     * muchos a uno
     
    @OneToOne
    @JoinColumn(name = "loteria_idloteria") // , referencedColumnName = "idloteria")
    private Loteria loteria;*/

    @OneToOne
    @JoinColumn(name = "loteria_idloteria", foreignKey = @ForeignKey(name = "FK_sorteo_loteria"))
    private Loteria loteria;

    @Column(name = "fechaSorteo")
    private Date fechaSorteo;

    @Column(name = "numGanador")
    private long numGanador;

    @Column(name = "numSorteo")
    private long numSorteo;

    public Sorteo() {
    }

    public Sorteo(long id, Loteria loteria, Date fechaSorteo, long numGanador, long numSorteo) {
        this.id = id;
        this.loteria = loteria;
        this.fechaSorteo = fechaSorteo;
        this.numGanador = numGanador;
        this.numSorteo = numSorteo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Loteria getLoteria() {
        return loteria;
    }

    public void setLoteria(Loteria loteria) {
        this.loteria = loteria;
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

}
