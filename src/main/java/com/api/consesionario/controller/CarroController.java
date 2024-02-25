package com.api.consesionario.controller;

import com.api.consesionario.model.Carro;
import com.api.consesionario.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/concesionario/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    //Get
    @GetMapping
    public List<Carro> listar(){
        return carroService.getAllCarros();
    }

    //Post
    @PostMapping
    public Carro crear(@RequestBody Carro carro){
        return carroService.createCarro(carro);
    }

    //Put
    @PostMapping("editar/{id}")
    public Carro  actualizar(@RequestBody Carro carro, @PathVariable Long id){
        carro.setId_Carro(id);
        return carroService.updateCarro(carro);
    }

    //Delete
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        carroService.deleteCarroById(id);
    }
}
