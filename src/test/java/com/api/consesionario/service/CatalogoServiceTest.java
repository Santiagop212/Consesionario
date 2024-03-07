package com.api.consesionario.service;

import com.api.consesionario.model.Carro;
import com.api.consesionario.model.Catalogo;
import com.api.consesionario.repository.CatalogoRepository;
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

class CatalogoServiceTest {

    @Mock
    private CatalogoRepository catalogoRepository;

    @InjectMocks
    private CatalogoService catalogoService;

    private Catalogo catalogo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        catalogo = new Catalogo();
        catalogo.setCantidad(1);
        catalogo.setPrecio(120000000);
        catalogo.setTipo_Pago("tarjeta");
        catalogo.setMarca("audi");
    }

    @Test
    void getAllCarros() {
        when(catalogoRepository.findAll()).thenReturn(Arrays.asList(catalogo));
        assertNotNull(catalogoService.getAllCarros());
    }

    @Test
    void createCatalogo(){
        when(catalogoRepository.save(any(Catalogo.class))).thenReturn((catalogo));
        assertNotNull(catalogoService.createCatalogo(new Catalogo()));
    }

    @Test
    void updateCatalogo(){
        when(catalogoRepository.save(any(Catalogo.class))).thenReturn((catalogo));
        assertNotNull(catalogoService.updateCatalogo(new Catalogo()));
    }

    @Test
    void deleteCatalogoById(){
        Long id = 1L;
        Mockito.doNothing().when(catalogoRepository).deleteById(id);

        // **Ejecución:**
        catalogoService.deleteCatalogoById(id);

        // **Verificación:**
        Mockito.verify(catalogoRepository).deleteById(id);
    }
}