/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public abstract class FigurasGeometricas {
    private String nombre;
    private double area;
    private double perimetro;
    private final double PI=3.1416;
    
    //contructor vacio

    public FigurasGeometricas() {
    }
//contructor con argumentos 
    public FigurasGeometricas(String nombre, double area, double perimetro) {
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getPI() {
        return PI;
    }

    //Metodo implemetado 

    @Override
    public String toString() {
        return  "Datos de la figura geometrica\n"+
                "Nombre de la figura: "+getNombre()+"\n"+
                "Area de la figura: "+getArea()+"\n"+
                "Perimetro de la figura: "+getPerimetro();
    }
    
    //metodos abtractos 
    abstract double calcularArea();
    abstract double calcularParametros();
            
    
    
    
}
