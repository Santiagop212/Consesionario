BD http://localhost:8080/h2-console/
select * from carro inner join Catalogo where carro.marca = catalogo.marca;
GET
http://localhost:8080/api/concesionario/carros

POST
http://localhost:8080/api/concesionario/carros

DELETE
http://localhost:8080/api/concesionario/carros/eliminar/2

UPDATE
http://localhost:8080/api/concesionario/carros/editar/1

{   
        "ano_Fabricacion": "2023",
        "modelo": "Camaro",
        "marca": "Chevrolet",
        "tipo_Carroceria": "Coupé",
        "cilindraje": "6.2L V8",
        "serie": "ZL1",
        "catalogo": [
        {
            "cantidad": "2",
            "precio": "150000000",
            "tipo_Pago": "EFECTIVO",
            "marca": "Chevrolet"
        },
        {
            "cantidad": "1",
            "precio": "150000000",
            "tipo_Pago": "TARJETA",
            "marca": "Chevrolet"
        }
    ]
    
}
{   
        "ano_Fabricacion": "2022",
        "modelo": "Mustang",
        "marca": "Ford",
        "tipo_Carroceria": "Coupé",
        "cilindraje": "5.2L V8",
        "serie": "GT500",
        "catalogo": [
        {
            "cantidad": "10",
            "precio": "170000000",
            "tipo_Pago": "EFECTIVO",
            "marca": "Ford"
        },
        {
            "cantidad": "1",
            "precio": "150000000",
            "tipo_Pago": "TARJETA",
            "marca": "Ford"
        }
    ]
    
}
{   
        "ano_Fabricacion": "2014",
        "modelo": "Huracán",
        "marca": "Lamborghini",
        "tipo_Carroceria": "Coupé",
        "cilindraje": "5.2L V10",
        "serie": "LP610-4",
        "catalogo": [
        {
            "cantidad": "10",
            "precio": "570000000",
            "tipo_Pago": "EFECTIVO",
            "marca": "Lamborghini"
        },
        {
            "cantidad": "1",
            "precio": "510000000",
            "tipo_Pago": "TARJETA",
            "marca": "Lamborghini"
        }
    ]
    
}


