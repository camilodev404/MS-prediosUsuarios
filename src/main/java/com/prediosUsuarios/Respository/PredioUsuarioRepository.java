package com.prediosUsuarios.Respository;

import com.prediosUsuarios.Model.PredioUsuario;
import com.prediosUsuarios.Model.PredioUsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredioUsuarioRepository extends JpaRepository<PredioUsuario, PredioUsuarioId> {
}
