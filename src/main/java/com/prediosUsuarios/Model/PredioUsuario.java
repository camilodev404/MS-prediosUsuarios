package com.prediosUsuarios.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "predios_usuarios")
public class PredioUsuario {

    @EmbeddedId
    private PredioUsuarioId id;

    @Column(name = "derechosobrepredio")
    private String derechoSobrePredio;

    @Column(name = "tienedatos")
    private Boolean tieneDatos;

    private String nombre;

    private String ubicacion;

    private String telefono;

    @Column(name = "legalizarjuridica")
    private Boolean legalizarJuridica;

    @Column(name = "iniciotramite")
    private Boolean inicioTramite;

    private String entidad;

    @Column(name = "fechasolicitud")
    private Date fechaSolicitud;

    @Column(name = "numsolicitud")
    private String numSolicitud;

    @Column(name = "habitaexplota")
    private Boolean habitaExplota;

    @Column(name = "fechahabitaexplota")
    private Date fechaHabitaExplota;

    private String explotaciones;

    @Column(name = "explotanotros")
    private Boolean explotanOtros;

    @Column(name = "derechoexplotacion")
    private String derechoExplotacion;

    public PredioUsuario() {
    }

    public PredioUsuario(PredioUsuarioId id, String derechoSobrePredio, Boolean tieneDatos, String nombre, String ubicacion, String telefono, Boolean legalizarJuridica, Boolean inicioTramite, String entidad, Date fechaSolicitud, String numSolicitud, Boolean habitaExplota, Date fechaHabitaExplota, String explotaciones, Boolean explotanOtros, String derechoExplotacion) {
        this.id = id;
        this.derechoSobrePredio = derechoSobrePredio;
        this.tieneDatos = tieneDatos;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.legalizarJuridica = legalizarJuridica;
        this.inicioTramite = inicioTramite;
        this.entidad = entidad;
        this.fechaSolicitud = fechaSolicitud;
        this.numSolicitud = numSolicitud;
        this.habitaExplota = habitaExplota;
        this.fechaHabitaExplota = fechaHabitaExplota;
        this.explotaciones = explotaciones;
        this.explotanOtros = explotanOtros;
        this.derechoExplotacion = derechoExplotacion;
    }

    public PredioUsuarioId getId() {
        return id;
    }

    public void setId(PredioUsuarioId id) {
        this.id = id;
    }

    public String getDerechoSobrePredio() {
        return derechoSobrePredio;
    }

    public void setDerechoSobrePredio(String derechoSobrePredio) {
        this.derechoSobrePredio = derechoSobrePredio;
    }

    public Boolean getTieneDatos() {
        return tieneDatos;
    }

    public void setTieneDatos(Boolean tieneDatos) {
        this.tieneDatos = tieneDatos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getLegalizarJuridica() {
        return legalizarJuridica;
    }

    public void setLegalizarJuridica(Boolean legalizarJuridica) {
        this.legalizarJuridica = legalizarJuridica;
    }

    public Boolean getInicioTramite() {
        return inicioTramite;
    }

    public void setInicioTramite(Boolean inicioTramite) {
        this.inicioTramite = inicioTramite;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getNumSolicitud() {
        return numSolicitud;
    }

    public void setNumSolicitud(String numSolicitud) {
        this.numSolicitud = numSolicitud;
    }

    public Boolean getHabitaExplota() {
        return habitaExplota;
    }

    public void setHabitaExplota(Boolean habitaExplota) {
        this.habitaExplota = habitaExplota;
    }

    public Date getFechaHabitaExplota() {
        return fechaHabitaExplota;
    }

    public void setFechaHabitaExplota(Date fechaHabitaExplota) {
        this.fechaHabitaExplota = fechaHabitaExplota;
    }

    public String getExplotaciones() {
        return explotaciones;
    }

    public void setExplotaciones(String explotaciones) {
        this.explotaciones = explotaciones;
    }

    public Boolean getExplotanOtros() {
        return explotanOtros;
    }

    public void setExplotanOtros(Boolean explotanOtros) {
        this.explotanOtros = explotanOtros;
    }

    public String getDerechoExplotacion() {
        return derechoExplotacion;
    }

    public void setDerechoExplotacion(String derechoExplotacion) {
        this.derechoExplotacion = derechoExplotacion;
    }
}
