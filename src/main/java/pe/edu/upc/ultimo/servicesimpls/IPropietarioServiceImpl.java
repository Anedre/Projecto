package pe.edu.upc.ultimo.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ultimo.entities.Propietario;
import pe.edu.upc.ultimo.repositories.IPropietarioRepository;
import pe.edu.upc.ultimo.servicesinterfaces.IPropietarioService;

import java.util.List;
import java.util.Optional;

@Service
public class IPropietarioServiceImpl implements IPropietarioService {
    @Autowired
    private IPropietarioRepository pR;

    @Override
    public void insert(Propietario propietario) {
        pR.save(propietario);
    }

    @Override
    public List<Propietario> list() {
        return pR.findAll();
    }

    @Override
    public Optional<Propietario> ListarId(int idPropietario) {
        return Optional.of(pR.findById(idPropietario).orElse(new Propietario()));
    }

    @Override
    public void delete(int idPropietario){pR.deleteById(idPropietario);}

    @Override
    public List<Propietario> search(String namePropietario) {
        return pR.search(namePropietario);
    }
}