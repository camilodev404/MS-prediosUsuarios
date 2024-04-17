package com.prediosUsuarios.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "familiares")
public class Familia {

    @Id
    @Column(name = "idfamiliar")
    private String idFamiliar;

    @Column(name = "tipodocumento")
    private String tipoDocumento;

    private String documento;

    @Column(name = "primernombre")
    private String primerNombre;

    @Column(name = "segundonombre")
    private String segundoNombre;

    @Column(name = "primerapellido")
    private String primerApellido;

    @Column(name = "segundoapellido")
    private String segundoApellido;

    @Column(name = "fechanacimiento")
    private Date fechanacimiento;

    private String sexo;

    private String limitantes;

    private String parentesco;

    private String ocupaciones;

    @Column(name = "dependeusuario")
    private Boolean dependeUsuario;

    @Embedded
    private PredioUsuarioId foranea;

    public Familia() {
    }

    public Familia(String idFamiliar, String tipoDocumento, String documento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechanacimiento, String sexo, String limitantes, String parentesco, String ocupaciones, Boolean dependeUsuario, PredioUsuarioId foranea) {
        this.idFamiliar = idFamiliar;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechanacimiento = fechanacimiento;
        this.sexo = sexo;
        this.limitantes = limitantes;
        this.parentesco = parentesco;
        this.ocupaciones = ocupaciones;
        this.dependeUsuario = dependeUsuario;
        this.foranea = foranea;
    }

    public String getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(String idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLimitantes() {
        return limitantes;
    }

    public void setLimitantes(String limitantes) {
        this.limitantes = limitantes;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getOcupaciones() {
        return ocupaciones;
    }

    public void setOcupaciones(String ocupaciones) {
        this.ocupaciones = ocupaciones;
    }

    public Boolean getDependeUsuario() {
        return dependeUsuario;
    }

    public void setDependeUsuario(Boolean dependeUsuario) {
        this.dependeUsuario = dependeUsuario;
    }

    public PredioUsuarioId getForanea() {
        return foranea;
    }

    public void setForanea(PredioUsuarioId foranea) {
        this.foranea = foranea;
    }
}
