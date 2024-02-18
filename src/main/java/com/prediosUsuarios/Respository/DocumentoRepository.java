package com.prediosUsuarios.Respository;

import com.prediosUsuarios.Model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, String> {
}
