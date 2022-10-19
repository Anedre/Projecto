package pe.edu.upc.ultimo.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ultimo.entities.Conductor;
import pe.edu.upc.ultimo.repositories.IConductorRepository;
import pe.edu.upc.ultimo.servicesinterfaces.IConductorService;

import java.util.List;
@Service
public class IConductorServiceImpl implements IConductorService {
    @Autowired
    private IConductorRepository cR;

    @Override
    public void insert(Conductor conductor) {
        cR.save(conductor);
    }

    @Override
    public List<Conductor> list() {
        return cR.findAll();
    }
}