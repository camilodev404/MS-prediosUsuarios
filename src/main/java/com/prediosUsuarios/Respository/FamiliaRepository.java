package com.prediosUsuarios.Respository;

import com.prediosUsuarios.Model.Familia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamiliaRepository extends JpaRepository<Familia, String> {

    @Query("SELECT s FROM Familia s WHERE s.foranea.cedula = :cedula AND s.foranea.idPredio = :idPredio")
    List<Familia> findByCedulaAndIdPredio(@Param("cedula") String cedula, @Param("idPredio") String idPredio);


}
