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
public class Administradores extends Empleado {
    
    private String labor;

    public Administradores(String labor, int ID, String nombre) {
        this.labor = labor;
        this.ID = ID;
        this.nombre = nombre;
    }
    
    

    @Override
    public double obtenerSalario() {
        return 100.0;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
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
