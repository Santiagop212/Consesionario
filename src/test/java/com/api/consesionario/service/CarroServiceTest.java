package com.api.consesionario.service;

import com.api.consesionario.model.Carro;
import com.api.consesionario.repository.CarroRepository;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class CarroServiceTest {

    @Mock
    private CarroRepository carroRepository;

    @InjectMocks
    private CarroService carroService;

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
    void getAllCarros() {
        when(carroRepository.findAll()).thenReturn(Arrays.asList(carro));
        assertNotNull(carroService.getAllCarros());

    }

    @Test
    void createCarro(){
        when(carroRepository.save(any(Carro.class))).thenReturn((carro));
        assertNotNull(carroService.createCarro(new Carro()));
    }





}

