package com.api.consesionario.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Data
public class Catalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    private int Cantidad;
    private int Precio;
    private String Tipo_Pago;
    private String Marca;


}
