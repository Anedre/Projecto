package pe.edu.upc.ultimo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ultimo.entities.Ubicacion;
import pe.edu.upc.ultimo.servicesinterfaces.IUbicacionService;


import java.util.List;
@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {
    @Autowired
    private IUbicacionService uService;

    @PostMapping
    public void registrar(@RequestBody Ubicacion u){
        uService.insert(u);
    }

    @GetMapping
    public List<Ubicacion> listar() {return uService.list();}
}
