package com.prediosUsuarios.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PredioUsuarioId implements Serializable {

    @Column(name = "idpredio")
    private String idPredio;

    private String cedula;

    public PredioUsuarioId() {
    }

    public PredioUsuarioId(String idPredio, String cedula) {
        this.idPredio = idPredio;
        this.cedula = cedula;
    }

    public String getIdPredio() {
        return idPredio;
    }

    public void setIdPredio(String idPredio) {
        this.idPredio = idPredio;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
