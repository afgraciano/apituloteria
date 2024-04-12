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

@Table(name="apuesta")
public class Apuesta {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_apuesta")
    @GenericGenerator(name = "secuencia_apuesta", strategy = "increment")
    
    @Column(name="idapuesta")
    private long id;

    @Column(name="valorApostado")
    private long valorApostado;

    @Column(name="numeroApostado")
    private long numeroApostado;

    @Column(name="modoJuego")
    private long modoJuego;

    @Column(name="loteria")
    private long loteria;

    @Column(name="fechaVenta")
    private Date fechaVenta;
    
    @Column(name="usuario_idusuario")
    private long usuario_idusuario;

    @Column(name="usuario_idsorteo")
    private long usuario_idsorteo;

    public Apuesta() {
    }

    public Apuesta(long id, long valorApostado, long numeroApostado, long modoJuego, long loteria, Date fechaVenta, long usuario_idusuario, long usuario_idsorteo) {
        this.id = id;
        this.valorApostado = valorApostado;
        this.numeroApostado = numeroApostado;
        this.modoJuego = modoJuego;
        this.loteria = loteria;
        this.fechaVenta = fechaVenta;
        this.usuario_idusuario = usuario_idusuario;
        this.usuario_idsorteo = usuario_idsorteo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getvalorApostado() {
        return valorApostado;
    }

    public void setvalorApostado(long valorApostado) {
        this.valorApostado = valorApostado;
    }

    public long getnumeroApostado() {
        return numeroApostado;
    }

    public void setnumeroApostado(long numeroApostado) {
        this.numeroApostado = numeroApostado;
    }

    public long getmodoJuego() {
        return modoJuego;
    }

    public void setmodoJuego(long modoJuego) {
        this.modoJuego = modoJuego;
    }

    public long getloteria() {
        return loteria;
    }

    public void setloteria(long loteria) {
        this.loteria = loteria;
    }

    public Date getfechaVenta() {
        return fechaVenta;
    }

    public void setfechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }



    public long getusuario_idusuario() {
        return usuario_idusuario;
    }

    public void setusuario_idusuario(long usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }
   

    public long getusuario_idsorteo() {
        return usuario_idsorteo;
    }

    public void setusuario_idsorteo(long usuario_idsorteo) {
        this.usuario_idsorteo = usuario_idsorteo;
    }

}
