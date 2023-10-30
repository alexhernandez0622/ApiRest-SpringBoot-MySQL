package com.example.demo.Service;

import com.example.demo.Entity.Persona;

import java.util.List;

public interface PersonaService {

    //Vamos a crear los métodos para realizar las peticiones en mi CRUD

    //La colecction List nos ayuda a crear una lista (PETICIÓN GET)
    public List<Persona> ConsultarPersonas();
    //Vamos a realizar el método para realizar la PETICIÓN POST
    public Persona CrearPersona(Persona persona);
    //Vamos a realizar el método para realizar la PETICIÓN PUT
    public Persona modificarPersona(Persona persona);
    //Vamos a realizar el método para buscar las personas
    public Persona BuscarPersona(int id);
    //Vamos a realizar el método para realizar la PETICIÓN DELETE
    //Le colocamos el método void para que no nos devuelva un valor
    public void EliminarPersona(int id);

}
