package pe.edu.upc.ultimo.servicesinterfaces;

import pe.edu.upc.ultimo.entities.Conductor;

import java.util.List;

public interface IConductorService {
    public void insert(Conductor conductor);

    List<Conductor>list();
}