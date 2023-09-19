package proyecto_estructuraa;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Tienda {
    int id;
    String nombre;
    Date fecha;
    public Tienda(int id,String nombre,Date fecha){
        this.fecha=fecha;
        this.id=id;
        this.nombre=nombre;
    }

    public Tienda() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
