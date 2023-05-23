/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac.t10;

/**
 *
 * @author gonza
 */
public class Coche extends Vehiculo{
    private String tipoCarroceria;
    private int capacidadPasajeros;

    public Coche(String marca, String modelo, int año, int precio) {
        super(marca, modelo, año, precio);
        this.tipoCarroceria = tipoCarroceria;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    
}
