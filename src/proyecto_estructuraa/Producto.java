/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuraa;

/**
 *
 * @author bryan
 */
public class Producto {
    String nombre,marca,tamano,upc;

    public Producto(String upc, String nombre, String marca, String tamano) {
        this.upc = upc;
        this.nombre = nombre;
        this.marca = marca;
        this.tamano = tamano;
    }

    public Producto(String upc,String nombre) {
        this.nombre = nombre;
        this.upc = upc;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }
    

    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    
    
}
