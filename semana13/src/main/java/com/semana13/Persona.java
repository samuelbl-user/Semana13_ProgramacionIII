package com.semana13;

/**
 * Clase que representa una persona con atributos básicos.
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    /**
     * Constructor de la clase Persona con argumentos.
     * @param nombre el nombre de la persona
     * @param apellidos los apellidos de la persona
     * @param edad la edad de la persona
     * @param email el correo electrónico de la persona
     */
    public Persona(String nombre, String apellidos, int edad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Getter de email.
     * @return el email de la persona
     */
    public String getEmail() {
        return email;
    }
    
}
