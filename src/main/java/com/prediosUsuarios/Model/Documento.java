package com.prediosUsuarios.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "documentos")
public class Documento {

    @Id
    @Column(name = "iddocumento")
    private String idDocumento;

    private String nombre;

    private byte[] documento;

    @Embedded
    private PredioUsuarioId forareados;

    public Documento() {
    }

    public Documento(String idDocumento, String nombre, byte[] documento, PredioUsuarioId forareados) {
        this.idDocumento = idDocumento;
        this.nombre = nombre;
        this.documento = documento;
        this.forareados = forareados;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getDocumento() {
        return documento;
    }

    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }

    public PredioUsuarioId getForareados() {
        return forareados;
    }

    public void setForareados(PredioUsuarioId forareados) {
        this.forareados = forareados;
    }
}
