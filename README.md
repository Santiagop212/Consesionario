BD http://localhost:8080/h2-console/

get
http://localhost:8080/api/concesionario/carros

POST
http://localhost:8080/api/concesionario/carros
{   
        "ano_Fabricacion": "2024",
        "modelo": "M3",
        "marca": "BMW",
        "tipo_Carroceria": "SPORT",
        "cilindraje": "3000",
        "serie": "TOP",
    "catalogo": [
        {
            "cantidad": "2",
            "precio": "150000000",
            "tipo_Pago": "EFECTIVO"
        }
    ]
}

