package pe.edu.upc.ultimo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ultimo.entities.PadredeFamilia;
import pe.edu.upc.ultimo.servicesinterfaces.IPadredeFamiliaService;

import java.util.List;
@RestController
@RequestMapping("/padresdefamilia")
public class PadredeFamiliaController {
    @Autowired
    private IPadredeFamiliaService pService;

    @PostMapping
    public void registrar(@RequestBody PadredeFamilia p){
        pService.insert(p);
    }

    @GetMapping
    public List<PadredeFamilia> listar() {return pService.list();}
}
