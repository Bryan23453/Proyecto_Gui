/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuraa;

/**
 *
 * @author bryan
 */
public class Factura {
    int numero;
    double isv,subtotal,total;
    Cliente cliente=new Cliente();
    Tienda tienda= new Tienda();

    public Factura() {
    }

    public Factura(int numero, double isv, double subtotal, double total) {
        this.numero = numero;
        this.isv = isv;
        this.subtotal = subtotal;
        this.total = total;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getIsv() {
        return isv;
    }

    public void setIsv(double isv) {
        this.isv = isv;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
    
}
