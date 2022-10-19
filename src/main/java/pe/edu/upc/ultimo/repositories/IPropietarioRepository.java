package pe.edu.upc.ultimo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ultimo.entities.Propietario;

import java.util.List;

@Repository
public interface IPropietarioRepository  extends JpaRepository<Propietario,Integer> {
    //JPA-JPQL language
    @Query("from Propietario p where p.namePropietario like %:namePropietario")
    List<Propietario> search(@Param("namePropietario")String namePropietario);



}