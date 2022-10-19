package pe.edu.upc.ultimo.servicesinterfaces;

import pe.edu.upc.ultimo.entities.Propietario;

import java.util.List;
import java.util.Optional;

public interface IPropietarioService {
    public void insert(Propietario propietario);
    List<Propietario>list();

    public Optional<Propietario> ListarId(int idPropietario);
   public void delete(int idPropietario);

   List<Propietario>search(String namePropietario);
}
