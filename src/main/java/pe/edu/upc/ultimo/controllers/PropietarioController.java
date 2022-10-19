package pe.edu.upc.ultimo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ultimo.entities.Propietario;
import pe.edu.upc.ultimo.servicesinterfaces.IPropietarioService;

import java.util.List;
@RestController
@RequestMapping("/propietarios")
public class PropietarioController {
    @Autowired
    private IPropietarioService pService;

    @PostMapping
    public void registrar(@RequestBody Propietario p) {
        pService.insert(p);
    }
    @GetMapping
    public List<Propietario> listar() {
        return pService.list();
    }
    @DeleteMapping
    public void eliminate(@PathVariable("id") Integer id){
        pService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Propietario propietario){
        pService.insert(propietario);
    }
    @PostMapping("/buscar")
    public List<Propietario> buscar(@RequestBody Propietario propietario){
        List<Propietario> lista;
        propietario.setNamePropietario(propietario.getNamePropietario());
        lista=pService.search(propietario.getNamePropietario());
        return lista;
    }
}

