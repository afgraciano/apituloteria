package apituloteria.apituloteria.modelos;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    @Column(name = "usuario_idusuario")
    private long usuario_idusuario;

    public Recibo() {
    }

    public Recibo(long id, long numeroApostado, long loteria, String hash, long usuario_idusuario) {
        this.id = id;
        this.numeroApostado = numeroApostado;
        this.loteria = loteria;
        this.hash = hash;
        this.usuario_idusuario = usuario_idusuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getnumeroApostado() {
        return numeroApostado;
    }

    public void setnumeroApostado(long numeroApostado) {
        this.numeroApostado = numeroApostado;
    }

    public long getloteria() {
        return loteria;
    }

    public void setloteria(long loteria) {
        this.loteria = loteria;
    }

    public String gethash() {
        return hash;
    }

    public void sethash(String hash) {
        this.hash = hash;
    }

    public long getusuario_idusuario() {
        return usuario_idusuario;
    }

    public void setusuario_idusuario(long usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }

}
