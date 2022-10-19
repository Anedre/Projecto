package pe.edu.upc.ultimo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ultimo.entities.PadredeFamilia;
import pe.edu.upc.ultimo.entities.Propietario;

import java.util.List;

@Repository
public interface IPadredeFamiliaRepository extends JpaRepository<PadredeFamilia, Integer> {

    @Query("from PadredeFamilia p where p.nombre like %:nombre")
    List<PadredeFamilia> search(@Param("namePropietario")String nombre);
}
