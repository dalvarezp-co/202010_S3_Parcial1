/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.pokemon.entities;

import co.edu.uniandes.csw.pokemon.constants.PokemonType;

/**
 *
 * @author David Álvarez Polo
 */
public class PokemonEntity {
    
    private String nombre;
    private String descripcion; 
    private double peso;
    private double altura;
    private PokemonType tipo;
    private String tipoDebilidad;
    private Long id;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the tipo
     */
    public PokemonType getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(PokemonType tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tipoDebilidad
     */
    public String getTipoDebilidad() {
        return tipoDebilidad;
    }

    /**
     * @param tipoDebilidad the tipoDebilidad to set
     */
    public void setTipoDebilidad(String tipoDebilidad) {
        this.tipoDebilidad = tipoDebilidad;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
}
