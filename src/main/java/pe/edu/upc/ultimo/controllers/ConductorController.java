package pe.edu.upc.ultimo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ultimo.entities.Conductor;
import pe.edu.upc.ultimo.servicesinterfaces.IConductorService;


import java.util.List;
@RestController
@RequestMapping("/conductores")
public class ConductorController {

    @Autowired
    private IConductorService cService;

    @PostMapping
    public void registrar(@RequestBody Conductor c){
        cService.insert(c);
    }

    @GetMapping
    public List<Conductor> listar() {return cService.list();}
}
