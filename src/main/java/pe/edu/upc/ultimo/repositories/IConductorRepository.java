package pe.edu.upc.ultimo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ultimo.entities.Conductor;

@Repository
public interface IConductorRepository extends JpaRepository<Conductor, Integer> {
}
