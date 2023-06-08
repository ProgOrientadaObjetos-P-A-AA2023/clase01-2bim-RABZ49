/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Edificio {
    private String nombre;
    private double costo;
    private double costoPredio;
    
    public Edificio(String m){
        nombre = m;
    }
    
    public void establecerNombre(String m){
        nombre = m;
    }

    public void establecerCostos(double m){
        costo = m;
    }
    
    public String obtenerNombre(){
        return nombre;
    }    
   
    public double obtenerCosto(){
        return costo;
    }

    public double obtenerCostoPredio() {
        return costoPredio;
    }

    public void establecerCostoPredio() {
        costoPredio = costo * 0.002;
    }
    
    

    @Override
    public String toString(){
        String cadena = String.format("Edificio de nombre %s\n"
                + "\tEl costo del edificio es: %.2f\n"
                + "\tEl costo del predio del edificio es: %.2f\n", 
                nombre,
                obtenerCosto(),
                costoPredio);
        return cadena;
    }
}
