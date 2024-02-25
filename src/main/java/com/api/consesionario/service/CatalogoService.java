package com.api.consesionario.service;

import com.api.consesionario.model.Carro;
import com.api.consesionario.model.Catalogo;
import com.api.consesionario.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CatalogoService {
    @Autowired
    private CatalogoRepository catalogoRepository;

    //ver Catalogo
    public List<Catalogo> getAllCarros(){
        return catalogoRepository.findAll();
    }

    //Crear Catalogo
    public Catalogo createCatalogo(Catalogo catalogo){
        return catalogoRepository.save(catalogo);
    }

    //editar Catalogo
    public Catalogo updateCatalogo(Catalogo catalogo){
        return catalogoRepository.save(catalogo);
    }

    //eliminar Catalogo
    public void deleteCatalogoById(Long id){
        catalogoRepository.deleteById(id);
    }
}


