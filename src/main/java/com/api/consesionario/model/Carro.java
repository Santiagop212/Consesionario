package com.api.consesionario.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity // para que la calse sea una entidad
@Data //definir la calse como un flujo de información la cual ayuda a crear los campos mas facil en bd
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Carro;

    private String Marca;
    private String Modelo;
    private String Serie;
    private String Ano_Fabricacion;
    private String Cilindraje;
    private String Tipo_Carroceria;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Catalogo> catalogo = new ArrayList<>();

}
