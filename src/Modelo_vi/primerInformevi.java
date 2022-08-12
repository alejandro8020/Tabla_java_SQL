/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_vi;

/**
 *
 * @author Alejandro
 */
public class primerInformevi {
    private int id;
    private String nombre;
    private String apellido;
    private String ciudadRes;

    /**
     * @return the ciudadRes
     */
    public String getCiudadRes() {
        return ciudadRes;
    }

    /**
     * @param ciudadRes the ciudadRes to set
     */
    public void setCiudadRes(String ciudadRes) {
        this.ciudadRes = ciudadRes;
    }
    
   

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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%3d %-25s %-20s %-15s", id, nombre, apellido, ciudadRes);
    }

   
    
  
            
}
