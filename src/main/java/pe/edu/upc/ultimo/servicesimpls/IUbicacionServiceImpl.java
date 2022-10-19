package pe.edu.upc.ultimo.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ultimo.entities.Ubicacion;
import pe.edu.upc.ultimo.repositories.IUbicacionRepository;
import pe.edu.upc.ultimo.servicesinterfaces.IUbicacionService;


import java.util.List;
@Service
public class IUbicacionServiceImpl implements IUbicacionService {

    @Autowired
    private IUbicacionRepository uR;

    @Override
    public void insert(Ubicacion ubicacion) {
        uR.save(ubicacion);
    }

    @Override
    public List<Ubicacion> list() {
        return uR.findAll();
    }
}
