package pe.edu.upc.ultimo.servicesinterfaces;

import pe.edu.upc.ultimo.entities.PadredeFamilia;

import java.util.List;

public interface IPadredeFamiliaService {
    public void insert(PadredeFamilia padredefamilia);
    List<PadredeFamilia>list();
}
