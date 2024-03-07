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
    public Long Id_Carro;

    public String Marca;
    public String Modelo;
    public String Serie;
    public String Ano_Fabricacion;
    public String Cilindraje;
    public String Tipo_Carroceria;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Catalogo> catalogo = new ArrayList<>();


}
