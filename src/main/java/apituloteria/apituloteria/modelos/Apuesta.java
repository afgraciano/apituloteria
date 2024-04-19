package apituloteria.apituloteria.modelos;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = "apuesta")
public class Apuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_apuesta")
    @GenericGenerator(name = "secuencia_apuesta", strategy = "increment")
    @Column(name = "idapuesta")
    private Long id;

    @Column(name = "valorApostado")
    private long valorApostado;

    @Column(name = "numeroApostado")
    private long numeroApostado;

    /*
     * se hace referencia al forend key desde apuesta hacia usuario y se pone de
     * muchos a uno serian muchas apuestas a un usuario
     */
    @ManyToOne
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    private Usuario usuario;

    /*
     * se hace referencia al forend key desde apuestas hacia sorteo y se pone de
     * muchos a uno
     */
    @ManyToOne
    @JoinColumn(name = "sorteo_idsorteo", referencedColumnName = "idsorteo")
    private Sorteo sorteo;
    
   

    @ManyToOne
    @JoinColumn(name = "tipoJuego_idTipoJuego", referencedColumnName = "idTipoJuego")
    private TipoJuego tipoJuego;

    @Column(name = "modoJuego")
    private long modoJuego;

    @Column(name = "loteria")
    private long loteria;

    @Column(name = "fechaVenta")
    private Date fechaVenta;

   /*@Column(name = "usuario_idusuario")
    private long usuario_idusuario;

    @Column(name = "usuario_idsorteo")
    private long usuario_idsorteo;*/

    public Apuesta() {
    }

    public Apuesta(Long id, long valorApostado, long numeroApostado, Usuario usuario, Sorteo sorteo,
            TipoJuego tipoJuego, long modoJuego, long loteria, Date fechaVenta) {
        this.id = id;
        this.valorApostado = valorApostado;
        this.numeroApostado = numeroApostado;
        this.usuario = usuario;
        this.sorteo = sorteo;
        this.tipoJuego = tipoJuego;
        this.modoJuego = modoJuego;
        this.loteria = loteria;
        this.fechaVenta = fechaVenta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getValorApostado() {
        return valorApostado;
    }

    public void setValorApostado(long valorApostado) {
        this.valorApostado = valorApostado;
    }

    public long getNumeroApostado() {
        return numeroApostado;
    }

    public void setNumeroApostado(long numeroApostado) {
        this.numeroApostado = numeroApostado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sorteo getSorteo() {
        return sorteo;
    }

    public void setSorteo(Sorteo sorteo) {
        this.sorteo = sorteo;
    }

    public TipoJuego getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(TipoJuego tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    public long getModoJuego() {
        return modoJuego;
    }

    public void setModoJuego(long modoJuego) {
        this.modoJuego = modoJuego;
    }

    public long getLoteria() {
        return loteria;
    }

    public void setLoteria(long loteria) {
        this.loteria = loteria;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

   

   

}
