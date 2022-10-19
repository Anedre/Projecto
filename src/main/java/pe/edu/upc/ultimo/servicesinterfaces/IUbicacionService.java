package pe.edu.upc.ultimo.servicesinterfaces;

import pe.edu.upc.ultimo.entities.Ubicacion;

import java.util.List;

public interface IUbicacionService {
    public void insert(Ubicacion ubicacion);

    List<Ubicacion>list();
}
