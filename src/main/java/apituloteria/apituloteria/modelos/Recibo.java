package apituloteria.apituloteria.modelos;

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

@Table(name = "recibo")
public class Recibo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_recibo")
    @GenericGenerator(name = "secuencia_recibo", strategy = "increment")
    @Column(name = "idrecibo")
    private long id;

    @Column(name = "numeroApostado")
    private long numeroApostado;

    @Column(name = "loteria")
    private long loteria;

    /*
     * se hace referencia al forend key desde recibo hacia usuario y se pone de
     * muchos a uno serian muchos recibos a un usuario
     */
    @ManyToOne
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    private Usuario usuario;

    @Column(name = "hash")
    private String hash;

    public Recibo() {
    }

    public Recibo(long id, long numeroApostado, long loteria, Usuario usuario, String hash) {
        this.id = id;
        this.numeroApostado = numeroApostado;
        this.loteria = loteria;
        this.usuario = usuario;
        this.hash = hash;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumeroApostado() {
        return numeroApostado;
    }

    public void setNumeroApostado(long numeroApostado) {
        this.numeroApostado = numeroApostado;
    }

    public long getLoteria() {
        return loteria;
    }

    public void setLoteria(long loteria) {
        this.loteria = loteria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

}
