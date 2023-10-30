package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Humano")
public class Persona {
    //Id es una anotación haciendo referencia de que el dato que se ingresará es para el campo ID
    @Id
    // Genera  el tipo de dato que la cuál estamos inicializando.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Seleccionando la columna id, que es la llave primaria de nuestro proyecto
    @Column(name = "id")
    // Especificamos el tipo dato que estará recibiendo el ID
    private int id;

    /*Vamos a seleccionar cada una de las columnas de nuestra base de datos y le asignamos el tipo de dato que recibirá*/
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "edad")
    private int edad;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "clave")
    private int clave;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
}
