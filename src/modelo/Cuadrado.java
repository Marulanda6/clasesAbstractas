/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Cuadrado extends FigurasGeometricas {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Getter y Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Implementación del cálculo del área
    @Override
    double calcularArea() {
        return lado * lado; // Fórmula del área del cuadrado: lado^2
    }

    // Implementación del cálculo del perímetro
    @Override
    double calcularParametros() { // Podrías renombrar a calcularPerimetro
        return 4 * lado; // Fórmula del perímetro del cuadrado: 4 * lado
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
               "lado=" + lado +
               ", área=" + calcularArea() +
               ", perímetro=" + calcularParametros() +
               '}';
    }
}
