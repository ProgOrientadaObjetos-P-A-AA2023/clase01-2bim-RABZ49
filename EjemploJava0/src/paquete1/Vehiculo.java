/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA I
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String tip, String matri, double val) {
        tipo = tip;
        matricula = matri;
        valor = val;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String x) {
        tipo = x;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public void establecerMatricula(String x) {
        matricula = x;
    }

    public double obtenerValor() {
        return valor;
    }

    public void establecerValor(double x) {
        valor = x;
    }
    
    
    
    
}
