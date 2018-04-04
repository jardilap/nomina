/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author ESTUDIANTE
 */
public class Programadores extends Empleado{
    protected String lenguaje;

    public Programadores(double salario, int ID, String lenguaje, String nombre) {
        this.salario = salario;
        this.ID = ID;
        this.lenguaje = lenguaje;
        this.nombre = nombre;
    }
    
    

    @Override
    public double obtenerSalario() {
        if("Java".equals(lenguaje)){
            salario*=1.1;
        }
        return salario; 
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
