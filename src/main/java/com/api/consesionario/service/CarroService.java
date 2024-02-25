package com.api.consesionario.service;


import com.api.consesionario.model.Carro;
import com.api.consesionario.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    //ver carros
    public List<Carro> getAllCarros(){
        return carroRepository.findAll();
    }

    //Crear carro
    public Carro createCarro(Carro carro){
        return carroRepository.save(carro);
    }

    //editar carro
    public Carro updateCarro(Carro carro){
        return carroRepository.save(carro);
    }

    //eliminar
    public void deleteCarroById(Long id){
        carroRepository.deleteById(id);
    }


}
