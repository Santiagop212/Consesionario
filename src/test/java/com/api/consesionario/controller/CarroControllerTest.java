package com.api.consesionario.controller;

import com.api.consesionario.model.Carro;
import com.api.consesionario.repository.CarroRepository;
import com.api.consesionario.service.CarroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class CarroControllerTest {
    @Mock
    private CarroRepository carroRepository;

    @InjectMocks
    private CarroService carroService;

    @InjectMocks
    private CarroController carroController;

    private Carro carro;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        carro = new Carro();
        //carro.setId_Carro(new Long(value));
        carro.setMarca("Mercedes");
        carro.setModelo("Clase S");
        carro.setSerie("W223");
        carro.setAno_Fabricacion("2023");
        carro.setCilindraje("3.0L");
        carro.setTipo_Carroceria("Sedán de lujo");

    }

    @Test
    void listar() {
        when(carroController.listar()).thenReturn(Arrays.asList(carro));
        assertNotNull(carroService.getAllCarros());

    }


    @Test
    void eliminar(){
        Long id = 1L;
        Mockito.doNothing().when(carroController).eliminar(id);

        // **Ejecución:**
        carroService.deleteCarroById(id);

        // **Verificación:**
        Mockito.verify(carroController).eliminar(id);
    }

}