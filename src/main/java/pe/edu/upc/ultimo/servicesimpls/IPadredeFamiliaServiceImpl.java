package pe.edu.upc.ultimo.servicesimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ultimo.entities.PadredeFamilia;
import pe.edu.upc.ultimo.repositories.IPadredeFamiliaRepository;
import pe.edu.upc.ultimo.servicesinterfaces.IPadredeFamiliaService;

import java.util.List;
@Service
public class IPadredeFamiliaServiceImpl implements IPadredeFamiliaService {

    @Autowired
    private IPadredeFamiliaRepository pR;

    @Override
    public void insert(PadredeFamilia padredefamilia) {
        pR.save(padredefamilia);
    }

    @Override
    public List<PadredeFamilia> list() {
        return pR.findAll();
    }
}
