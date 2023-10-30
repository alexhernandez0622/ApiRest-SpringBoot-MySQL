package com.example.demo.Repository;

import com.example.demo.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Aquí estamos creando un método interface que nos permitira crear el Crud de los de usuarios
/*Los extends se usan para traer los datos de las clases
 /* Los implements se usan para traer los datos de las interfaces*/
@Repository
public interface PersonaRepo extends CrudRepository<Persona,Integer> {

}
