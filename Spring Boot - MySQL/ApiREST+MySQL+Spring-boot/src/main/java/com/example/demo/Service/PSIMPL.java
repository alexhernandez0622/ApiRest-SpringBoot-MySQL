package com.example.demo.Service;

import com.example.demo.Entity.Persona;
import com.example.demo.Repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements PersonaService{

    /*Nos ayuda a indicar que se inyecte automáticamente una instancia de una dependencia en un compoenente de la aplicación*/
    @Autowired
    private PersonaRepo repo;

    /*Este código nos ayuda a traer todos los datos que estén insertados en la BD*/
    @Override
    public List<Persona> ConsultarPersonas() {

        return (List<Persona>) this.repo.findAll();
    }

    /*Este código nos ayuda a insertar los datos que queremos guardar en la BD*/
    @Override
    public Persona CrearPersona(Persona persona) {
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);
    }

    /*Este código nos ayuda a actualizar los datos que queremos editar en la BD*/
    @Override
    public Persona modificarPersona(Persona persona) {
        return this.repo.save(persona);
    }

    /*Este código nos ayuda a buscar los datos del usuario mediante el ID de la BD*/
    @Override
    public Persona BuscarPersona(int id) {

        return this.repo.findById(id).get();
    }

     /*Este código nos ayuda a eliminar los datos del usuario mediante su ID de la BD
      *
      * Insertamos el método como void, ya que cómo estamos eliminando datos, no nos va a devolver una información*/

    @Override
    public void EliminarPersona(int id) {
        this.repo.deleteById(id);
    }
}
