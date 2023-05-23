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

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
    
    
}
